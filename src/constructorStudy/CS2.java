package constructorStudy;

public class CS2 {
	// example of userdefine constructor
	
	String city = "pune";// variable declaration manually
	
	// use of constructor ---> to initiazite
	
	String name; // variable declaration
	
	public CS2()// user define constructor without parameter
	{
		name= "velocity"; // constructor used to initialize
		
		
		
		
		
	}

	public static void main(String[] args) 
	
	{

		display1();
		CS2  c2 = new CS2();
		c2.display();
		
		
		
		
	}
	
	public void display()
	{
		System.out.println("iam non ststic display method");
		System.out.println("my city name is "+city);
		System.out.println("my name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("i am static display1 method");
	}
	
}
