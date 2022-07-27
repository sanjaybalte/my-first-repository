package this_globalkeyword;

public class thiskeyword {

	int a=200;
	int b=300;
	static int z=10;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thiskeyword t = new thiskeyword();
		t.display();
		
		
		
	}
	public void display()
	{
		int a=10;
		int b=20;
		int z =1000;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(this.z);
		System.out.println(z);
		
		
		
		
		
	}
}
