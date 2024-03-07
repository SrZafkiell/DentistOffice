package dev.srzafkiell.dentistoffice.utils;

import java.time.LocalDate;

public class AgeCalculator {

	/**
	 * Local date of the system
	 * @see LocalDate
	 */
	private static final LocalDate today = LocalDate.now();

	/**
	 * Simple function to calculate the age
	 * @param date Birthday date to be used for calculation
	 * @return The age calculated
	 */
	public static int calculateAge(LocalDate date){
		return date.getDayOfYear() > today.getDayOfYear() ? ((today.getYear() - date.getYear()) - 1) : (today.getYear() - date.getYear()) ;
	}

}
