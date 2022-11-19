package bookmyshow.Book_My_Show_Backend.Services;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.UserReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.userRespDto;

public interface userService { //Design part
    void addUser(UserReqDto userDto);
    userRespDto getuser(int id);
}
