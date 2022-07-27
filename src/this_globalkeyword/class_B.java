package this_globalkeyword;

public class class_B extends class_A{
	
	
	int a=500;
	

	public static void main(String[] args) {
		
		class_B b = new class_B();
		b.display();
	}
	public void display()
	{
		int a=200;
		System.out.println("local variable a is "+a);
		System.out.println("global variable a from same class "+this.a);
		System.out.println("global variable a from super class "+super.a);
		
	}
}
