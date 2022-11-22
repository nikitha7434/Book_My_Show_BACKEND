package bookmyshow.Book_My_Show_Backend.Services;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.MovieReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.MovieRespDto;
import bookmyshow.Book_My_Show_Backend.Models.MovieEntity;

import java.util.List;

public interface Movieservices {
    MovieRespDto addMovie(MovieReqDto movieReqDto);
   MovieRespDto getMovie(int id);
   List<MovieEntity> getAllMovie();
}
