package marco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue
    private long id;
    private Persona persona;
    private Evento event;
    private Stato stato;
}
