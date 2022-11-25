package bookmyshow.Book_My_Show_Backend.Services.IMP;

import bookmyshow.Book_My_Show_Backend.Convertors.ShowConvertor;
import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.showReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.ShowRespDto;
import bookmyshow.Book_My_Show_Backend.Models.*;
import bookmyshow.Book_My_Show_Backend.Repository.MovieRepository;
import bookmyshow.Book_My_Show_Backend.Repository.TheatreRepository;
import bookmyshow.Book_My_Show_Backend.Repository.showRepository;
import bookmyshow.Book_My_Show_Backend.Repository.showSeatsRepository;
import bookmyshow.Book_My_Show_Backend.Services.showServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class showServiceImp implements showServices {

  @Autowired
    MovieRepository movieRepository;
  @Autowired
    TheatreRepository theatreRepository;
  @Autowired
    showRepository showRepository;
  @Autowired
    showSeatsRepository showSeatsRepository;
    @Override
    public ShowRespDto addshow(showReqDto showReqDto) {

      // we made partical show Entity object
      // Goal : set the movie entity and theater entiity in show dto

      ShowEntity showEntity = ShowConvertor.converteDtoToEntity(showReqDto);

      //MovieEntity

      MovieEntity movieEntity=movieRepository.findById(showReqDto.getMovieRespDto().getId()).get();
      TheatreEntity theatreEntity=theatreRepository.findById(showReqDto.getTheatreRespDto().getId()).get();

      showEntity.setMovie(movieEntity);
      showEntity.setTheatre(theatreEntity);

      //need to pass list of theatre seats

      showEntity = showRepository.save(showEntity);

      generateshowEntityseats(theatreEntity.getSeats(),showEntity);

      // we need to create responce dto
      ShowRespDto showRespDto=ShowConvertor.convertEntityToDto(showEntity,showReqDto);
      return showRespDto;


    }

  private void generateshowEntityseats(List<TheatreSeatEntity> seats, ShowEntity showEntity) {

      List<showSeatEntity> showSeatEntitiesList = new ArrayList<>();

      log.info(String.valueOf(seats));
      log.info("the list of theatreEntity seats");
      for (TheatreSeatEntity tse :seats){
        log.info(tse.toString());
      }

      //for all seats int the theatere

    for(TheatreSeatEntity theatreSeaty: seats){

      showSeatEntity showSeatEntity = bookmyshow.Book_My_Show_Backend.Models.showSeatEntity.builder()
              .SeateNumber(theatreSeaty.getSeatNumber()).seatType(theatreSeaty.getSeatType())
              .rate(theatreSeaty.getRate())
              .build();

      showSeatEntitiesList.add(showSeatEntity);


    }


    // we need to set the show entity

    for (showSeatEntity showSeatEntity:showSeatEntitiesList){
      showSeatEntity.setShow(showEntity);
    }
    showSeatsRepository.saveAll(showSeatEntitiesList);

    showEntity.setTheatreSeat(showSeatEntitiesList);
  }

}
