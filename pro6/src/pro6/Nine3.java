package pro6;
import java.util.Date;
public class Nine3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(long seconds=10000;seconds<=100000000000L;seconds*=10) {
			Date date=new Date(seconds);
			System.out.println(date.toString());
		}
	}
}
