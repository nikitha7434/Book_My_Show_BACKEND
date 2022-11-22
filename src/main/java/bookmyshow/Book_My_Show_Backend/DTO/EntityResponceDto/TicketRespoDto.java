package bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketRespoDto {

    int id;
    String alloted_seats;
    double amount;

}
