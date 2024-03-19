package marco;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import marco.dao.EventsDao;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");

    public static void main(String[] args) {


        EntityManager em = emf.createEntityManager();
        EventsDao eventsDao = new EventsDao(em);

//        Evento evento3 = new Evento("ProvaEvento3", "18-03-2021", tipoEvento.PUBBLICO, 23);

//        eventsDao.save(evento3);
        System.out.println(eventsDao.getById(102));
//        eventsDao.deleteEventbyId(52);

    }


}
