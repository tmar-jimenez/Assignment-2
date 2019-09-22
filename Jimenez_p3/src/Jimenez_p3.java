import java.util.Scanner;

public class Jimenez_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] topics = {"Bananas","Apples","Pears","Cherries","Pineapples"};
		
		int[][] responses = new int[5][10];
		double counter=0;
		
		boolean i = true;
		
		while (i)
		{
			System.out.println("Rate the following fruits on a scale from 1-10");
			
			for (int j = 0; j < 5 ; j++ )
				{
				System.out.println(topics[j] + ": ");
				Scanner scnr = new Scanner (System.in);
				int k = scnr.nextInt();
				
				responses [j][k-1] ++;	
				}
			
			System.out.println("Do you wanna continue? \n"
					+ "Yes (1) or No (2)?");
			
			int t;
			Scanner scnr = new Scanner (System.in);
			t = scnr.nextInt();
			
			if (t != 1)
				i = false;
			counter++;
		}
	 int[] results = new int [5];
	 
	 for(int j = 0; j < 5; j++) {
		 System.out.print(topics[j] + ": ");
		 for(int k = 0; k < 10; k++){
			 results[j] += responses[j][k] * (k+1);
			 
			 System.out.print(responses[j][k] + " ");
		 }
		 
		 System.out.print((double)results[j] / counter);
		 
		 System.out.println("");
	 }
	 

	}

}
