package bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserReqDto {

    @NotNull
    String name;

    @NotNull
    String Mobile_no;

    @NotNull
    String mail_id;
}
