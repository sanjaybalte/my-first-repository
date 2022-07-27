package inheritance_study;

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// Two sub classes acquire properties from one superclass at same time

		RBI R = new RBI();
		R.reporate();
		R.homeloan();
		
		System.out.println("========================");
		
		SBI S = new SBI();
		S.homeloan();
		S.reporate();
		S.netbanking();
		S.savingacc();
		
		System.out.println("========================");
		
		HDFC H = new HDFC();
		H.homeloan();
		H.reporate();
		H.cashdeposit();
		H.Nify50();
		
		
	}

}
