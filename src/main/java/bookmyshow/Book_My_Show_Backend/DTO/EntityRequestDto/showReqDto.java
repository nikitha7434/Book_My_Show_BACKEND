package bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto;

import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.MovieRespDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TheatreRespDto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class showReqDto {


LocalDate ShowDate;

LocalTime showTime;

TheatreRespDto theatreRespDto;

MovieRespDto movieRespDto;


}
