package bookmyshow.Book_My_Show_Backend.DTO;

import bookmyshow.Book_My_Show_Backend.ENUM.SeatType;

import java.util.Set;

public class BookTicketDto {
    Set<String> requestedSeats;
    int id;
    int show_id;

    SeatType seatType;

}
