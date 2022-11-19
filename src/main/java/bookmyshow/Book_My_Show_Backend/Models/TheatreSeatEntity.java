package bookmyshow.Book_My_Show_Backend.Models;

import bookmyshow.Book_My_Show_Backend.ENUM.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

@Table(name = "theatre_seats")
public class TheatreSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="seat_no",nullable = false)
   private String seatNumber;

    @Column(name = "price",nullable = false)
    int rate;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type",nullable = false)
    private SeatType seatType;

    @ManyToOne
    @JsonIgnore
    private TheatreEntity theatre;


    @ManyToOne
    @JoinColumn(name = "show_entity_id")
    private ShowEntity show;

}
