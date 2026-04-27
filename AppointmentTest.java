package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class AppointmentTest {

    @Test
    public void testValidAppointment() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Appointment appointment = new Appointment("A123", futureDate, "Doctor appointment");

        assertEquals("A123", appointment.getAppointmentId());
        assertEquals(futureDate, appointment.getAppointmentDate());
        assertEquals("Doctor appointment", appointment.getDescription());
    }

    @Test
    public void testAppointmentIdInvalid() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, futureDate, "Test");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678901", futureDate, "Test");
        });
    }

    @Test
    public void testDateInvalid() {
        Date pastDate = new Date(System.currentTimeMillis() - 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", null, "Test");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", pastDate, "Test");
        });
    }

    @Test
    public void testDescriptionInvalid() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", futureDate, null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", futureDate, "This description is definitely longer than fifty characters total.");
        });
    }

    @Test
    public void testSetters() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Date newDate = new Date(System.currentTimeMillis() + 200000);

        Appointment appointment = new Appointment("A123", futureDate, "Doctor");

        appointment.setAppointmentDate(newDate);
        assertEquals(newDate, appointment.getAppointmentDate());

        appointment.setDescription("Dentist");
        assertEquals("Dentist", appointment.getDescription());
    }
}