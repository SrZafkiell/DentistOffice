package dev.srzafkiell.dentistoffice.core;

import com.sun.source.util.Plugin;
import dev.srzafkiell.dentistoffice.role.Familiar;
import dev.srzafkiell.dentistoffice.role.Role;

import java.time.LocalDate;

/**
 *
 */
public class Person {
	/**
	 * Name of the person
	 */
	PersonName name;
	/**
	 * Public identification of the person <br>
	 * This is stored as a String because some countries have
	 * identifications using a String of Characters and Numbers
	 */
	String identification;
	/**
	 * Age of the person - The age should be calculated with the dateOfBirth <br>
	 * Function achieved on: {@link dev.srzafkiell.dentistoffice.utils.AgeCalculator}
	 */
	int age;
	/**
	 * Role of the person <br>
	 * Examples: Patient, Dentist, Doctor...
	 * @see #role
	 */
	Role role;
	/**
	 * BirthDay of the person
	 */
	LocalDate birthDate;
	/**
	 * eMail of the person
	 */
	String email;
	/**
	 * Phone number of the person
	 */
	long phone;
	/**
	 * Emergency contact of the person <br>
	 * Structure: name, relationship, phone number, and note
	 */
	Familiar emergencyContact;
	/**
	 * Country of the person (This should be automatic) <br>
	 * Uses the country to retrieve the country identifier and be able of sending messages or calling
	 */
	String country;
	/**
	 * Insurance information for the person <br>
	 * Country wise 'insurance information' list examples<br>
	 * Colombia: EPS (Empresa prestadora de servicio) <br>
	 * México: Aseguranza
	 */
	String insuranceInformation; // Resolve type
	/**
	 * Preferred language of the person <br>
	 * Supported languages: English, Spanish
	 */
	String preferredLanguage;

	/**
	 * Constructs a Person object with a default role of 'patient'.
	 */
	public Person(){
		this.role = new Role(0, "Patient", "Insert a new description");
	}

	/**
	 * Person constructor that only stores as base the name and phone <br>
	 * (Later used to create Familiars for the patients)
	 * @param name The name of the person
	 * @param phone The phone number of the person
	 */
	protected Person(PersonName name, long phone){
		this.name = name;
		this.phone = phone;
	}

	/**
	 * Complete constructor of a Person
	 * @param name Name of the person
	 * @param identification Identification of the person
	 * @param birthDate Birth Date of the person -> Year/Month/Day
	 * @param email Email of the person
	 * @param phone Personal phone of the person
	 * @param emergencyContact Emergency contact of the person
	 * @param insuranceInformation Insurance information
	 * @param preferredLanguage Preferred language for the system and messages
	 */
	public Person(PersonName name, String identification, LocalDate birthDate, long phone) {
		this.name = name;
		this.identification = identification;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = ""; //
		this.emergencyContact = null; // This emergency contact for a new account will not be set, this line has to be deleted. However, it is here to describe (for now)
		this.country = ""; // This has to be automatic. Probably we will use a config file for this.
		this.insuranceInformation = "";
		this.preferredLanguage = "Spanish";
		/*
		Familiar emergencyContact, String country, String insuranceInformation, String preferredLanguage
		 */
	}

	/**
	 * Fetch for the name of a person
	 * @return The name of the person
	 */
	public PersonName getName() {
		return name;
	}

	/**
	 * Establish the name for a person
	 * @param name Name of the person
	 */
	public void setName(PersonName name) {
		this.name = name;
	}

	/**
	 * @return Legal person's identification of their country
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * Establish the identification of the person
	 * @param identification The legal identification of the person
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	/**
	 *
	 * @return Age
	 */
	public int getAge() {
		return age;
	}

	/**
	 *
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 *
	 * @return
	 */
	public Role getRole() {
		return role;
	}

	/**
	 *
	 * @param role
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 *
	 * @return
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 *
	 * @param birthDate
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 *
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 *
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *
	 * @return
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 *
	 * @param phone
	 */
	public void setPhone(long phone) {
		this.phone = phone;
		System.out.println("Set phone used :D " + phone);
	}

	/**
	 *
	 * @return
	 */
	public Familiar getEmergencyContact() {
		return emergencyContact;
	}

	/**
	 *
	 * @param emergencyContact
	 */
	public void setEmergencyContact(Familiar emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	/**
	 *
	 * @return
	 */
	public String getInsuranceInformation() {
		return insuranceInformation;
	}

	/**
	 *
	 * @param insuranceInformation
	 */
	public void setInsuranceInformation(String insuranceInformation) {
		this.insuranceInformation = insuranceInformation;
	}

	/**
	 *
	 * @return
	 */
	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	/**
	 *
	 * @param preferredLanguage
	 */
	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	private void updateRole(String identification, Role role){

	}

	/**
	 *
	 */
	public static void deleteUser(){
		// Create logic to remove user from the system
	}

	public void updateName(){

	}

	public void updateIdentification(){

	}
}
