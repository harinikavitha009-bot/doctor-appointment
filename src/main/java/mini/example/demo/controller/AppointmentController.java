package mini.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import mini.example.demo.model.Appointment;
import mini.example.demo.repository.AppointmentRepository;

@RestController
@CrossOrigin(origins = "*")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repo;

    @GetMapping("/appointments")
    public List<Appointment> getAll() {
        return repo.findAll();
    }

    @PostMapping("/book")
    public Appointment book(@RequestBody Appointment appointment) {
        return repo.save(appointment);
    }
}