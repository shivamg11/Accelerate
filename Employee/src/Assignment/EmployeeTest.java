package Assignment;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void calculateYearlySalaryValidTest () {
		System.out.print("calculateYearlySalaryValidTest :: ");
		Employee emp = new Employee();
		emp.montlySalary = 15000;
		emp.age=53;
		System.out.println(emp.calculateYearlySalary());
	}
	
	@Test
	public void validateInvalidTestName() {
		System.out.print("validateInvalidTestName :: ");
		Employee emp = new Employee();
		emp.name ="John";
		emp.montlySalary = 20000;
		emp.age=38;
		Validator v = new Validator();
		v.validate(emp);
	}
	
	@Test
	public void validateInvalidAgeTest() {
		System.out.print("validateInvalidAgeTest :: ");
		Employee emp = new Employee();
		emp.name ="Yuvraj Singh";
		emp.montlySalary = 20000;
		emp.age=12;
		Validator v = new Validator();
		v.validate(emp);
	}
	
	@Test
	public void isvalidNameInvalidNameTest() {
		System.out.print("isvalidNameInvalidNameTest :: ");
		Employee emp = new Employee();
		emp.name ="John";
		emp.montlySalary = 20000;
		emp.age=45;
		Validator v = new Validator();
		System.out.println(v.isValidName(emp.getName()));
	}
	
	@Test
	public void isvalidNameValidNameTest() {
		System.out.print("isvalidNameValidNameTest :: ");
		Employee emp = new Employee();
		emp.name ="Yuvraj Singh";
		emp.montlySalary = 20000;
		emp.age=45;
		Validator v = new Validator();
		System.out.println(v.isValidName(emp.getName()));
	}
	
	@Test
	public void isvalidAgeValidAgeTest() {
		System.out.print("isvalidAgeValidAgeTest :: ");
		Employee emp = new Employee();
		emp.name ="Yuvraj Singh";
		emp.montlySalary = 20000;
		emp.age=23;
		Validator v = new Validator();
		System.out.println(v.isValidAge(emp.getAge()));
	}
	
	@Test
	public void isvalidAgeInvalidAgeTest() {
		System.out.print("isvalidAgeInvalidAgeTest :: ");
		Employee emp = new Employee();
		emp.name ="Yuvraj Singh";
		emp.montlySalary = 20000;
		emp.age=12;
		Validator v = new Validator();
		System.out.println(v.isValidAge(emp.getAge()));
	}
}
