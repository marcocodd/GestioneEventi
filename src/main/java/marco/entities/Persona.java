package marco.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cognome;
    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    @Enumerated(EnumType.STRING)
    private Genere genere;

    @Column(name = "lista_partec")
    private List<Partecipazione> listaPartecipazione;


}
