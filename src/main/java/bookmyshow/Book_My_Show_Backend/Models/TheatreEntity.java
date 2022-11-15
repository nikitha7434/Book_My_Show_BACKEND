package bookmyshow.Book_My_Show_Backend.Models;

import bookmyshow.Book_My_Show_Backend.ENUM.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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
@OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
        @JsonIgnore
private List<TheatreSeatEntity> listofThreatreseat;

}
