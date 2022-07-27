package variableStudy;

public class Hr_portal {

	public static void main(String[] args) 
	{
		
		Employee sanjay= new Employee();
		sanjay.emp_id=450;
		sanjay.emp_salary=12000;
		sanjay.RM="P.kumar";
		
		Employee vijay= new Employee();
		vijay.emp_id=550;
		vijay.emp_salary=150000;
		vijay.RM="thakur";
		
		Employee sangita= new Employee();
		sangita.emp_id=560;
		sangita.emp_salary=170000;
		sangita.RM="parab";
		
		
		Employee shital = new Employee();
		shital.emp_id=587;
		shital.emp_salary=120000;
		shital.RM="tarim";
		
		
		Employee poonam = new Employee();
		poonam.emp_id=2020;
		poonam.emp_salary=130000;
		poonam.RM="patil";
		
		
		sanjay.Empinfo();
		vijay.Empinfo();
		sangita.Empinfo();
		shital.Empinfo();
		poonam.Empinfo();
		
		

		
		
		

	}

}
