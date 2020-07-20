package Assignment;

public class Employee {

	String name;
	double montlySalary;
	double yearlySalary;
	static int age;

	public double calculateYearlySalary() {
		if(age>18 && age<=50)
			return (montlySalary + (0.08*montlySalary))*12;
		else if(age > 50 &&  age < 60)
			return (montlySalary + (0.09*montlySalary))*12;
		return 0;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setMontlySalary(double montlySalary) {
		this.montlySalary = montlySalary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getMontlySalary() {
		return montlySalary;
	}

	public int getAge() {
		return age;
	}
}
