package dev.srzafkiell.dentistoffice.schedule.interfaces;

import dev.srzafkiell.dentistoffice.core.Appointment;
import dev.srzafkiell.dentistoffice.role.Dentist;
import dev.srzafkiell.dentistoffice.role.Patient;

public interface AppointmentScheduler {
	void scheduleAppointmentForPatient(Patient patient, Appointment appointment, Dentist dentist);
	void scheduleAppointmentForDentist(Dentist dentist, Appointment appointment, Patient patient);
}
