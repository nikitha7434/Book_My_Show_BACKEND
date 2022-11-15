package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.UserDto;
import bookmyshow.Book_My_Show_Backend.Models.UserEntity;

import java.util.Optional;

public class userConvetor {

    public static UserEntity convertuserDtoToEntity(UserDto userDto){

        // create the user
        return UserEntity.builder().name(userDto.getName()).Mobile_No(userDto.getMobile_no()).
                Mail_id(userDto.getGmail()).build();
    }
    public static UserDto convertuserEtityToDto(Optional<UserEntity> user){

        UserDto build;
        build = UserDto.builder().id(user.get().getId()).name(user.get().getName()).mobile_no(user.get().getMobile_No())
                .gmail(user.get().getMail_id())
                .build();

        return build;
    }
}
