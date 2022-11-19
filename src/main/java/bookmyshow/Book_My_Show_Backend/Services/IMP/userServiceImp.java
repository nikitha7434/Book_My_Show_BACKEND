package bookmyshow.Book_My_Show_Backend.Services.IMP;

import bookmyshow.Book_My_Show_Backend.Convertors.userConvetor;
import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.UserReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.userRespDto;
import bookmyshow.Book_My_Show_Backend.Models.UserEntity;
import bookmyshow.Book_My_Show_Backend.Repository.UserRepositry;
import bookmyshow.Book_My_Show_Backend.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class userServiceImp implements userService {

    @Autowired
    UserRepositry userRepositry;

    @Override
    public void addUser(UserReqDto userDto) {
        UserEntity userEntity= userConvetor.convertuserDtoToEntity(userDto);
        userRepositry.save(userEntity);
    }

    @Override
    public userRespDto getuser(int id) {
        UserEntity user=new UserEntity();

     UserEntity userEntity=userRepositry.findById(id).get();
        userRespDto userRespDto=userConvetor.convertuserEtityToDto(userEntity);
        return userRespDto;
    }
}
