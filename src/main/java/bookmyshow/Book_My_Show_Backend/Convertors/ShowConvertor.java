package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.showReqDto;
import bookmyshow.Book_My_Show_Backend.Models.ShowEntity;

public class ShowConvertor {
    public static ShowEntity converteDtoToEntity(showReqDto showReqDto) {

        return ShowEntity.builder().showDate(showReqDto.getShowDate())
                .showTime(showReqDto.getShowTime())
                .build();
    }
}
