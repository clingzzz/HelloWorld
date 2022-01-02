package pro3;
import java.util.Scanner;
public class Five45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		double sum1=0,sum2=0;
		double x;
		System.out.print("Enter 10 numbers: ");
		for(int i=1;i<=10;i++) {
			x=input.nextDouble();
			sum1+=x;
			sum2+=x*x;
		}
		double average=sum1/10;
		System.out.println("The mean is "+average);
		double variance=Math.pow((sum2-sum1*average)/9,0.5);
		System.out.println("The standard deviation is "+variance);
	}

}
