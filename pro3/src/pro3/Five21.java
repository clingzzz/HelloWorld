package pro3;
import java.util.Scanner;
public class Five21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		int loanAmount=input.nextInt();
		System.out.print("Number of Years: ");
		int year=input.nextInt();
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		for(double rate=0.05;rate<=0.08;rate=rate+0.00125) {
			double monthlyPayment=loanAmount*rate/12/(1-1/Math.pow(1+rate/12, year*12));
			double totalPayment=monthlyPayment*year*12;
			System.out.println(String.format("%.3f",rate*100)+"%           "+String.format("%.2f", monthlyPayment)+"             "+String.format("%.2f",totalPayment));	
		}
	}

}
