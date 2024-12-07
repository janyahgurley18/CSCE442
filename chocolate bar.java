package lab04;
import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter the purchase amount
		        System.out.print("Enter the amount of money you have: $");
		        int money = scanner.nextInt();

		        // Each chocolate bar costs $1 and gives 1 coupon
		        int chocolateBars = money;  // Number of bars we can buy with the money
		        int coupons = money;        // Coupons we get initially (1 per bar)

		        // Loop to redeem coupons for additional chocolate bars
		        while (coupons >= 6) {
		            int extraBars = coupons / 6;   // Number of extra bars we can get with coupons
		            chocolateBars += extraBars;    // Add the extra bars to the total count
		            coupons = coupons % 6 + extraBars; // Remaining coupons after redemption
		        }

		        // Display the total number of chocolate bars and remaining coupons
		        System.out.println("You can buy: " + chocolateBars);
		        System.out.println("Coupons remaining: " + coupons);
		    }
		

	}


