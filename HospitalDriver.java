//Ch 5 program 1  - � HospitalEmployee and Hospital Classes  STUDENTS COMPLETE
//CSC110AA and CIS163AA
//written by : Ahmet Koleoglu
//description : Hospital workers and their informations
//
// 
import java.text.NumberFormat;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat cfmt = NumberFormat.getCurrencyInstance();
		System.out.println("Welcome to our Hospital");
		System.out.println("");
		double total = 0.0;
		//create a HospitalEmployee called worker1
		HospitalEmployee worker1 = new HospitalEmployee();
		HospitalEmployee worker2 = new HospitalEmployee("Sue Smart",1122,0.0,10.50);
		
		
		//display the state of object worker1 using the toString method
		
		System.out.println("Beginning state of object worker1: \n"+worker1.toString());
		System.out.println("");
		//set the pay rate of worker1 to 20.00 using the setPayRate method
		worker1.setPayRate(20.00);
		
		//display the state of object worker1 using the toString method
		System.out.println("After pay rate is set: \n"+worker1.toString());
		System.out.println("");
		
		//change/increase the pay rate of worker1 by 4.50 using the changePayRate method
		worker1.changePayRate(4.50);
		//change/increase the hours worked of worker1 by 30 using the changeHoursWorked method
		worker1.changeHoursWorked(30.0);
		//display the state of worker1 using the toString method
		System.out.println("After pay rate and hours worked increase: \n"+worker1.toString());
		System.out.println("");
		//display the name and gross pay of worker1 using getEmpName and calculateGrossPay methods.
	
		System.out.println("Employee "+ worker1.getEmployee()+" earned "+cfmt.format(worker1.calculateGrossPay()));
		System.out.println("");
		//display the name, bonus, and total earnings of worker1. Use the calculateBonus method when
		//calculating the bonus for worker1. worker1 is an excellent employee.
		total = worker1.calculateBonus("excellent")+worker1.calculateGrossPay();
		System.out.println("After bonus: "+worker1.getEmployee()+" received a bonus of "+cfmt.format(worker1.calculateBonus("excellent"))+" and earned a total of "+cfmt.format(total));
		System.out.println("");
		System.out.println("");
		System.out.println("======================================");
		System.out.println("");
		System.out.println("");
		System.out.println("Creating another Hospital Employee");
		System.out.println("");
		System.out.println("State of worker1: "+ worker1.toString());
		System.out.println("");
		System.out.println("State of worker2: "+ worker2.toString());
		System.out.println("");
		
		
		worker2.setPayRate(12.25);
		worker2.setHoursWorked(15.00);
		worker2.setPayRate(-10.25);
		System.out.println("State of workers after worker2 pay rate and hours worked reset.");
		System.out.println("");
		System.out.println("State of worker1: "+ worker1.toString());
		System.out.println("");
		System.out.println("State of worker2: "+ worker2.toString());
		System.out.println("");
		
		System.out.println("Employee "+ worker2.getEmployee()+" earned "+ cfmt.format(worker2.calculateGrossPay()));
		System.out.println("");
		double totalnew = worker2.calculateBonus(5)+worker2.calculateGrossPay();
		System.out.println("After bonus: "+worker2.getEmployee()+" received a bonus of "+cfmt.format(worker2.calculateBonus(5))+" and earned a total of "+cfmt.format(totalnew));
		System.out.println("");
		
		System.out.println("Number of HospitalEmployees created : "+ HospitalEmployee.getHospitalEmployeeCount());
		System.out.println("");
		
		System.out.println("Goodbye");

	}
/*
 Welcome to our Hospital

Beginning state of object worker1: 
Employee: Ahmet Koleoglu empnumber: 9999 hoursWorked: 0.0 payRate : $0.00

After pay rate is set: 
Employee: Ahmet Koleoglu empnumber: 9999 hoursWorked: 0.0 payRate : $20.00

After pay rate and hours worked increase: 
Employee: Ahmet Koleoglu empnumber: 9999 hoursWorked: 30.0 payRate : $24.50

Employee Ahmet Koleoglu earned $735.00

After bonus: Ahmet Koleoglu received a bonus of $500.00 and earned a total of $1,235.00


======================================


Creating another Hospital Employee

State of worker1: Employee: Ahmet Koleoglu empnumber: 9999 hoursWorked: 30.0 payRate : $24.50

State of worker2: Employee: Sue Smart empnumber: 1122 hoursWorked: 0.0 payRate : $10.50

State of workers after worker2 pay rate and hours worked reset.

State of worker1: Employee: Ahmet Koleoglu empnumber: 9999 hoursWorked: 30.0 payRate : $24.50

State of worker2: Employee: Sue Smart empnumber: 1122 hoursWorked: 15.0 payRate : $12.25

Employee Sue Smart earned $183.75

After bonus: Sue Smart received a bonus of $3,000.00 and earned a total of $3,183.75

Number of HospitalEmployees created : 2

Goodbye

 */
}