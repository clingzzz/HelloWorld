package pro3;
import java.util.Scanner;
public class Five38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a decimal integer: ");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int n=number;
		String str="";
		while (number>0) {
			String s=number%8+"";
			str=s+str;
			number=(int)(number/8);
		}
		System.out.println("The octal form of the decimal number "+n+" is "+str);
	}
}
