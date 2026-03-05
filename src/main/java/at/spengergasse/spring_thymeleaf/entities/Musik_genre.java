package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "g_gerne")
public class Musik_genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "popularity")
    private int popularity;
    @Column(name = "averageTempo")
    private float averageTempo;
    @Column(name = "ursprung")
    private String ursprung;
    @Column(name = "listeners_pro_monat")
    private String listenersProMonat;

    public Musik_genre() {}

    public Musik_genre(String name, int popularity, float averageTempo, String ursprung, String listenersProMonat) {
        this.name = name;
        this.popularity = popularity;
        this.averageTempo = averageTempo;
        this.ursprung = ursprung;
        this.listenersProMonat = listenersProMonat;
    }

    // --- Getter & Setter ---
    public int getId() { return id; }
    public String getName() { return name; }
    public int getPopularity() { return popularity; }
    public float getAverageTempo() { return averageTempo; }
    public String getUrsprung() { return ursprung; }
    public String getListenersProMonat() { return listenersProMonat; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPopularity(int popularity) { this.popularity = popularity; }
    public void setAverageTempo(float averageTempo) { this.averageTempo = averageTempo; }
    public void setUrsprung(String ursprung) { this.ursprung = ursprung; }
    public void setListenersProMonat(String listenersProMonat) { this.listenersProMonat = listenersProMonat; }
}