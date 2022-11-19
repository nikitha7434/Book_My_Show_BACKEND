package bookmyshow.Book_My_Show_Backend.Repository;

import bookmyshow.Book_My_Show_Backend.Models.TheatreSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepository extends JpaRepository<TheatreSeatEntity,Integer> {
}
