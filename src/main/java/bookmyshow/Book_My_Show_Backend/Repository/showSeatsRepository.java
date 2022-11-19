package bookmyshow.Book_My_Show_Backend.Repository;

import bookmyshow.Book_My_Show_Backend.Models.showSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface showSeatsRepository extends JpaRepository<showSeatEntity,Integer> {
}
