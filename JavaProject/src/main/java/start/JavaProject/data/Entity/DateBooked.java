package start.JavaProject.data.Entity;

import javax.persistence.*;
@Entity
@Table(name = "date_booked")
public class DateBooked {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long datebooked_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date_min")
    private String date_min;

    @Column(name = "date_max")
    private String date_max;

    public String getDate_min() {
        return date_min;
    }

    public void setDate_min(String date_min) {
        this.date_min = date_min;
    }

    public String getDate_max() {
        return date_max;
    }

    public void setDate_max(String date_max) {
        this.date_max = date_max;
    }
}
