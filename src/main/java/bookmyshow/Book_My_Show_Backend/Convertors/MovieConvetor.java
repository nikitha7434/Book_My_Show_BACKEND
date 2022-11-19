package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.MovieReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.MovieRespDto;
import bookmyshow.Book_My_Show_Backend.Models.MovieEntity;

public class MovieConvetor {

    public static MovieEntity convertDtoToEntity(MovieReqDto movieReqDto){


      return MovieEntity.builder().movie_name(movieReqDto.getName()).relaseDate(movieReqDto.getReliesDate()).build();

    }

    public static MovieRespDto convetEntityToDto(MovieEntity movieEntity) {
    return MovieRespDto.builder().id(movieEntity.getId()).reliseDate(movieEntity.getRelaseDate()).name(movieEntity.getMovie_name()).build();
    }
}
