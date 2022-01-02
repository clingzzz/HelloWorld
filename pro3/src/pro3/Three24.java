package pro3;

public class Three24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suit= {"Clubs","Dimonds","Hearts","Spades"};
		int a=(int)(Math.random()*13);
		int b=(int)(Math.random()*4);
		System.out.println("The card you picked is "+number[a]+" of "+suit[b]);
	}

}
