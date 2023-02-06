package start.JavaProject.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import start.JavaProject.data.Entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {
}
