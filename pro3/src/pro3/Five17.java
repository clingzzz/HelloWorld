package pro3;
import java.util.Scanner;
public class Five17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n=input.nextInt();
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=n-1+i;++j) {
				if(Math.abs(j-n)<=i-1) {
					int number=Math.abs(j-n)+1;
					String str=String.format("%3d", number);
					System.out.print(str);
				}
				else System.out.print("   ");
				
			}
		System.out.println();
		}
	}

}
