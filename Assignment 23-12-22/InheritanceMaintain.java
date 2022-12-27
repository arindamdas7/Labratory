package oops;

class Employee2
{
	long employeeId, employeePhone;
	String employeeName, employeeAddress;
	double basicSalary;
	final double specialAllowance = 250.80;
	final double Hra = 1000.50;
	public Employee2(long employeeId, long employeePhone, String employeeName, String employeeAddress,
			double basicSalary) 
	{
		this.employeeId = employeeId;
		this.employeePhone = employeePhone;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.basicSalary = basicSalary;
	}
	public Employee2() 
	{
		
	}
	
	
	//method named calculated salary to calculate salary using basic salary with special allowance and hra
	public double calculatedSalary() 
	{
		double salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		return salary;
	}
	
	
	//method named calculateTransportAllowance to calculate the transporting allowance using basic salary
	public double calculateTransportAllowance() 
	{
		return (10*basicSalary)/100;
	}
	public void calculateSalary()
	{
		long salary;
		
	}
}
class Manager extends Employee2
{
	
	//overloading constructor
	public Manager(long Id, String Name, String address, long phone,double salary) 
	{
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress= address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}

	
	
	 
	@Override
	public String toString()
	{
		return "Manager [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + Hra + "]";
	}




	//method named calculateTransportAllowance to calculate the transporting allowance using basic salary
	public double calculateTransportAllowance() {
		return (15*basicSalary)/100;
	}
	
}
	class Trainee extends Employee2
	{
		public Trainee(long Id, String Name, String address, long phone,double salary) {
			this.employeeId = Id;
			this.employeeName = Name;
			this.employeeAddress= address;
			this.employeePhone = phone;
			this.basicSalary = salary;
	}

	@Override
	public String toString() {
		return "Trainee [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + Hra + "]";
	}
	
	
}

public class InheritanceMaintain
{

	public static void main(String[] args) 
	{
		Manager emp1 = new Manager(101,"Arindam Das","Kolkata",9563908202l,75000);
		System.out.println("Details of Manager are :"+emp1);
		System.out.println("Salary of "+emp1.employeeName+" is :"+emp1.calculatedSalary());
		System.out.println("Transport Allowance of "+emp1.employeeName+" is :"+emp1.calculateTransportAllowance());
		
		System.out.println("");
	
		Trainee emp2 = new Trainee(401,"Abhijit Ghosh","Mumbai",8617069095l,15000);
		System.out.println("Details of Trainee are :"+emp2);
		System.out.println("Salary of "+emp2.employeeName+" is :"+emp2.calculatedSalary());
		System.out.println("Transport Allowance of "+emp2.employeeName+" is :"+emp2.calculateTransportAllowance());

	}

}
