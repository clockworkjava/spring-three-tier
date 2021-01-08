package pl.clockworkjava.threetier.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {

    @Autowired
    GuestService service;

    @GetMapping("guest")
    public List<GuestReadDTO> getAllGuests() {
        return service.getAllGuests();
    }
}
