package dev.srzafkiell.dentistoffice.role;

import java.util.Map;

public class Dentist extends Employee{
	/**
	 * Map of a procedure type to count
	 */
	private Map<String, Integer> proceduresPerformed;
	/**
	 * Map of a procedure type to compensation rate
	 */
	private Map<String, Double> compensationRates;
	/**
	 * Schedule of procedures for the dentist
	 */
	String scheduledProcedures; // Resolve data type and implement
}
