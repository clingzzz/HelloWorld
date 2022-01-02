package pro3;
import java.util.Scanner;
public class Five32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int a=(int)(Math.random()*9)+1;
		int b=a;
		while(b==a) {
			b=(int)(Math.random()*10);
		}
		int number=a*10+b;
		System.out.println(number);
		System.out.print("Enter a number: ");
		int guess=input.nextInt();
		if(guess==number)
			System.out.println("Exact match");
		else System.out.println("Sorry, no match");
	}

}
