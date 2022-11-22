package bookmyshow.Book_My_Show_Backend.Controller;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.MovieReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.MovieRespDto;
import bookmyshow.Book_My_Show_Backend.Models.MovieEntity;
import bookmyshow.Book_My_Show_Backend.Services.IMP.MoviesServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Movie")
public class MovieController {

    @Autowired
    MoviesServicesImp moviesServicesImp;

    @PostMapping("/add")
    public ResponseEntity addMovie(@RequestBody()MovieReqDto movieReqDto){


    moviesServicesImp.addMovie(movieReqDto);
    return new ResponseEntity<>("sucess added", HttpStatus.ACCEPTED);

    }
    @GetMapping("{id}")
    public ResponseEntity getMovie(@PathVariable(value = "id")int id){

       MovieRespDto movieRespDto= moviesServicesImp.getMovie(id);
        return new ResponseEntity<>(movieRespDto,HttpStatus.FOUND);

    }
    @GetMapping("/All")
public ResponseEntity getListMovie(){
        List<MovieEntity> movieList =moviesServicesImp.getAllMovie();
        return new ResponseEntity<>(movieList,HttpStatus.ACCEPTED);
    }

}
