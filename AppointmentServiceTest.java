package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {

    @Test
    public void testAddAppointment() {
        AppointmentService service = new AppointmentService();
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        Appointment appointment = new Appointment("A123", futureDate, "Doctor");
        service.addAppointment(appointment);

        assertNotNull(service.getAppointment("A123"));
    }

    @Test
    public void testDuplicateId() {
        AppointmentService service = new AppointmentService();
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        Appointment a1 = new Appointment("A123", futureDate, "Doctor");
        Appointment a2 = new Appointment("A123", futureDate, "Dentist");

        service.addAppointment(a1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(a2);
        });
    }

    @Test
    public void testDeleteAppointment() {
        AppointmentService service = new AppointmentService();
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        Appointment appointment = new Appointment("A123", futureDate, "Doctor");
        service.addAppointment(appointment);

        service.deleteAppointment("A123");

        assertNull(service.getAppointment("A123"));
    }

    @Test
    public void testDeleteNonexistent() {
        AppointmentService service = new AppointmentService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("A123");
        });
    }
}
