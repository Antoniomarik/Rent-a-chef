package start.JavaProject.data.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import start.JavaProject.data.Entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);
    @Query("SELECT m FROM User m WHERE m.email = :email AND m.password = :password")
    User findByEmalAndPassword(@Param("email") String email, @Param("password") String password);

    List<User> findByLocation(String location);
}
