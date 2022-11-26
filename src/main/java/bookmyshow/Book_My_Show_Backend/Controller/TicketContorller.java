package bookmyshow.Book_My_Show_Backend.Controller;

import bookmyshow.Book_My_Show_Backend.DTO.BookTicketReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TicketRespoDto;
import bookmyshow.Book_My_Show_Backend.Services.IMP.TicketServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ticket")
public class TicketContorller {

   @Autowired
    TicketServiceImp ticketServiceImp;

    @PostMapping("add")
    public ResponseEntity bookTicket(@RequestBody()BookTicketReqDto bookTicketReqDto){
        ticketServiceImp.bookTicket(bookTicketReqDto);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @GetMapping("get/{id}")
    public ResponseEntity getTickt(@PathVariable(value = "id")int id){

        return new ResponseEntity<>(ticketServiceImp.getTicket(id),HttpStatus.OK);
    }
}
