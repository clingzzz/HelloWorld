package pro3;
import java.util.Scanner;
public class Three19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
      System.out.print("���������ε������ߣ�");
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      if(a+b>c&&a+c>b&&b+c>a) {
    	  System.out.print("�����ε��ܳ�Ϊ:");
    	  System.out.println(a+b+c);
      }
      else
    	  System.out.print("�޷�����������");
	}

}
