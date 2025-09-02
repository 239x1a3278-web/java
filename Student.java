package day1;
public class Student{
	String StdName="Scott";
	int RegNum=101;
	String Branch="CSE";
public static void main(String[] args){
	//creating the first object
	Student S1=new Student();
    System.out.println("Student Name : "+S1.StdName);
    System.out.println("Register Num : "+S1.RegNum);
    System.out.println("Branch : "+S1.Branch);
    Student S2=new Student();
    System.out.println("Student Name : "+S2.StdName);
    System.out.println("Register Num : "+S2.RegNum);
    System.out.println("Branch : "+S2.Branch);
}
}
