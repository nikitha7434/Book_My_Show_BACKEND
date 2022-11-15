package bookmyshow.Book_My_Show_Backend.Services;

import bookmyshow.Book_My_Show_Backend.DTO.UserDto;

public interface userService { //Design part
    void addUser(UserDto userDto);
    UserDto getuser(int id);
}
