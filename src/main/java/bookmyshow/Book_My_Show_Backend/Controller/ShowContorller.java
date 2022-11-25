package bookmyshow.Book_My_Show_Backend.Controller;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.showReqDto;
import bookmyshow.Book_My_Show_Backend.Services.IMP.showServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("show")
public class ShowContorller {

    @Autowired
    showServiceImp showServiceImp;

    @PostMapping("/add")
    public ResponseEntity addShow(@RequestBody() showReqDto showReqDto){

        showServiceImp.addshow(showReqDto);
        log.info("Here we are");
        return new ResponseEntity<>("added Show", HttpStatus.CREATED);
    }

}
