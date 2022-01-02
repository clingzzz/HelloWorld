package pro3;
import java.util.Scanner;
public class Three9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		long number = input.nextLong();
		int i;
		long sum = 0;
		long[] num = new long[9];
		long last = 0;
		for (i = 8; i >-1; i--) {
			num[i] = number % 10;
			number = number / 10;
		}
		System.out.print("The ISBN-10 number is ");
		for (i = 8; i > -1; i = i - 1) {
			System.out.print(num[8-i]);
			sum = sum + num[i] * (i + 1);
		}
		last = sum % 11;
		if (last == 10) {
			System.out.println("X");
		}
		else {
			System.out.println(last);
		}
	}

}
