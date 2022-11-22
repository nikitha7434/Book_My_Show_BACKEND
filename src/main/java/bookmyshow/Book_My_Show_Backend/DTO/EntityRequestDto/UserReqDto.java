package bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserReqDto {


    String name;


    String Mobile_no;


    String mail_id;
}
