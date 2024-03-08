package dev.srzafkiell.dentistoffice.core;

import java.util.ArrayList;
import java.util.List;

public class MedicalHistory {
	// private static final List<Role> roles = new ArrayList<>();
	/**
	 *	List of procedures in a medical history
	 */
	private final List<Procedure> procedures = new ArrayList<>();

	/**
	 * @return List of procedures
	 */
	public List<Procedure> getProcedures() {
		return procedures;
	}
}
