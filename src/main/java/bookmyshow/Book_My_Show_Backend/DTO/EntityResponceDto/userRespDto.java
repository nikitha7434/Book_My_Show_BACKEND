package bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto;

import bookmyshow.Book_My_Show_Backend.DTO.TicketDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class userRespDto {
int id;

    String name;


    String Mobile_no;


    String mail_id;

    // list of ticket
    List<TicketDto> ticketDtoList;
}
