package pro4;
import java.util.Scanner;
public class Seven7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int[] list=new int[1000];
		System.out.print("Enter the integers between 1 and 100: ");
		int i=0;
		int n=input.nextInt();
		while(n!=0) {
			list[i]=n;
			n=input.nextInt();
			i++;
		}
		int[] times=new int[99];
		for(@SuppressWarnings("unused") double e:times) {
			e=0;
		}
		for(int j=0;j<99;++j) {
			for(int t=0;t<i-1;++t) {
				if(j+1==list[t])
					times[j]++;
			}
			if(times[j]!=0) {
				System.out.println(j+1+" occurs "+times[j]+" times");
			}
		}
		
	}

}
