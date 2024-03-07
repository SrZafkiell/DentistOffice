package dev.srzafkiell.dentistoffice.config;

import dev.srzafkiell.dentistoffice.role.Role;

import java.util.ArrayList;
import java.util.List;

/*
 * IMPORTANT: For when we add databases, we should probably add hierarchy again for the roles.
 * For now, it is not needed since we are working with a fixed number of roles. Either way, we are already
 * thinking on "add" and "remove" functions.
 */


public class RoleConfig {

	/**
	 * List of roles
	 */
	private static final List<Role> roles = new ArrayList<>();

	// This has to be replaced, is just for testing
	static {
		// Initialize the list of roles
		roles.add(new Role(1, "Administrator", "System Administrator role"));
		roles.add(new Role(2, "Dentist", "Dentist role"));
		roles.add(new Role(3, "Assistant", "Dentist assistant"));
		roles.add(new Role(4, "Receptionist", "Receptionist role"));
		roles.add(new Role(5, "Patient", "Patient role"));
	}

	/**
	 * @return All the roles available in the system
	 */
	public static List<Role> getRoles() {
		return roles;
	}

	/**
	 *
	 * @param role Role object to be added
	 */
	public static void addRole(Role role){
		//Add logic for adding roles (This will probably be done once we add databases)
	}

	/**
	 * @param roleId Role id to be removed
	 */
	public static void removeRole(int roleId){
		//Add logic for removing roles (This will probably be done once we add databases)
	}

}
