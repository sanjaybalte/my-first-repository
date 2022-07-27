package variableStudy;

public class study1 {
	 int a=20;// non static global variable
	

	public static void main(String[] args) 
	{

		study1 s = new study1();
		s.display();
		s.display1();
		System.out.println("value of a "+s.a);
		
		study2 s2 =new study2();
		
		System.out.println("value of p is "+s2.p);// calling non ststic global variable from another class
				
		
		
		

	}
	public void display()
	{
		int b=300;// non static local variable
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
		
	}
	
	public void display1()
	{
		int c=40; // non static local variable
		int b=50; // non static local variable
		int a= 200; // non static local variable
		System.out.println("value of c is "+c);
		System.out.println("value of b is "+b);
		System.out.println("value of a is "+a);
		
		
	}
	
	
	
}
