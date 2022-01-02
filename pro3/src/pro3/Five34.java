package pro3;
import java.util.Scanner;
public class Five34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper(2): ");
		int computerWin=0,guestWin=0;
		while(computerWin<3&&guestWin<3) {
			int computer=(int)(Math.random()*3);
			int guest=input.nextInt();
			if(computer==0) {
				switch(guest) {
				case 0:
					System.out.println("The computer is scissor, You are scissor too. It is a draw");
					break;
				case 1:
					System.out.println("The computer is scissor, You are rock. You won");
					guestWin++;
					break;
				case 2:
					System.out.println("The computer is scissor, You are paper. You lost");
					computerWin++;
					break;
				}
			}
			else if(computer==1) {
				switch(guest) {
				case 0:
					System.out.println("The computer is rock, You are scissor. You lost");
					computerWin++;
					break;
				case 1:
					System.out.println("The computer is rock, You are rock too. It is a draw");
					break;
				case 2:
					System.out.println("The computer is rock, You are paper. You won");
					guestWin++;
					break;
				}
			}
			else {
				switch(guest) {
				case 0:
					System.out.println("The computer is paper, You are scissor. You won");
					guestWin++;
					break;
				case 1:
					System.out.println("The computer is paper, You are rock. You lost");
					computerWin++;
					break;
				case 2:
					System.out.println("The computer is paper, You are paper too. It is a draw");
					break;
				}
			}
			if(computerWin<3&&guestWin<3) {
			System.out.print("scissor (0), rock (1), paper(2): ");
		}
			}
	}

}
