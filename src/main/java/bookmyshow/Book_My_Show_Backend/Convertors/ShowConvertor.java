package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.showReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.ShowRespDto;
import bookmyshow.Book_My_Show_Backend.Models.ShowEntity;



public class ShowConvertor {
    public static ShowEntity converteDtoToEntity(showReqDto showReqDto) {

        return ShowEntity.builder().id(showReqDto.getId()).showDate(showReqDto.getShowDate())
                .showTime(showReqDto.getShowTime())
                .build();
    }

    public static ShowRespDto convertEntityToDto(ShowEntity showEntity, showReqDto showReqDto) {

       return ShowRespDto.builder().
               id(showEntity.getId())
               .ShowDate(showEntity.getShowDate())
               .theatreDto(showReqDto.getTheatreRespDto())
               .movieRespDto(showReqDto.getMovieRespDto()).build();
    }
}
