package controlstatement;

public class Nested_loop {

	public static void main(String[] args) {
		// if else statement is nested in if statement then it is called as nested loop or statement
		String username="velocity";
		String password="sanjay@123";
		
		if(username=="velocity")
		{
			System.out.println("correct username please enter password");
			
			if(password=="sanjay@123")
			{
				System.out.println("login sucessfully");
				
			} else
			{
				System.out.println("please enter correct password");
			}
		}
		else
		{
			System.out.println("incorrect username , unable to login");
			
		}
			

		
		

	}

}
