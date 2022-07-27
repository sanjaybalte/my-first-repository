package variableStudy;

public class static_study {
	static int a=200;// global static variable
	
	
	public static void main(String[] args) {
		
		static_study s = new static_study();
		s.display();
		
		System.out.println("the value of a is "+a);
		System.out.println(" the value of p is "+static_study1.p);
		

	}
	public void display()
	{
		int b=300;
		System.out.println("value of b is "+b);// local variable
		System.out.println("value of a is "+a);// global variable
		
		
	}
	
	
	
}
