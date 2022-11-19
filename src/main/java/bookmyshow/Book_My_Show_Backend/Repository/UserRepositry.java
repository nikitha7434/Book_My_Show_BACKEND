package bookmyshow.Book_My_Show_Backend.Repository;

import bookmyshow.Book_My_Show_Backend.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<UserEntity,Integer> {
}
