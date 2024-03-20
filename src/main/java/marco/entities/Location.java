package marco.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "location")
public class Location {
    private long id;
    private String nome;
    @Column(name = "città")
    private String citta;

}
