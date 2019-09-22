import java.util.Scanner;

public class Jimenez_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Declaring variables
		
		double height;
		double weight;
		double bmi;
		int system;
		
		Scanner scnr = new Scanner(System.in);
		
	//Asks the user to select their preferred unit system
		
		for(;;)
		{
			System.out.print("Please select between the U.S. System (1)");
			System.out.print(" or the International System (2): ");
		
			
			system = scnr.nextInt();
			
			if (system == 1|| system == 2)
			{
				if (system == 1)
					System.out.println("You have selected the U.S. System!");
				else 
					System.out.println("You have selected the International System!");
			break;
			}
			else
				;
		}
		
	//Asks the user to input the values for height and weight
		
		if (system == 1 )
		{
			System.out.println("Please put your weight in Pounds: ");
			weight = scnr.nextDouble();
			
			System.out.println("Please put your height in Inches: ");
			height = scnr.nextDouble();
			
			bmi = (703 * weight) / (height*height);	
			
		}
		else 
		{
			System.out.println("Please put your weight in Kilograms: ");
			weight = scnr.nextDouble();
			
			System.out.println("Please put your height in Meters: ");
			height = scnr.nextDouble();
			
			bmi = (weight) / (height*height);	
			
		}
		
		System.out.println("Your BMI is " + bmi + "\n");
		System.out.println("According to the BMI categories from the National Heart Lung and Blood Institute:\n\n"
				+ "Underweight = <18.5\n"
				+ "Normal weight = 18.5–24.9\n"
				+ "Overweight = 25–29.9\n"
				+ "Obesity = BMI of 30 or greater");
	}

}
