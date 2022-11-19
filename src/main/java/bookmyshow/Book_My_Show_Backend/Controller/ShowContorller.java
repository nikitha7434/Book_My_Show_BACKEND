package bookmyshow.Book_My_Show_Backend.Controller;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.showReqDto;
import bookmyshow.Book_My_Show_Backend.Services.IMP.showServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("show")
public class ShowContorller {

    @Autowired
    showServiceImp showServiceImp;

    @PostMapping("add")
    public ResponseEntity addShow(@RequestBody() showReqDto showReqDto){

        showServiceImp.addshow(showReqDto);
        return new ResponseEntity<>("added Show", HttpStatus.CREATED);
    }
}
