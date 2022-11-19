package bookmyshow.Book_My_Show_Backend.Services;

import bookmyshow.Book_My_Show_Backend.DTO.BookTicketReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.TicketDto;

public interface TicketService {
    TicketDto getTicket(int id);
    TicketDto bookTicket(BookTicketReqDto bookTicketReqDto);

}
