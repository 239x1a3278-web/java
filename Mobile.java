package day1;
public class Mobile {
	String MobName;
	int Price;
	String Colour;
	String Brand;
	double BatteryCapacity;
public static void main(String[] args) {
	Mobile M=new Mobile();
	M.MobName="vivo";
	M.Price=20000;
	M.Colour="Blue";
    M.Brand="Android";
	M.BatteryCapacity=100;
	System.out.println("Mobile name : "+M.MobName);
	System.out.println("Price : "+M.Price);
	System.out.println("Colour : "+M.Colour);
	System.out.println("Brand : "+M.Brand);
	System.out.println("BatteryCapacity : "+M.BatteryCapacity);
}
}
