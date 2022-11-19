package bookmyshow.Book_My_Show_Backend.Services.IMP;

import bookmyshow.Book_My_Show_Backend.Convertors.MovieConvetor;
import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.MovieReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.MovieRespDto;
import bookmyshow.Book_My_Show_Backend.Models.MovieEntity;
import bookmyshow.Book_My_Show_Backend.Repository.MovieRepository;
import bookmyshow.Book_My_Show_Backend.Services.Movieservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesServicesImp implements Movieservices {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieRespDto addMovie(MovieReqDto movieReqDto) {

        MovieEntity movieEntity= MovieConvetor.convertDtoToEntity(movieReqDto);
        movieEntity=movieRepository.save(movieEntity);
        MovieRespDto movieRespDto = MovieConvetor.convetEntityToDto(movieEntity);
        return movieRespDto;
    }

    @Override
    public MovieRespDto  getMovie(int id) {
        MovieEntity movieEntity=movieRepository.findById(id).get();
        MovieRespDto movieRespDto=MovieConvetor.convetEntityToDto(movieEntity);

        return movieRespDto;
    }
}
