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

//        Evento evento1 = new Evento("ProvaEvento3", "18-03-2021", tipoEvento.PUBBLICO, 25);
//
//        eventsDao.save(evento1);
//        try {
//            Evento eventoTrovato = eventsDao.getById(1);
//            System.out.println(eventoTrovato);
//        } catch (NotFoundExc e) {
//            System.out.println((e.getMessage()));
//        }

//        try {
//            eventsDao.deleteEventbyId(202);
//
//        } catch (NotFoundExc e) {
//            System.out.println((e.getMessage()));
//        }

//        System.out.println(eventsDao.getById(1));

//        eventsDao.deleteEventbyId(52);

    }


}
