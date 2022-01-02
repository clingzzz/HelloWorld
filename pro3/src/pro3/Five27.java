package pro3;

public class Five27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0;
		for(int i=101;i<=2100;i=i+1) {
			if((i%4==0&&i%100!=0)||(i%400==0)) {
				System.out.print(i+" ");
				t=t+1;
				if(t==10) {
					System.out.println();
					t=0;
				}
			}
		}
	}

}
