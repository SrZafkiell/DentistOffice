package dev.srzafkiell.dentistoffice.core;

import dev.srzafkiell.dentistoffice.role.Dentist;

import java.time.LocalDate;
import java.util.Objects;

public class Procedure {
	/**
	 * Date of the procedure in format: (YEAR, MONTH, DAY).
	 */
	private final LocalDate procedureDate;
	/**
	 * Name of the procedure done.
	 */
	private final String procedureName;
	/**
	 * Dentist in charge of the procedure
	 */
	private final Dentist dentistInCharge;
	/**
	 * Special notes for the procedure.
	 */
	private String procedureNote;

	/**
	 * Constructor for creating a procedure record without special notes.
	 * @param procedureDate 	Date of the procedure in format: (YEAR, MONTH, DAY).
	 * @param procedureName 	Name of the procedure done.
	 * @param dentistInCharge 	Name of the dentist in charge of the procedure.
	 */
	public Procedure(LocalDate procedureDate, String procedureName, Dentist dentistInCharge) {

		/*
		Check for
		 */
		Objects.requireNonNull(procedureDate, "Procedure date must not be null.");
		Objects.requireNonNull(procedureName, "Procedure name must not be null.");
		Objects.requireNonNull(dentistInCharge, "Dentist in charge must not be null.");

		this.procedureDate = procedureDate;
		this.procedureName = procedureName;
		this.dentistInCharge = dentistInCharge;
	}

	/**
	 * Constructor for creating a procedure record with special notes.
	 * @param procedureDate 	Date of the procedure in format: (YEAR, MONTH, DAY).
	 * @param procedureName 	Name of the procedure done.
	 * @param dentistInCharge 	Name of the dentist in charge of the procedure.
	 * @param procedureNote 	Special notes for the procedure, in case something is important to be written for the future.
	 */
	public Procedure(LocalDate procedureDate, String procedureName, Dentist dentistInCharge, String procedureNote) {
		this(procedureDate, procedureName, dentistInCharge);
		this.procedureNote = procedureNote;
	}

	/*
	In the following lines, there will be no set functions for the data that should not be changed for the procedure
	such as procedureDate, procedureName and dentistInCharge.
	As for the note, it can be edited later. It is not treated as sensible information that should not change as much as
	the other information.
	 */

	/**
	 * @return Date in which the procedure was done (YEAR, MONTH, DAY)
	 */
	public LocalDate getProcedureDate() {
		return procedureDate;
	}

	/**
	 * @return Procedure name <br>
	 * Example: Tooth extraction, Filling...
	 */
	public String getProcedureName() {
		return procedureName;
	}

	/**
	 * @return Dentist in charge of the procedure
	 */
	public Dentist getDentistInCharge() {
		return dentistInCharge;
	}

	/**
	 * @return Not for a specific procedure <br>
	 * It can be null
	 */
	public String getProcedureNote() {
		return procedureNote;
	}

	/**
	 * Updates the note for a procedure that is already in the system
	 * @param personIdentification	Person identification credential
	 * @param procedure				Procedure to be edited
	 */
	public void updateProcedureNote(int personIdentification, Procedure procedure){
		// Implement logic to update notes of the procedure
	}
}
