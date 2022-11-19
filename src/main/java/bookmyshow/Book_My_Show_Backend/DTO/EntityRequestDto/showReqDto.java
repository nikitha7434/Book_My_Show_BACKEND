package bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto;

import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.MovieRespDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TheatreRespDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class showReqDto {

    @NotNull
LocalDate ShowDate;
@NotNull
LocalTime showTime;
@NotNull
TheatreRespDto theatreRespDto;
@NotNull
MovieRespDto movieRespDto;


}
