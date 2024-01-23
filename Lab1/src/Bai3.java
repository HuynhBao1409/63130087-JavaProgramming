/**
 * 
 */

/**
 * 
 */
import java.util.Scanner; 
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh lập phương: ");
		double canh = scanner.nextDouble();
		double DT=Math.pow(canh,3);
		System.out.printf("Thể tích lập phương %.1f",DT);
	}

}
