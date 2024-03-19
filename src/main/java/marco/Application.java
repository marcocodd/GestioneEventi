package marco;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import marco.dao.EventsDao;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManager em = emf.createEntityManager();
        EventsDao eventsDao = new EventsDao(em);

//        Evento evento2 = new Evento("ProvaEvento2", "18-03-2022", tipoEvento.PUBBLICO, 15);

//        eventsDao.save(evento2);
//        System.out.println(eventsDao.getById(2));
        eventsDao.deleteEventbyId(1);

    }


}
