package dev.srzafkiell.dentistoffice.role;

import dev.srzafkiell.dentistoffice.core.Person;
import dev.srzafkiell.dentistoffice.core.PersonName;

public class Familiar extends Person {
	private String relationship;
	private String note;

	public Familiar(PersonName name, String relationship, long phone, String note){
		super(name, phone);
		this.relationship = relationship;
		this.note = note;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
