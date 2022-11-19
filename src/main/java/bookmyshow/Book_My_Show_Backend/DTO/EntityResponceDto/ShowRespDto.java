package bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class ShowRespDto {
    int id;

    LocalDate ShowDate;

    LocalDate showTime;
   @NotNull
    TheatreRespDto theatreDto;
   @NotNull
    MovieRespDto movieRespDto;

}
