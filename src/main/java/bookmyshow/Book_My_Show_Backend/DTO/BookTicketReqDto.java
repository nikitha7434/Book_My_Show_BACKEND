package bookmyshow.Book_My_Show_Backend.DTO;

import bookmyshow.Book_My_Show_Backend.ENUM.SeatType;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
@Data
@Builder
public class BookTicketReqDto {

    Set<String> requestedSeats; //user is given


    int Show_id; // For each show i want to book ticket :showentity
     int id; // user id who is booking the tice :userEntity
    SeatType seatType; // theatreseatentity

}
