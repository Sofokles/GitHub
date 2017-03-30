package LectureIII;

import java.util.ArrayList;
//import LectureII.employee.Employee;

public class FooCorporation {
		
	//method to print
	public static void salary(Employee emp_X){
		double salery;
		double worked_over_time_hours;
		double over_time_pay;
		over_time_pay=emp_X.base_pay*1.5;
		
		if (emp_X.worked_hours>40)
		{
			worked_over_time_hours=emp_X.worked_hours-40;
			salery = 40*emp_X.base_pay+worked_over_time_hours*over_time_pay;
			
		}
		else 
		{
		salery = emp_X.worked_hours*emp_X.base_pay;
		}
		if (emp_X.base_pay<8)
		{
			System.out.println("Error: " + emp_X.name + " has to low base pay");
		// method for printing out a result
		}
		else
		{
		System.out.println("The employee " + emp_X.name + ". The employee has worked for " + emp_X.worked_hours + 
				" hours and has a base pay of " + emp_X.base_pay + " per hour. The employees total pay is: " + salery);
		}
	
	// method for printing out a result
	}
	public static void office(Employee emp_X){
		//An	employee	with	professional	level	‘A’	possesses	a	individual office	room.	
		//An	employee	with	professional	level	‘B’	possesses	a	cubicle.
		if (emp_X.prof_lev=="A")
		{
			System.out.println("The employee has a individual office");
		
		}
		else if (emp_X.prof_lev=="B")
		{
			System.out.println("The employee has a cubicle");
		}
	
	// method for printing out a result
	}
	
	
	public static void main(String[] args) {
		//----------------------------------------------, List		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Employee john = new Employee();
		employeeList.add(john);		
		john.name = "John";
		john.prof_lev = "B";
		john.base_pay= 7.5;
		john.worked_hours= 38;		
		// define rest parameters of Employee object for John
		// Define 2 more Employees
		
		Employee annabel = new Employee();
		employeeList.add(annabel);
		annabel.name = "Annabel";
		annabel.prof_lev = "B";
		annabel.base_pay= 8.2;
		annabel.worked_hours= 42;
		
		Employee graham = new Employee();
		employeeList.add(graham);
		graham.name = "Graham";
		graham.prof_lev = "A";
		graham.base_pay= 10.50;
		graham.worked_hours= 41;		
		
		// Define 2 more Managers
		Manager bill = new Manager();
		employeeList.add(bill);
		bill.name = "Bill";
		bill.prof_lev = "A";
		bill.base_pay= 15.50;
		bill.worked_hours= 39;
		bill.officenumber= "A332";
		
		Manager gregory = new Manager();
		employeeList.add(gregory);
		gregory.name = "Gregory";
		gregory.prof_lev = "A";
		gregory.base_pay= 18.20;
		gregory.worked_hours= 40;
		gregory.officenumber= "A415";
		
		//----------------------------------------------
		//
		//System.out.println(employeeList.size() + "\n");
		//System.out.println(employeeList.get(1));
		//salary();
		for (int i=0;i<employeeList.size();i++) { // Use enhance looping
			//System.out.println("The employee name is " + employee.name + "\n");
			// Compute salary and define a working place for each employee
			salary(employeeList.get(i));
			office(employeeList.get(i));
			System.out.println("\n");
			
			}
		
	}
}
	


