package dev.srzafkiell.dentistoffice.core;

public class PersonName {
	private final String firstName;
	private String middleName;
	private final String firstLastName;
	private String secondLastName;

	/**
	 *
	 * @param firstName		First name of the person (Required)
	 * @param firstLastName	First last name of the person (Required)
	 */
	public PersonName(String firstName, String firstLastName) {
		this.firstName = firstName;
		this.firstLastName = firstLastName;
	}

	/**
	 * In the event that a person only registers with firstName and firstLastName it is okay. However, this has to be
	 * managed in the UI. We can't control the order in which the names will get here.
	 * @param firstName 		First name of the person (Required)
	 * @param middleName 		Second name of the person (If applies, it can be an empty string)
	 * @param firstLastName 	First last name of the person (Required)
	 * @param secondLastName 	Second last name of the person (If applies, it can be an empty string)
	 */
	public PersonName(String firstName, String middleName, String firstLastName, String secondLastName) {
		this(firstName,firstLastName);
		this.middleName = middleName;
		this.secondLastName = secondLastName;
	}

	/**
	 * @return 	First name of the person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return 	Second name of the person (If applies, it can be an empty string)
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 *
	 * @return 	First last name of the person
	 */
	public String getFirstLastName() {
		return firstLastName;
	}

	/**
	 * @return 	Second last name of the person (If applies, it can be an empty string)
	 */
	public String getSecondLastName() {
		return secondLastName;
	}
}
