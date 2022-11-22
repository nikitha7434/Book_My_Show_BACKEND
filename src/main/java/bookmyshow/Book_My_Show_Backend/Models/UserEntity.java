package bookmyshow.Book_My_Show_Backend.Models;

import bookmyshow.Book_My_Show_Backend.DTO.EntityResponceDto.TicketRespoDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_tb")
public class UserEntity {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
@Column(name="name",nullable = false)
private String name;
@Column(nullable = false)
private String Mobile_No;
@Column(nullable = false)
private String Mail_id;

@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
private List<TicketEntity> listofTicket;


}
