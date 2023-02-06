package start.JavaProject.data.Entity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Text")
    private String text;

    @Column(name = "Stars")
    private long stars;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;



}
