package bookmyshow.Book_My_Show_Backend.DTO;

import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.ShowRespDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.userRespDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {
    int id;

    String alloted_seats;

    @NotNull
    double amount;

    ShowRespDto showRespDto;

    @NotNull
    userRespDto userRespDto;// import for the userDto;

}
