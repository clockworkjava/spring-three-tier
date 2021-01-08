package pl.clockworkjava.threetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.clockworkjava.threetier.guest.GuestRepository;

@Component
public class DBInit implements CommandLineRunner {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public void run(String... args) throws Exception {
        this.guestRepository.create("Paweł", 22, "1111111");
    }
}
