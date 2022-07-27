package constructorStudy;

public class CS1 {
	
	// example of default constructor
	// public CS1()----> default constructor provided by the complier

	public static void main(String[] args)
	{
		// it is the one of the java special method used to initialize object/variables
		//use to load/copy  non static member of class into the object
		CS1 c = new CS1();
		c.display();
		
		commanclass d= new commanclass();// create a object of another class
		d.add();
		
	}
	public void display()
	{
		System.out.println("iam a display method iam a nonstatic");
	}
	
}
