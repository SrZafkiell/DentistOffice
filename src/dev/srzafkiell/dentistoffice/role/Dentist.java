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
	String scheduledProcedures; // Resolve a data type and implement

	@Override
	public String toString() {
		return "Dentist{" +
				"proceduresPerformed=" + proceduresPerformed +
				", compensationRates=" + compensationRates +
				", scheduledProcedures='" + scheduledProcedures + '\'' +
				'}';
	}
}
