package pro3;

public class Five26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10000;i<=100000;i=i+10000) {
			double e=1;
			double item=1;
			for(int j=1;j<=i;++j) {
				item=item*j;
				e=e+1/item;
			}
			System.out.println("µ±i="+i+"Ê±£¬e="+e);
		}
	}

}
