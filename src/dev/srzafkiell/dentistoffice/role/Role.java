package dev.srzafkiell.dentistoffice.role;


public class Role {

	/**
	 * Role id for the person (Easier to look for a role id for permissions en more)
	 */
	int roleId;
	/**
	 * Name of the role for the person
	 */
	String roleName;
	/**
	 * Description of the role for the person
	 */
	String roleDescription;

	/**
	 * Empty constructor of the Role class <br>
	 * This constructor should never be used. (But it is here .-.)
	 */
	public Role(){
	}

	/**
	 * Constructor for the Role class
	 * @param roleId 		The id for the role <br> This has to match the database id for the role, so it is easier to index
	 * @param name 			The name of the role
	 * @param description 	A brief description of the role
	 */
	public Role(int roleId, String name, String description){
		this.roleId = roleId;
		this.roleName = name;
		this.roleDescription = description;
	}

	/**
	 * @return Role id
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * Sets the role ID.
	 * @deprecated 		This method will be replaced in the future with a system that uses auto-increment IDs.
	 *             		Using this method is not safe for the program.
	 * @param roleId 	The role ID to be set.
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return Role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets the role name.
	 * @deprecated 		This method will be replaced in the future. Using this method is not safe for the program.
	 * @param roleName	The role name to be set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return Role description
	 */
	public String getRoleDescription() {
		return roleDescription;
	}

	/**
	 * Sets the role description
	 * @deprecated 				This method will be replaced in the future. Using this method is not safe for the program.
	 * @param roleDescription	The role description to be set
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	/*
	Deprecated get functions will be replaced in the future for ways to update the parameters in a safe and thoughtful way.
	 */

}
