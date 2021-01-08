package pl.clockworkjava.threetier.reservation;

import pl.clockworkjava.threetier.guest.Guest;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<Guest> guests;

    public Reservation(List<Guest> guest) {
        this.guests = guest;
    }
}
