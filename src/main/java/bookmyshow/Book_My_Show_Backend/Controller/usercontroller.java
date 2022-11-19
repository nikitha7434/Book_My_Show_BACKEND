package bookmyshow.Book_My_Show_Backend.Controller;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.UserReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.userRespDto;
import bookmyshow.Book_My_Show_Backend.Repository.UserRepositry;
import bookmyshow.Book_My_Show_Backend.Services.IMP.userServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class usercontroller {
    @Autowired
  userServiceImp userServiceImp;

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody() UserReqDto userReqDto){

        userServiceImp.addUser(userReqDto);
        return new ResponseEntity("success added ", HttpStatus.CREATED);

    }
    @GetMapping("{id}")
    public ResponseEntity getUser(@PathVariable(value = "id")int id){

        userRespDto userRespDto = userServiceImp.getuser(id);
        return new ResponseEntity<>(userRespDto,HttpStatus.OK);

    }
}
