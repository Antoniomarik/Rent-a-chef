package start.JavaProject.data.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "user_id")
    private long user_id;

    @Column(name = "price")
    private long price;

    @Column(name = "max_peoples")
    private long max_peoples;

    @Column(name = "menu_description")
    private String menuDescription;

    @Column(name = "photo_id")
    private long photoID;

    @ManyToOne
    @JoinColumn(name = "Menuid")
    private User user;

    @OneToMany(mappedBy = "menu")
    private List<Photos> photo;


    public long getId() {
        return user_id;
    }

    public void setId(long id) {
        this.user_id = id;
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

    public long getPhotoID() {
        return photoID;
    }

    public void setPhotoID(long photoID) {
        this.photoID = photoID;
    }
}
