package pro3;

public class Five7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=10000;
		for(int i=1;i<=9;++i) {
			money=money*1.05;
		}
		System.out.println("�ӽ��������10���ѧ��Ϊ"+money+"Ԫ");
		money=money*1.05;
		double sum=money;
		for(int i=1;i<=4;++i) {
			sum=sum+money*1.05;
		}
		System.out.println("�����ڿ�ʼ��10�������4������ѧ����"+sum+"Ԫ");
	}

}
