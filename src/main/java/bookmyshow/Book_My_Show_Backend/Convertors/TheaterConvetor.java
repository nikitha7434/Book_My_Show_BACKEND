package bookmyshow.Book_My_Show_Backend.Convertors;

import bookmyshow.Book_My_Show_Backend.DTO.EntityRequestDto.TheatreReqDto;
import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TheatreRespDto;
import bookmyshow.Book_My_Show_Backend.Models.TheatreEntity;

public class TheaterConvetor {


    public static TheatreRespDto convetorEntitytoDto(TheatreEntity theratreDto) {

        return TheatreRespDto.builder().id(theratreDto.getId()).name(theratreDto.getName())
                .address(theratreDto.getAddress())
                .city(theratreDto.getCity())
                .type(theratreDto.getType())
                .build();
    }

    public static TheatreEntity convertorDtoToEntity(TheatreReqDto theatreReqDto) {



        return TheatreEntity.builder().id(theatreReqDto.getId())
                .name(theatreReqDto.getName())
                .city(theatreReqDto.getCity())
                .address(theatreReqDto.getAddress())
                .build();



    }


}

