package variableStudy;

import accesss_specifier.privateuse;

public class protected_class extends privateuse {

	public static void main(String[] args) {
		
		privateuse p = new privateuse();// create a object of another class
		p.test4();
		//p.test3();//
		protected_class p1 = new protected_class();// create object of child class class 
		p1.test3();// calling protected method from another package
		p1.test4();// calling protected method from another package
		

	}

}
