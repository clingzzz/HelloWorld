package pro3;
import java.util.Scanner;
public class Five28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=input.nextInt();
		System.out.print("Enter the first year of the year: ");
		int theFirstDay=input.nextInt();
		int totalDay=0;
		for(int i=1;i<=12;++i) {
			switch(i) {
			case 1:
				System.out.print("January 1, "+year+" is ");
				break;
			case 2:
				System.out.print("February 1, "+year+" is ");
				totalDay=totalDay+31;
				break;
			case 3:
				System.out.print("March 1, "+year+" is ");
				if((i%4==0&&i%100!=0)||(i%400==0)) {
					totalDay+=29;
				}
				else totalDay+=28;
			    break;
			case 4:
				System.out.print("April 1, "+year+" is ");
				totalDay+=31;
				break;
			case 5:
				System.out.print("May 1, "+year+" is ");
				totalDay+=30;
				break;
			case 6:
				System.out.print("June 1, "+year+" is ");
				totalDay+=31;
				break;
			case 7:
				System.out.print("July 1, "+year+" is ");
				totalDay+=30;
				break;
			case 8:
				System.out.print("August 1, "+year+" is ");
				totalDay+=31;
				break;
			case 9:
				System.out.print("September 1, "+year+" is ");
				totalDay+=31;
				break;
			case 10:
				System.out.print("October 1, "+year+" is ");
				totalDay+=30;
				break;
			case 11:
				System.out.print("November 1, "+year+" is ");
				totalDay+=31;
				break;
			case 12:
				System.out.print("December 1, "+year+" is ");
				totalDay+=30;
				break;
			}
			int day=(theFirstDay+totalDay)%7;
			switch(day) {
		      case 6: System.out.println("Saturday");
		      		break;
		      case 0: System.out.println("Sunday");
		      		break;
		      case 1: System.out.println("Monday");
		      		break;
		      case 2: System.out.println("Tuesday");
		      		break;
		      case 3: System.out.println("Wednesday");
		      		break;
		      case 4: System.out.println("Thursday");
		      		break;
		      case 5: System.out.println("Friday");
		      		break;
		      }
		}
	}

}
