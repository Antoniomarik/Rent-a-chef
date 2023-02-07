package start.JavaProject.data.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private long menu_id;

    @Column(name = "price")
    private long price;

    @Column(name="menutype")
    private String menutype;

    @Column(name = "max_peoples")
    private long max_peoples;

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    @Column(name = "menu_description")
    private String menuDescription;

    @Column (name="dateavailable")
    private String dateavailable;

    public String getDateavailable() {
        return dateavailable;
    }

    public void setDateavailable(String dateavailable) {
        this.dateavailable = dateavailable;
    }

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @OneToMany(mappedBy = "menu" )
    private List<Photos> photo;

    public long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(long menu_id) {
        this.menu_id = menu_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Photos> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photos> photo) {
        this.photo = photo;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getMax_peoples() {
        return max_peoples;
    }

    public void setMax_peoples(long max_peoples) {
        this.max_peoples = max_peoples;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }





}
