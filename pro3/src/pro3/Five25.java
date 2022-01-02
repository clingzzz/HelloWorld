package pro3;

public class Five25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10000;i<=100000;i=i+10000) {
			double sum=0;
			for(int j=1;j<=i;++j) {
				sum=sum+Math.pow(-1, j+1)/(2*j-1);
			}
			System.out.println("µ±i="+i+"Ê±£¬¦°="+4*sum);
		}
	}

}
