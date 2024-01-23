import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanncer =new Scanner(System.in);
		System.out.print("Nhập chiều dài HCN: ");
		double CD = scanncer.nextDouble();
		System.out.print("Nhập chiều rộng HCN: ");
		double CR = scanncer.nextDouble();
		double CV=(CD+CR)*2;
		double DT=CD*CR;
		System.out.printf("Chu vi: %.1f",CV);
		System.out.printf("\nDiện tích: %.1f",DT);
	}

}
