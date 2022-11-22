package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TicketRespoDto;
import bookmyshow.Book_My_Show_Backend.DTO.TicketDto;
import bookmyshow.Book_My_Show_Backend.Models.TicketEntity;

public class Ticketconvertor {

    public static TicketRespoDto convetorEntityToDTo(TicketEntity ticketEntity) {
        return TicketRespoDto.builder().id((int)ticketEntity.getId())
                .amount(ticketEntity.getAmount())
                .alloted_seats(ticketEntity.getAllowcted_seats())
                .build();
    }
}
