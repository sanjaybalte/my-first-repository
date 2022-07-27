package methodStudy;

public class static_method {
	
	
	public static void demo2()
	{
		System.out.println("this is demo 2 method ");
	}

	public static void main(String[] args) 
	{
		// method is a block of code which only runs when it is called
		
		demo();// to call static method from same class just call method name
		
		static_method s = new static_method();// we can call static method by creating object also
		s.demo();
		demo1();
		demo2();
		comman_class.sinhgadistitute();// sinhgadinstitute method call from another class
		// syntax---> calssname.methodname
		
	}

	public static void demo()
	{
		System.out.println("this is the demo method of static study");
	}
	public static void demo1()
	{
		System.out.println("this is the demo1 method");
	}
	
	
}
