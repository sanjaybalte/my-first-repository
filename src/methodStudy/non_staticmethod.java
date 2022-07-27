package methodStudy;

public class non_staticmethod {

	public static void main(String[] args) {
		
		non_staticmethod n = new non_staticmethod(); // create an object of non static method
		n.add();
		n.test();
		n.add(15, 60);
		n.add(15, 20, 30);
		System.out.println("====================");
		comman_class c = new comman_class(); // create an object of other class of non static method
		c.div();
		c.SPPU();
		c.sinhgadistitute();
		
		
		
	}
	public void test()
	{
		System.out.println("this is the test method ");
	}
	public void add()
	{
		int a=20;
		int b=30;
		int sum = a+b;
		System.out.println("the sumession is "+sum);
	}
	
	
	public void add(int x, int y)
	{
		int sum1=x+y;
		System.out.println("the value of sum1 is "+sum1);
	
	
    }
	public void add(int x, int y, int  z)
	{
		int sum1=x+y+z;
		System.out.println("the value of sum1 is "+sum1);
	
	
    }
	
	
	
	
}
