package studio2;
import java.util.Scanner;
import java.lang.Math;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int startAmount = scan.nextInt();
		System.out.println("Amount of starting money: " + startAmount);
	
		double winChance = scan.nextDouble();
		System.out.println("The win chance is " + winChance);
		double winLimit = scan.nextDouble();
		System.out.println("The win limit is " + winLimit);
		
		int gain = 50;
		int loss = 50;
		double totalWinLimit = winLimit + startAmount;
		int win = 0;
		int fail = 0;
	
		int totalSimulate = scan.nextInt();
		System.out.println("Total days simulated: " + totalSimulate);
		double totalDays = totalSimulate;
		
		while((startAmount > 0 &&  startAmount != totalWinLimit) && totalSimulate > 0) {
			if(winChance > Math.random()) {
				startAmount = startAmount + gain;
				//System.out.println("success, remaining balance is " + startAmount);
				win++;
				
			} else {
				startAmount = startAmount - loss;
				//System.out.println("ruin, remaining balance is " + startAmount);
				fail++;
						
			}
			System.out.println("Day " + totalSimulate + " had " + win + " wins and " + fail + " losses ");
			
			
			totalSimulate--;
			
			
			
		}
		
        if(totalDays > 0) {
			
			double ruin = (fail / totalDays) * 100;
			System.out.println("The ruin rate is " + ruin + "%");
			
			}
		
		
		
		//you should use a for loop for days (know exact amount of days)
		
		
		
		
		
		
		

		System.out.println("Game is over and the amount in balance is " + startAmount);
		
		
		
		
		
		
		
	}

}

