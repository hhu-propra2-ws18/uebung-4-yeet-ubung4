package de.hhu.propra.db.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data // Lombok - Generiert Getter, Setter, toString, ...
@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String stadt;
    private Integer plz;

    // TODO: Hier muss irgendetwas mit Autos hin...
    @OneToMany(cascade = CascadeType.ALL)
    private List<Auto> fahrzeuge;
}
