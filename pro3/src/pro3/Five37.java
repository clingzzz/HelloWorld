package pro3;
import java.util.Scanner;
public class Five37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a decimal integer: ");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int n=number;
		String str="";
		while (number>0) {
			String s=number%2+"";
			str=s+str;
			number=(int)(number/2);
		}
		System.out.println("The binary form of the decimal number "+n+" is "+str);
	}

}
