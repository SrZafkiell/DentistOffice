package dev.srzafkiell.dentistoffice.role;

import dev.srzafkiell.dentistoffice.core.Person;
import dev.srzafkiell.dentistoffice.role.Role;

public class Employee extends Role {
	/**
	 * Salary of the employee
	 */
	private double salary;

	/**
	 * @return 	Salary of the employee in the office
	 */
	public double getSalary(int employeeIdentification) {
		// Look for the employee using the identification and return his salary.
		return salary;
	}

	/**
	 * Updates the salary for the employee
	 * @param employee	The employee object to be updated
	 * @param salary 	The new salary for the employee
	 */
	public void updateSalary(Employee employee , double salary) {
		// Implement:
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"salary=" + salary +
				'}';
	}
}
