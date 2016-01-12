import java.io.*;
import java.util.*;

class Employee{
	
	private String name;
	private Double salary;
	private Integer age;

	public Employee(String name, Double salary, Integer age){
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public Double getSalary(){
		return salary;
	}

	public Integer getAge(){
		return age;
	}

	public String print(){
		String str =  "Name : "+name + "	Salary  : " + salary + "	Age: "+ age + "\n";
		return str;
	}
}
	



class EmployeeProject{
	private ArrayList<Employee> empList = new ArrayList<Employee>();
	
	public void populateEmployees(){
		empList.add(new Employee("sas",32434.07,42));
		empList.add(new Employee("ses",50000.00,20));
		empList.add(new Employee("aaa",45434.45,35));
		empList.add(new Employee("fgh",562434.68,23));
	}

	public void sortName(){
		Collections.sort(empList,(Employee emp1, Employee emp2) -> emp1.getName().compareTo(emp2.getName()));   
		display(); 
	}

	public void sortSalary(){
		Collections.sort(empList,(Employee emp1, Employee emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));  
		display();
	}

	public void sortAge(){
		Collections.sort(empList,(Employee emp1, Employee emp2) -> emp1.getAge().compareTo(emp2.getAge()));  
		display();
	}


	public void display(){
		empList.forEach((emp) -> {System.out.println(emp.print()); });
	}

	public static void main(String[] args){
		int choice;
		Scanner scanner = new Scanner(System.in);
		EmployeeProject empProj = new EmployeeProject();

		empProj.populateEmployees();

		System.out.println("1. Name");
		System.out.println("2. Salary");
		System.out.println("3. Age");
		System.out.println("Choose an attribute to sort the employee list : ");
		choice = scanner.nextInt();

		switch(choice){
			case 1 : empProj.sortName();
					 break;

			case 2 : empProj.sortSalary();
					 break;

			case 3 : empProj.sortAge();
					 break;
		}

	}
}