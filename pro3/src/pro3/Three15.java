package pro3;
import java.util.Scanner;
public class Three15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 900) + 100;
		System.out.println(number);
		System.out.print("输入一个三位整数： ");
		int num = input.nextInt();
		System.out.print("获得奖金：");
		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100;
		int d = number % 10;
		int e = number / 10 % 10;
		int f = number / 100;
		if (number == num) {
			System.out.println("$10000");
		}   
		
		else 
			if((Math.max(Math.max(a, b),c) == Math.max(Math.max(d, e),f)) && (Math.min(Math.min(a, b),c) == Math.min(Math.min(d, e),f)) && ((a+b+c)-Math.max(Math.max(a, b),c)-Math.min(Math.min(a, b),c) == (d+e+f)-Math.max(Math.max(d, e),f)-Math.min(Math.min(d, e),f))){
				System.out.println("$3000");
				}
		else 
			if((Math.max(Math.max(a, b),c) == Math.max(Math.max(d, e),f)) || (Math.min(Math.min(a, b),c) == Math.min(Math.min(d, e),f)) || ((a+b+c)-Math.max(Math.max(a, b),c)-Math.min(Math.min(a, b),c) == (d+e+f)-Math.max(Math.max(d, e),f)-Math.min(Math.min(d, e),f))){
				
					System.out.println("$1000");
					}	
	    else System.out.println("$0");
	}
	} 	
		