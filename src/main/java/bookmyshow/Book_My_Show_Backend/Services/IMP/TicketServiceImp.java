package bookmyshow.Book_My_Show_Backend.Services.IMP;

import bookmyshow.Book_My_Show_Backend.Convertors.Ticketconvertor;
import bookmyshow.Book_My_Show_Backend.DTO.BookTicketReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.TicketDto;
import bookmyshow.Book_My_Show_Backend.Models.ShowEntity;
import bookmyshow.Book_My_Show_Backend.Models.TicketEntity;
import bookmyshow.Book_My_Show_Backend.Models.UserEntity;
import bookmyshow.Book_My_Show_Backend.Models.showSeatEntity;
import bookmyshow.Book_My_Show_Backend.Repository.TicketRepository;
import bookmyshow.Book_My_Show_Backend.Repository.UserRepositry;
import bookmyshow.Book_My_Show_Backend.Repository.showRepository;
import bookmyshow.Book_My_Show_Backend.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class TicketServiceImp implements TicketService {

    @Autowired
    UserRepositry userRepositry;
    @Autowired
    showRepository showRepository;
    @Autowired
    TicketRepository ticketRepository;
    @Override
    public TicketDto getTicket(int id) {

        return null;
    }
// pending
    @Override
    public TicketDto bookTicket(BookTicketReqDto bookTicketReqDto) {
        UserEntity userEntity = userRepositry.findById(bookTicketReqDto.getId()).get();
        ShowEntity showEntity =showRepository.findById(bookTicketReqDto.getShow_id()).get();
        Set<String> requestSeats =bookTicketReqDto.getRequestedSeats();
        List<showSeatEntity>  showSeatsEntities =showEntity.getTheatreSeat();

        //step 1

        // option 1
        List<showSeatEntity> bookedSeats =showSeatsEntities
                .stream()
        .filter(seats -> seats.getSeatType().equals(bookTicketReqDto.getSeatType()) && !seats.isIsbooked()
        && requestSeats.contains(seats.getSeateNumber()))
                .collect(Collectors.toList());

        //option 2


        //step 2
        TicketEntity ticketEntity=TicketEntity.builder()
                .user(userEntity)
                .show(showEntity)
                .seats(bookedSeats).build();

        // step 3
        double amount=0;

        for (showSeatEntity showSeatEntity:bookedSeats){
            showSeatEntity.setIsbooked(true);
            showSeatEntity.setBookedAt(new Date());
            showSeatEntity.setTicket(ticketEntity);
        amount=amount+showSeatEntity.getRate();
        }
        ticketEntity.setAllowcted_seats(String.valueOf(bookedSeats));
        ticketEntity.setAmount(amount);


        // connect int show and user

        showEntity.getTicket().add(ticketEntity);

        // add th ticket int the ticket list of the user
        userEntity.getListofTicket().add(ticketEntity);
        ticketEntity =ticketRepository.save(ticketEntity);

        return Ticketconvertor.convetorEntityToDTo(ticketEntity);
    }


}
