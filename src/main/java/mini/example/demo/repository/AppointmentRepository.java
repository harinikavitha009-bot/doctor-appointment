package mini.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mini.example.demo.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}