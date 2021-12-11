package pro4;
import java.util.Scanner;
public class Seven19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the list: ");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int list[]=new int[n];
		System.out.print("Enter the contents of the list: ");
		for(int i=0;i<n;++i) {
			list[i]=input.nextInt();
		}
		System.out.print("The list has "+n+" integers ");
		for(int e:list) {
			System.out.print(e+" ");
		}
		System.out.println("");
		if(isSorted(list))
			System.out.println("The list is already sorted");
		else System.out.println("The list is not sorted");
	}
	public static boolean isSorted(int[] list) {
		for(int i=1;i<=list.length-1;++i) {
			if(list[i]<list[i-1])
				return false;
		}
		return true;
	}
}
