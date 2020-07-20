package Assignment;

public class Validator {

	public void validate(Employee employee) {
		try {
			if(isValidName(employee.name) && isValidAge(employee.age))
				System.out.println("All the values are valid.");
			else if(!isValidName(employee.name))
				throw new InvalidNameException("Invalid Employee Name");
			else if(!isValidAge(employee.age))
				throw new InvalidAgeException("Invalid Employee age");
		} catch (InvalidNameException ex) {
			System.out.println(ex);
		}catch (InvalidAgeException ex) {
			System.out.println(ex);
		}
		
	}
	
	public boolean isValidName(String name) {
		if (name.length() > 8)
			return true;
		return false;
	}
	
	public boolean isValidAge(Integer age) {
		if(age > 18 && age < 60) 
			return true;
		return false;
	}
}

class InvalidNameException extends Exception {
	public InvalidNameException(String s) {
		super(s);
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}
