package LectureIII;


public class Manager extends Employee {
	// Create a constructor for the class with an additional field officeNumber
	String officenumber;
	
	public static void office(Employee emp_X){
		//An	employee	with	professional	level	‘A’	possesses	a	individual office	room.	
		//An	employee	with	professional	level	‘B’	possesses	a	cubicle.
		if (emp_X.prof_lev=="A")
		{
			System.out.println("Yes the employee" + emp_X.name + " has a individual office");
		
		}
		else if (emp_X.prof_lev=="B")
		{
			System.out.println("Yes the employee" + emp_X.name + " has not a individual office");
		}
	}
}