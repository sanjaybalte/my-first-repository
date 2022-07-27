package constructorStudy;

public class withparaConstructor {
	int num1;
	int num2;
	int num3;
	
	public withparaConstructor()// user defined without parameter
	{
		num1=250;
		num2=350;
		num3=450;
	
	}
	
	public withparaConstructor(int a)// with single parameter
	{
		num1 =a;
	}
	
	public withparaConstructor(int a, int b)// with double parameter
	{
		num1=a;
		num2=b;
	}
	public withparaConstructor(int a, int b, int c)// with three parameter
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	public static void main(String[] args) {
		
		withparaConstructor c1 = new withparaConstructor();// object created with default value zero
		c1.addition();
		withparaConstructor c2 = new withparaConstructor(100); // object created with some default value 
		c2.addition();
		withparaConstructor c3 = new withparaConstructor(120, 250);
		c3.addition();
		withparaConstructor c4 = new withparaConstructor(100, 200, 300);
		c4.addition();
		

	}
	public void addition()
	{
		int sum= num1+num2+num3;
		System.out.println(sum);
		
		
	}
}
