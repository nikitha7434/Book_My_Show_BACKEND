package bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto;

import bookmyshow.Book_My_Show_Backend.ENUM.TheatreType;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheatreReqDto {


    int id;
    @NotNull
    String name;
    @NotNull
    String city;
    @NotNull
    String address;

    TheatreType type;


}
