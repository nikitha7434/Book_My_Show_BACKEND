package bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieRespDto {
    int id;
    String name;
    LocalDate reliseDate;
    List<ShowRespDto> showRespDtoList;


}
