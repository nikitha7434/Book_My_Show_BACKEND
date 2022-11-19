package bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto;

import bookmyshow.Book_My_Show_Backend.ENUM.TheatreType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheatreRespDto {

    int id;
    String name;
    String city;
    String address;
TheatreType type;
}
