package com.practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeDriver {
	public static List<Employee> filterEmployee(List<Employee> list, Predicate<Employee> p) {
		List<Employee> listOfEmployee = new ArrayList<>();
		for (Employee e : list) {
			if (p.test(e))
				listOfEmployee.add(e);
		}
		return listOfEmployee;
	}

	public static void display(List<Employee> list) {
		for (Employee e : list) {
			System.out.println(e);
		}
	}

	public static <Employee> List<String> getNames(List<Employee> list, Function<Employee, String> f) {
		List<String> lastNames = new ArrayList<>();
		for (Employee e : list) {
			lastNames.add(f.apply(e));
		}
		return lastNames;
	}

	public static void displayFirstNames(List<String> listOfNames) {
		for (String name : listOfNames) {
			System.out.println(name);
		}

	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Dexter", "Morgan", 35, "Analyst"));
		employees.add(new Employee("Debra", "Morgan", 30, "Inspector"));
		employees.add(new Employee("Joey", "Quin", 30, "Inspector"));
		employees.add(new Employee("Marshal", "Maria", 38, "Leiutent"));
		employees.add(new Employee("David", "Angel", 40, "Captain"));

		List<Employee> belowAge = filterEmployee(employees, (Employee e) -> e.getAge() < 38);
		System.out.println("Below Age Employees : ");
		display(belowAge);

		List<String> lastNameOfEmployees = getNames(employees, (Employee e) -> e.getFName());
		System.out.println("First Name of all employees : ");
		displayFirstNames(lastNameOfEmployees);

	}

}
