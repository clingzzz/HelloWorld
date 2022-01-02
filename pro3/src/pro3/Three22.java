package pro3;
import java.util.Scanner;
public class Three22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		x=x*1.0;
		y=y*1.0;
		if(x*x+y*y<=100) {
			System.out.println("Point ("+x+", "+y+") is in the circle");
		}
		else
			System.out.println("Point ("+x+", "+y+") is not in the circle");
	}

}
