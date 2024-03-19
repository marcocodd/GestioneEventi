package marco.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import marco.entities.Evento;
import marco.exceptions.NotFoundExc;

public class EventsDao {
    private final EntityManager em;

    public EventsDao(EntityManager em) {
        this.em = em;
    }

    public void save(Evento event) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(event);

        transaction.commit();
        System.out.println("Evento aggiunto corrrettamente:" + event.getTitolo());
    }

    public Evento getById(long eventId) {

        Evento foundEvent = em.find(Evento.class, eventId);
        if (foundEvent == null) throw new NotFoundExc(eventId);
        return foundEvent;

    }

    public void deleteEventbyId(long eventId) {
        Evento foundEvent = this.getById(eventId);
        EntityTransaction transcation = em.getTransaction();
        transcation.begin();
        em.remove(foundEvent);
        transcation.commit();
        System.out.println("Evento eliminato: " + foundEvent);

    }
}
