package interfaces;

import javax.print.attribute.standard.MediaSize.Other;

public class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}

}
