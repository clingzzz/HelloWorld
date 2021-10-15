package pro2;
import java.util.Scanner;
public class two10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
      System.out.print("Enter an amount in double, for example 11.65: ");
	  double amount = input.nextDouble();
	  int remainingAmount = (int)(amount * 100);
	  int numberOfOneDollars = remainingAmount / 100;
	  remainingAmount = remainingAmount % 100;
	  int numberOfQuarters = remainingAmount / 25;
	  remainingAmount = remainingAmount % 25;
	  int numberOfDimes = remainingAmount / 10;
	  remainingAmount = remainingAmount % 10;
	  int numberOfNickels = remainingAmount / 5;
	  remainingAmount = remainingAmount % 5;
	  int numberOfPennies = remainingAmount;
	  System.out.print("Your amount " + amount + " consists of");
	  System.out.print(" " + numberOfOneDollars + " dollars");
	  System.out.print(" " + numberOfQuarters + " quarter");
	  System.out.print(" " + numberOfDimes + " dimes");
	  System.out.print(" " + numberOfNickels + " nickels");
	  System.out.print(" " + numberOfPennies + " pennies");
	}

}
