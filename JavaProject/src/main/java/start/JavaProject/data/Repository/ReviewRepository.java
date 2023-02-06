package start.JavaProject.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import start.JavaProject.data.Entity.Photos;

@Repository
public interface ReviewRepository extends JpaRepository<Photos,Long> {
}
