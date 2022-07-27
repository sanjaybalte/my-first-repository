package inheritance_study;

public class singlelevel_inheritance {

	public static void main(String[] args) {
		// for single level inheritance we should have 2 classes
		parents p = new parents();// create object of parents
		p.care();
		p.struggle();
		
		System.out.println("========================");
		child c = new child();
		c.care();
		c.struggle();
		c.laptop();
		c.bike();
		
		
		
		
		
	}

}
