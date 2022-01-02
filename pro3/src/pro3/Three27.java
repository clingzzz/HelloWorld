package pro3;
import java.util.Scanner;
public class Three27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x-and y-coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double s=2*y*y+2*x*y+0.5*x*x;
		if(x>=0&&y>=0&&s<=20000) {
			System.out.println("The point is in the triangle");
		}
		else 
			System.out.println("The point is not in the triangle");
	}

}
