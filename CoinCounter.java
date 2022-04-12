import java.util.Scanner;
/* Oscar Chavez
 *  March 17th, 2022
 */



public class CoinCounter
{

	public static void main(String[] args) 
	{
		//We will count the number of coins necessary to give exact change
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the amount of change owed: ");
		
		double changeInput = kb.nextDouble();
		
		//declaring variables
		int changeOwed = (int) (Math.round(changeInput*100));
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;
		
		// counting quarters
		while (changeOwed >= 25)
				
				{
				quarters ++;
				changeOwed = changeOwed - 25;
				}

		System.out.println("Number of quarters : " + quarters);
	
		//counting dimes
		while (changeOwed >= 10)
				
				{
				dimes++;
				changeOwed = changeOwed - 10;
				}

		System.out.println("Number of dimes : " + dimes);
		
		// counting nickles
		while (changeOwed >=5)
			
				{
				nickles++;
				changeOwed = changeOwed - 5;
				}

		System.out.println("Number of nickles: " + nickles);

		//counting pennies
		while (changeOwed >= 1 )
			
				{
				pennies++;
				changeOwed = changeOwed - 1;
				}
			
		System.out.println("Number of pennies: " + pennies);
		

			
			
		// adding the total amount of coins 
		int numCoins = quarters + dimes + nickles + pennies;
		System.out.printf("\nYou will have %d coins in all.", numCoins);
		
		
		//closing scanner
		kb.close();
		
		
	}
		
		

}


