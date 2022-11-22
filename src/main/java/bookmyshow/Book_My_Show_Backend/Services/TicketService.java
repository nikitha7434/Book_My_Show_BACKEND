package bookmyshow.Book_My_Show_Backend.Services;

import bookmyshow.Book_My_Show_Backend.DTO.BookTicketReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TicketRespoDto;
import bookmyshow.Book_My_Show_Backend.DTO.TicketDto;

public interface TicketService {
    TicketRespoDto getTicket(int id);
    TicketRespoDto bookTicket(BookTicketReqDto bookTicketReqDto);

}
