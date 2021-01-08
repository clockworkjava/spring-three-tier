package pl.clockworkjava.threetier.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuestService {

    @Autowired
    GuestRepository repository;

    public List<GuestReadDTO> getAllGuests() {
        return repository.getAllGuests()
                .stream()
                .map(guest -> new GuestReadDTO(guest.getAge(), guest.getName(), guest.getId()))
                .collect(Collectors.toList());
    }
}
