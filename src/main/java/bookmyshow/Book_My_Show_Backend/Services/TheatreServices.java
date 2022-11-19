package bookmyshow.Book_My_Show_Backend.Services;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.TheatreReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TheatreRespDto;
import bookmyshow.Book_My_Show_Backend.Models.TheatreEntity;

public interface TheatreServices {
    TheatreRespDto addTheatre(TheatreReqDto theratreDto);
    TheatreRespDto getTheatre(int id);
}
