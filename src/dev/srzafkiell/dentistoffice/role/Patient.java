package dev.srzafkiell.dentistoffice.role;

import dev.srzafkiell.dentistoffice.core.MedicalHistory;
import dev.srzafkiell.dentistoffice.core.Person;

public class Patient extends Person {

	/**
	 * Medical history of the person <br>
	 * This medical history contains: past illnesses, surgeries, medications, allergies, etc.
	 */
	MedicalHistory medicalHistory;

}
