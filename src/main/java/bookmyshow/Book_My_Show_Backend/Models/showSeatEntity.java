package bookmyshow.Book_My_Show_Backend.Models;

import bookmyshow.Book_My_Show_Backend.ENUM.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "show_seats")
@Entity
@ToString
public class showSeatEntity {
    @Id
    private int id;

    String SeateNumber;

    int seatprice;

    SeatType seatType;
    boolean isbooked;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booked_at")
    private Date bookedAt;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;

    @ManyToOne
    @JsonIgnore
    private TicketEntity ticket;
}
