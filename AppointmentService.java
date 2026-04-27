package test;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private final List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null");
        }

        for (Appointment existing : appointments) {
            if (existing.getAppointmentId().equals(appointment.getAppointmentId())) {
                throw new IllegalArgumentException("Appointment ID must be unique");
            }
        }

        appointments.add(appointment);
    }

    public void deleteAppointment(String appointmentId) {
        Appointment toRemove = null;

        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                toRemove = appointment;
                break;
            }
        }

        if (toRemove == null) {
            throw new IllegalArgumentException("Appointment ID not found");
        }

        appointments.remove(toRemove);
    }

    public Appointment getAppointment(String appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                return appointment;
            }
        }
        return null;
    }
}
