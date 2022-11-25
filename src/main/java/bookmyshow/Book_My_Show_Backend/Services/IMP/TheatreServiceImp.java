package bookmyshow.Book_My_Show_Backend.Services.IMP;

import bookmyshow.Book_My_Show_Backend.Convertors.TheaterConvetor;
import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.TheatreReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TheatreRespDto;
import bookmyshow.Book_My_Show_Backend.ENUM.SeatType;
import bookmyshow.Book_My_Show_Backend.ENUM.TheatreType;
import bookmyshow.Book_My_Show_Backend.Models.TheatreEntity;
import bookmyshow.Book_My_Show_Backend.Models.TheatreSeatEntity;
import bookmyshow.Book_My_Show_Backend.Repository.TheatreRepository;
import bookmyshow.Book_My_Show_Backend.Repository.TheatreSeatRepository;
import bookmyshow.Book_My_Show_Backend.Repository.UserRepositry;
import bookmyshow.Book_My_Show_Backend.Services.TheatreServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class TheatreServiceImp implements TheatreServices {


    @Autowired
    TheatreSeatRepository theatreSeatRepository;
    @Autowired
    TheatreRepository theatreRepository;

    @Override
    public TheatreRespDto addTheatre(TheatreReqDto theratreDto) {

        TheatreEntity theatreEntity =TheaterConvetor.convertorDtoToEntity(theratreDto);

        // create seats
        List<TheatreSeatEntity> seats =CreateTheatreseats();

        //set the theartd for all seats
theatreEntity.setSeats(seats);

theatreEntity.setShow(null);


        for(TheatreSeatEntity theatreSeatEntity:seats){
            theatreSeatEntity.setTheatre(theatreEntity);
        }


        TheatreType  type  =theratreDto.getType(); // het theatre type for theaRqDto
        String sttype =type.toString(); // get convert into string

        // set theatre type
        if(sttype.equals("SINGLE")){
            theatreEntity.setType(TheatreType.SINGLE);
        }
        else{
            theatreEntity.setType(TheatreType.MULTIPLEX);
        }

    log.info(" The theatre Entity is"+theatreEntity);

        theatreEntity=theatreRepository.save(theatreEntity);

        TheatreRespDto theatreRespDto =TheaterConvetor.convetorEntitytoDto(theatreEntity);
        return theatreRespDto;
    }

    @Override
    public TheatreRespDto getTheatre(int id) {

        TheatreEntity theatreEntity = theatreRepository.findById(id).get();

       TheatreRespDto theatreRespDto= TheaterConvetor.convetorEntitytoDto(theatreEntity);

        return theatreRespDto;
    }


    List<TheatreSeatEntity>  CreateTheatreseats(){


        List<TheatreSeatEntity> seats =new ArrayList<>();

        seats.add(getTheatreSeat("1A",100, SeatType.CLASSIC));
        seats.add(getTheatreSeat("1B",100, SeatType.CLASSIC));
        seats.add(getTheatreSeat("1C",100, SeatType.CLASSIC));
        seats.add(getTheatreSeat("1D",100, SeatType.CLASSIC));
        seats.add(getTheatreSeat("1E",100, SeatType.CLASSIC));
        seats.add(getTheatreSeat("1F",100, SeatType.CLASSIC));

        seats.add(getTheatreSeat("2A",110,SeatType.PREMIUM));
        seats.add(getTheatreSeat("2B",110,SeatType.PREMIUM));
        seats.add(getTheatreSeat("2C",110,SeatType.PREMIUM));
        seats.add(getTheatreSeat("2D",110,SeatType.PREMIUM));
        seats.add(getTheatreSeat("2E",110,SeatType.PREMIUM));
        seats.add(getTheatreSeat("2F",110,SeatType.PREMIUM));

        //save in databade
        theatreSeatRepository.saveAll(seats);

        return seats;
    }

    TheatreSeatEntity getTheatreSeat(String seatName, int rate, SeatType seatType) {
        return TheatreSeatEntity.builder().seatNumber(seatName).rate(rate).seatType(seatType).build();
    }


    public List<TheatreEntity> getAllTheatre() {
     return  theatreRepository.findAll();
    }
}
