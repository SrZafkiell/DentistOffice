package dev.srzafkiell.dentistoffice.utils;

import java.util.regex.Pattern;

public class MailValidator {

	/**
	 * Mail checker function, it validated if it could be possible mail <br>
	 * @param mail Mail address to be validated
	 * @return True if is valid and False if it is not
	 */
	public static boolean isMailValid(String mail){
		return Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", mail);
	}

	/**
	 * Mail checker function, it validated if the mail is real and functional
	 * @param mail Mail address to be validated
	 * @return True if it is a real and functional email (Temporal mails are not considered as real)
	 */
	public boolean isRealMail(String mail){
		// Implement logic to validate if the mail is real, the domain exists, and the mail is not temporal
		return false;
	}

}
