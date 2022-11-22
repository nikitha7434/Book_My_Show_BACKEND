package bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto;

import bookmyshow.Book_My_Show_Backend.Models.ShowEntity;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@Builder
public class MovieReqDto {

  int id;

    String name;


    LocalDate reliesDate;



}
