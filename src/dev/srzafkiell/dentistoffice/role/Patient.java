package dev.srzafkiell.dentistoffice.role;

import dev.srzafkiell.dentistoffice.core.MedicalHistory;
import dev.srzafkiell.dentistoffice.core.Person;

/**
 * Patient class contains all the patient's side information, such as his medical history and other important information.
 */
public class Patient extends Person {

	/**
	 * Medical history of the person <br>
	 * This medical history contains: past illnesses, surgeries, medications, allergies, etc.
	 */
	MedicalHistory medicalHistory;

}
