package day1;
public class Employe {
	String EmpName;
	int EmpId;
	double Salary;
	String Adress;
	int Contact;
public static void main(String[] args) {
	Employe E1=new Employe();
	E1.EmpName="Thiru";
	E1.EmpId=101;
	E1.Salary=30000;
	E1.Adress="Kurnool";
	E1.Contact=9610;
	System.out.println("Employe Name :"+E1.EmpName);
	System.out.println("Employe Id :"+E1.EmpId);
	System.out.println("Salary :"+E1.Salary);
	System.out.println("Adress :"+E1.Adress);
	System.out.println("Contact :"+E1.Contact);
	Employe E2=new Employe();
	E2.EmpName="Shobana";
	E2.EmpId=102;
	E2.Salary=50000;
	E2.Adress="Kurnool";
	E2.Contact=8074;
	System.out.println("Employe Name :"+E2.EmpName);
	System.out.println("Employe Id :"+E2.EmpId);
	System.out.println("Salary :"+E2.Salary);
	System.out.println("Adress :"+E2.Adress);
	System.out.println("Contact :"+E2.Contact);
}
}
