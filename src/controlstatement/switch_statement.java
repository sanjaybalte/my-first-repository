package controlstatement;

public class switch_statement {

	public static void main(String[] args) {
		// if we have multiple cases
		int year=1;
		switch (year)
		{
		case 1:
			System.out.println("welcome to first year engineering");
		break;
		case 2:
			System.out.println("welcome to second year engineering");
		break;
		case 3:
			System.out.println("welcome to third year engineering");
			break;
		case 4:
			System.out.println("welcome to forth year engineering");
			break;
		default:
			System.out.println("please enter valid input bet 1 to 4");
		
		}

		System.out.println("=======================");
		String city="aurangabad";
		switch (city)
		{
		case "pune":
			System.out.println("welcome to Pune");
		break;
		case "mumbai":
			System.out.println("welcome to Mumbai");
		break;
		case "Nagpur":
			System.out.println("welcome to Nagpur");
			break;
		case "nashik":
			System.out.println("welcome to Nashik");
			break;
		default:
			System.out.println("please enter valid city");
		
		}
		
		
		
		
		
		
		
	}

}
