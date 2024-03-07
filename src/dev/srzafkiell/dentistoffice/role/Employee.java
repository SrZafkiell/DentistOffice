package dev.srzafkiell.dentistoffice.role;

import dev.srzafkiell.dentistoffice.role.Role;

public class Employee extends Role {
	/**
	 * Salary of the employee
	 */
	private double salary;

	/**
	 * @return 	Salary of the employee in the office
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Updates the salary for the employee
	 * @param salary 	The salary of the employee
	 */
	public void updateSalary(double salary) {
		this.salary = salary;
	}
}
