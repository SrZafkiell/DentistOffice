package dev.srzafkiell.dentistoffice;

import dev.srzafkiell.dentistoffice.config.RoleConfig;
import dev.srzafkiell.dentistoffice.role.Familiar;
import dev.srzafkiell.dentistoffice.role.Role;
import dev.srzafkiell.dentistoffice.utils.AgeCalculator;
import dev.srzafkiell.dentistoffice.utils.MailValidator;
import dev.srzafkiell.dentistoffice.core.PersonName;

import java.time.LocalDate;

/**
 * Main Class for the program
 */
public class DentistOffice {

	/**
	 * Main function for the DentistOffice program
	 * @param args Args
	 */
	public static void main(String[] args) {

		// Everything here is just for testing
		Familiar familiar = new Familiar(new PersonName("Daniel","Ceron"),"Brother",0L,"This is just a note for a familar" );
		System.out.println("Familiar object: " + familiar);
		System.out.println("Familiar info: " + familiar.getName() + " " + familiar.getRelationship() + " " + familiar.getPhone() + " " +  familiar.getNote());
		LocalDate theDate = LocalDate.of(1999,10,29);
		System.out.println("Today is: " + (theDate.getYear()==2024) + "/" + (theDate.getMonthValue()==3) + "/" + (theDate.getDayOfMonth()==6));
		System.out.println("Day of the year: " + theDate.getDayOfYear());
		System.out.println("Calculator test, tu edad es: " + AgeCalculator.calculateAge(theDate));

		System.out.println("Univalle: " + MailValidator.isMailValid("daniel.rayo@correounivalle.edu.co"));
		System.out.println("Normal: " + MailValidator.isMailValid("dalejandroceron@hotmail.com"));
		System.out.println("Gmail: " + MailValidator.isMailValid("srzafkiell@gmail.com"));
		System.out.println("No: " + MailValidator.isMailValid("not_a._G-*@mail.com"));
		System.out.println(RoleConfig.getRoles());

		for (Role role : RoleConfig.getRoles()){
			System.out.println("NEW ROLE PRINT");
			System.out.println("Role ID: " + role.getRoleId() + " | Role Name: " + role.getRoleName() + " | Role Desc: " +  role.getRoleDescription());
		}

		// End of Main
	}
}