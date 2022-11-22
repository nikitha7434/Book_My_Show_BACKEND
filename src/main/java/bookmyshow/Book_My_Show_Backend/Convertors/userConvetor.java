package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.UserReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.userRespDto;
import bookmyshow.Book_My_Show_Backend.Models.UserEntity;

import java.util.Optional;

public class userConvetor {

    public static UserEntity convertuserDtoToEntity(UserReqDto userDto){

        // create the user
        return UserEntity.builder().name(userDto.getName()).Mobile_No(userDto.getMobile_no())
                .Mail_id(userDto.getMail_id()).build();

    }

    public static userRespDto convertuserEtityToDto(UserEntity  user){

      return userRespDto.builder().id(user.getId()).name(user.getName())
                      .Mobile_no(user.getMobile_No()).mail_id(user.getMail_id())
                      .listofTicket(user.getListofTicket())
                      .build();
    }
}
