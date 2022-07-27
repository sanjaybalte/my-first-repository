package accesss_specifier;

public class privateuse {

	public static void main(String[] args) {
		

		privateuse p = new privateuse();
		p.test1();
		p.test2();
		p.test3();
		p.test4();
		
		
		
		
	}
	
	private void test1()
	{
		System.out.println("this private test1 method");
	}
	 void test2()
	{
		System.out.println("this default test2 method");
	}
	 protected void test3()
	{
		System.out.println("this protected test3 method");
	}
	 public void test4()
	{
		System.out.println("this private test method");
	}
	
	
	
	
	
	
	
}
