/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		double delta=Math.pow(b,2)-4*a*c;
		if(a==0) {
			System.out.printf("PT có nghiêm x = %f",-c/b);
		}else {
			if(delta<0)
				System.out.println("PT vô nghiệm");
			if(delta==0)
				System.out.printf("PT có nghiệm kép x = %f",-b/(2*a));
			else {
				System.out.printf("PT có 2 nghiệm x1 = %f\n",(-b+Math.sqrt(delta))/(2*a));
				System.out.printf("PT có 2 nghiệm x2 = %f",(-b-Math.sqrt(delta))/(2*a));
			}
		}
	}

}
