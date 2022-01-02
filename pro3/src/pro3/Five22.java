package pro3;
import java.util.Scanner;
public class Five22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		int loanAmount=input.nextInt();
		System.out.print("Number of Years: ");
		int year=input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate=input.nextInt();
		System.out.println();
		rate=rate/1200;
		double monthlyPayment=loanAmount*rate/(1-1/Math.pow(1+rate, year*12));
		double totalPayment=monthlyPayment*year*12;
		System.out.println("Monthly Payment: "+String.format("%.2f",monthlyPayment));
		System.out.println("Total Payment: "+String.format("%.2f",totalPayment));
		System.out.println();
		System.out.println("Payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
		double balance=loanAmount;
		for(int i=1;i<=year*12;++i) {
			double interest=rate*balance;
			double principal=monthlyPayment-interest;
			balance=balance-principal;
			System.out.println(i+"\t\t"+String.format("%.2f",interest)+"\t\t"+String.format("%.2f", principal)+"\t\t"+String.format("%.2f",balance));
		}
	}

}
