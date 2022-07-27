package inheritance_study;

public class multilevel_inheritance {

	public static void main(String[] args) {
		// one sub class acquiring properties from another and that class acquire properties from another class(3 or more than 3 class should be available) 
		SPPU s = new SPPU();
		s.oral();
		s.insemexam();
		
		System.out.println("=====================");
		
		collage c = new collage();
		c.gathering();
		c.farewell();
		c.insemexam();
		c.oral();
		
		System.out.println("==================");
		
		Deptartment d = new Deptartment();
		d.oral();
		d.farewell();
		d.gathering();
		d.insemexam();
		d.UT();
		d.prelim();
		

	}

}
