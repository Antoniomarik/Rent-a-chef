package start.JavaProject.data.Entity;


import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "menu_photo_id")
    private long menu_photo_id;

    @Column(name = "photo_name")
    private String photo_name;

    @ManyToOne
    @JoinColumn(name = "photo_id")
    private Menu menu;


    public long getMenu_photo_id() {
        return menu_photo_id;
    }

    public void setMenu_photo_id(long menu_photo_id) {
        this.menu_photo_id = menu_photo_id;
    }

    public String getPhoto_name() {
        return photo_name;
    }

    public void setPhoto_name(String photo_name) {
        this.photo_name = photo_name;
    }
}
