package pl.clockworkjava.threetier.guest;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class GuestRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Guest> getAllGuests() {
        return entityManager
                .createQuery("Select guest from Guest guest", Guest.class)
                .getResultList();
    }

    @Transactional
    public void create(String name, int age, String personalId) {
        Guest newOne = new Guest(name, age, personalId);

        entityManager.persist(newOne);
    }
}
