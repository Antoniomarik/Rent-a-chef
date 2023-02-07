package start.JavaProject.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import start.JavaProject.data.Entity.Menu;
import start.JavaProject.data.Entity.User;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {

    List<Menu> findByUser(User user);

    @Query("SELECT m FROM Menu m WHERE m.dateavailable = :dateavailable AND m.menutype = :menutype")
    List<Menu> findbydateandtype(@Param("dateavailable") String dateavailable, @Param("menutype") String menutype);
}
