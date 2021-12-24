package pro6;
import java.util.Random;
public class Nine4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number=new Random(1000);
		for(int i=1;i<=50;++i) {
			System.out.print(number.nextInt(100)+" ");
		}
	}

}
