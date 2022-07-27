package controlstatement;

public class else_ifStatement {

	public static void main(String[] args) {
		
		// else if statement are used if we have  multiple test condition
		int marks =85;
		
		if(marks>=67)
		{
			System.out.println("you are pass with distinction");
		}
		else if (marks>=60)
		{
			System.out.println("you are pass with first class");
		}
		else if (marks>=40)
		{
			System.out.println("you are pass with second class");
			
		}
		else
		{
			System.out.println("sorry, you are fail ");
		}
	
		
	}

}
