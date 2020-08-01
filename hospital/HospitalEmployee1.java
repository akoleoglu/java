//Ch 5 program 1  - � HospitalEmployee and Hospital Classes  STUDENTS COMPLETE
//CSC110AA and CIS163AA
//written by : Ahmet Koleoglu
//description : Hospital workers and their informations
//
// 
import java.text.NumberFormat;

public class HospitalEmployee {
	private String empName;
	private int empNumber;
	private double hoursWorked;
	private double payRate;
	public static int hospitalEmployeeCount = 0;
	
	// default constructor. Assigns instance variables a default value.
	// empName to your name,, empNumber to 9999, hoursWorked to 0 , payRate to 0
	public HospitalEmployee() {
		empName = "Ahmet Koleoglu";
		empNumber = 9999;
		hoursWorked = 0.0;
		payRate = 0.0;
		hospitalEmployeeCount++;
		
	}
	public HospitalEmployee(String empName,int empNumber, double hoursWorked,double payRate ) {
		this.empName = empName;
		this.empNumber = empNumber;
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;
		hospitalEmployeeCount++;
		
	}
	public String getEmployee() {
		return empName;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setEmpName(String ename) {
		empName = ename;
	}
	public void setEmpNumber(int enumber) {
		empNumber = enumber;
	}
	public void setHoursWorked(double hours) {
		if(hours>=0) {
			hoursWorked = hours;
		}
		
	}
	public void setPayRate(double rate) {
		if(rate>=0) {
			payRate = rate;
		}
		
	}
	public double calculateGrossPay() {
		return (hoursWorked*payRate);
	}
	public void changeHoursWorked(double hours) {
		hoursWorked = hoursWorked+hours;
	}
	public void changePayRate(double amount) {
		payRate = payRate+amount;
	}
	public double calculateBonus(String rating) {
		if(rating.equals("excellent")) {
			return 500.00;
		}
		else if(rating.equals("satisfactory")) {
			return 300.00;
			
		}
		else 
		{
			return 0.0;
		}
	}
	public double calculateBonus(int diffLevel) {
		//difficulty level of the job of the worker.
		//1 and 2 is low earns bonus 1000.00
		//3 is moderate earns bonus 2000.00
		//4 and 5 is high earns bonus 3000.00
		if (diffLevel==1 || diffLevel==2) {
			return 1000.00;
		}
		else if (diffLevel==3) {
			return 2000.00;
		}
		else if (diffLevel==4 || diffLevel==5) {
			return 3000.00;
		}
		else {
			return 0.00;
		}
		
	}
	public String toString() {
		NumberFormat cfmt = NumberFormat.getCurrencyInstance();
		return ("Employee: "+empName+" empnumber: " +empNumber+" hoursWorked: "+hoursWorked+" payRate : "+cfmt.format(payRate));
	}
	public static int getHospitalEmployeeCount() {
		return hospitalEmployeeCount;
	}
	

	
}