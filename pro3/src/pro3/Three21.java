package pro3;
import java.util.Scanner;
public class Three21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	java.util.Scanner input=new Scanner(System.in);
      System.out.print("Enter year: (e.g., 2012): ");
      int year=input.nextInt();
      System.out.print("Enter month: 1-12: ");
      int m=input.nextInt();
      if(m==1||m==2) {
    	  m=m+12;
    	  year=year-1;
      }
      System.out.print("Enter the day of the month: 1-31: ");
      int q=input.nextInt();
      int j=year/100;
      int k=year%100;
      int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
      System.out.print("Day of the week is ");
      switch(h) {
      case 0: System.out.println("Saturday");
      		break;
      case 1: System.out.println("Sunday");
      		break;
      case 2: System.out.println("Monday");
      		break;
      case 3: System.out.println("Tuesday");
      		break;
      case 4: System.out.println("Wednesday");
      		break;
      case 5: System.out.println("Thursday");
      		break;
      case 6: System.out.println("Friday");
      		break;
      }
	}
}
