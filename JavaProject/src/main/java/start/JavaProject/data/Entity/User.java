package start.JavaProject.data.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Userid")
    private long userid;

    @Column(name = "Username")
    private String username;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Location")
    private String location;

    @OneToMany(mappedBy = "user")
    private List<DateBooked> datebooked;

    @OneToMany(mappedBy = "user")
    private List<Menu> menu;

    @OneToMany(mappedBy = "user")
    private List<Review> review;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<DateBooked> getDatebooked() {
        return datebooked;
    }

    public void setDatebooked(List<DateBooked> datebooked) {
        this.datebooked = datebooked;
    }
}
