package pro4;
import java.util.Scanner;
public class Eight6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		System.out.print("Enter matrix1:");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				m1[i][j] = input.nextDouble();
		System.out.print("Enter matrix2:");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				m2[i][j] = input.nextDouble();
		double[][] nums = multiMatrix(m1, m2);
		System.out.println(m1[0][0] + " " + m1[0][1] + " " + m1[0][2] + "   " + m2[0][0] + " " + m2[0][1] + " "
				+ m2[0][2] + "   " + nums[0][0] + " " + nums[0][1] + " " + nums[0][2]);
		System.out.println(m1[1][0] + " " + m1[1][1] + " " + m1[1][2] + " * " + m2[1][0] + " " + m2[1][1] + " "
				+ m2[1][2] + " = " + nums[1][0] + " " + nums[1][1] + " " + nums[1][2]);
		System.out.println(m1[2][0] + " " + m1[2][1] + " " + m1[2][2] + "   " + m2[2][0] + " " + m2[2][1] + " "
				+ m2[2][2] + "   " + nums[2][0] + " " + nums[2][1] + " " + nums[2][2]);
}

public static double[][] multiMatrix(double[][] a,double[][] b){
    int rows = a.length;
    int columns = b[0].length;
    double[][] nums = new double[rows][columns];
    for(int i=0;i<rows;i++)
        for(int j=0;j<rows;j++){
            for(int k=0;k<a[0].length;k++)
            	nums[i][j]+=a[i][k]*b[k][j];
        }
    return nums;
}
}
