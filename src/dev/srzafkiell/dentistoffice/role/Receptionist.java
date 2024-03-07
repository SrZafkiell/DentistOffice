package dev.srzafkiell.dentistoffice.role;

import dev.srzafkiell.dentistoffice.core.Appointment;
import dev.srzafkiell.dentistoffice.schedule.interfaces.AppointmentScheduler;

public class Receptionist extends Employee implements AppointmentScheduler {

	@Override
	public void scheduleAppointmentForPatient(Patient patient, Appointment appointment, Dentist dentist) {

	}

	@Override
	public void scheduleAppointmentForDentist(Dentist dentist, Appointment appointment, Patient patient) {

	}
}
