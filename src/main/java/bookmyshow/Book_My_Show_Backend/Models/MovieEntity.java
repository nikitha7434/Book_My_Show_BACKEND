package bookmyshow.Book_My_Show_Backend.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "movie_tb")
public class MovieEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private int id;

    @Column(name = "name",nullable = false)
    private String movie_name;

    @Column(name = "release_date",columnDefinition = "DATE",nullable = false)
    private LocalDate relaseDate;


    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows;

}
