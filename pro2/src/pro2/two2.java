package pro2;

import java.util.Scanner;
public class two2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
      System.out.print("Enter a numer for radius:");
      double radius = input.nextDouble();
      double area = radius * radius * 3.14159;
      System.out.println("The area for the circle of radius " + " is " + area);
	}

}
