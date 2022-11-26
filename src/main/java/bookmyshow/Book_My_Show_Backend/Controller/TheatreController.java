package bookmyshow.Book_My_Show_Backend.Controller;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.TheatreReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TheatreRespDto;
import bookmyshow.Book_My_Show_Backend.Models.TheatreEntity;
import bookmyshow.Book_My_Show_Backend.Services.IMP.TheatreServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Theatre")
public class TheatreController {
    @Autowired
    TheatreServiceImp theatreServiceImp;

    @PostMapping("add")
    public ResponseEntity addTheatre(@RequestBody() TheatreReqDto theaterReqDto){
        theatreServiceImp.addTheatre(theaterReqDto);

        //return theatreServiceImp.addTheatre(theaterReqDto);
        return new ResponseEntity<>("sucess",HttpStatus.CREATED);

    }
    @GetMapping("{id}")
    public ResponseEntity getTheatre(@PathVariable(value = "id")int id){

        TheatreRespDto responce =theatreServiceImp.getTheatre(id);
        return new ResponseEntity<>(responce,HttpStatus.ACCEPTED);
    }

    @GetMapping("/All")
    public ResponseEntity getAlltheatre(){

    List<TheatreEntity> theatreEntityList =theatreServiceImp.getAllTheatre();
    return new ResponseEntity<>(theatreEntityList,HttpStatus.ACCEPTED);
}


}
