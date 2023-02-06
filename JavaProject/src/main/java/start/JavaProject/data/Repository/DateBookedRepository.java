package start.JavaProject.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import start.JavaProject.data.Entity.DateBooked;

@Repository
public interface DateBookedRepository extends JpaRepository <DateBooked,Long> {
}
