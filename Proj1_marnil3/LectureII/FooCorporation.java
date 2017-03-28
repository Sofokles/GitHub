package LectureII;


//import LectureII.employee.Employee;

public class FooCorporation {
	//method to print
	public static void salary(Employee emp_X){
		double salery;
		salery = emp_X.worked_hours*emp_X.base_pay;
		System.out.println("The employee " + emp_X.name + ". The employee has worked for " + emp_X.worked_hours + 
				" hours and has a base pay of " + emp_X.base_pay + " per hour. The employees total pay is: " + salery);
	// method for printing out a result
	}
	public static void main(String[] args) {
		Employee john = new Employee();
		john.name = "John";
		john.base_pay= 7.5;
		john.worked_hours= 38;		
		// define rest parameters of Employee object for John
		// Define 2 more Employees
		Employee annabel = new Employee();
		annabel.name = "Annabel";
		annabel.base_pay= 8.2;
		annabel.worked_hours= 42;
		
		Employee graham = new Employee();
		graham.name = "Graham";
		graham.base_pay= 10.50;
		graham.worked_hours= 41;
		// Define 2 more Managers
		
		Manager bill = new Manager();
		bill.name = "Bill";
		bill.base_pay= 15.50;
		bill.worked_hours= 39;
		bill.officenumber= "A332";
		
		Manager gregory = new Manager();
		gregory.name = "Gregory";
		gregory.base_pay= 18.20;
		gregory.worked_hours= 40;
		gregory.officenumber= "A415";
		
		//
		salary(john);
		salary(annabel);
		salary(graham);
		salary(bill);
		salary(gregory);
	}
}
	


