package bookmyshow.Book_My_Show_Backend.Services.IMP;

import bookmyshow.Book_My_Show_Backend.Convertors.userConvetor;
import bookmyshow.Book_My_Show_Backend.DTO.UserDto;
import bookmyshow.Book_My_Show_Backend.Models.UserEntity;
import bookmyshow.Book_My_Show_Backend.Repositry.UserRepositry;
import bookmyshow.Book_My_Show_Backend.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class userServiceImp implements userService {
    @Autowired
    UserRepositry userRepositry;
    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity= userConvetor.convertuserDtoToEntity(userDto);
        userRepositry.save(userEntity);
    }

    @Override
    public UserDto getuser(int id) {
        Optional<UserEntity> userEntity =userRepositry.findById(id);
        UserDto userDto=userConvetor.convertuserEtityToDto(userEntity);
        return userDto;
    }
}
