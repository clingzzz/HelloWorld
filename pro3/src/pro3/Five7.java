package pro3;

public class Five7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=10000;
		for(int i=1;i<=9;++i) {
			money=money*1.05;
		}
		System.out.println("从今年算起第10年的学费为"+money+"元");
		money=money*1.05;
		double sum=money;
		for(int i=1;i<=4;++i) {
			sum=sum+money*1.05;
		}
		System.out.println("从现在开始的10年后算起，4年内总学费是"+sum+"元");
	}

}
