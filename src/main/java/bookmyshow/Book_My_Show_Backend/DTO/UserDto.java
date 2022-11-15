package bookmyshow.Book_My_Show_Backend.DTO;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    int id;
    @NotNull
    String name;
    @NotNull
    String mobile_no;
    @NotNull
    String gmail;

}
