package bookmyshow.Book_My_Show_Backend.Models;

import bookmyshow.Book_My_Show_Backend.ENUM.TheatreType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "theatres")

public class TheatreEntity {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(name = "name",nullable = false)
private String name;

@Column(name = "city",nullable = false)
private String city;

@Column(name = "address",nullable = false)
private String address;
@OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
        @JsonIgnore
List<ShowEntity> show;

TheatreType type;

@OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
        @JsonIgnore
private List<TheatreSeatEntity> seats;



}
