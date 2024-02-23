package GiaBao.edu;
import java.util.Arrays;
import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số ptử trong mảng");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập số ptử trong mảng");
		for(int i=0;i<n;i++) {
			System.out.printf("Ptử thứ %d: ",i);
			arr[i]= scanner.nextInt();
		}
		//sap xep 
		Arrays.sort(arr);
		System.out.printf("Sau khi sắp xếp: %s\n",Arrays.toString(arr));
		//ptu nho nhat
		int min = arr[0];
		for(int i = 1;i<n;i++) {
			min=Math.min(min, arr[i]);
		}
		System.out.printf("Ptử nhỏ nhất: %d\n",min);
		//tb cong chia het cho 3
		int sum =0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%3==0) {
				sum+=arr[i];
				count++;
			}
		}
		System.out.printf("Tb cộng các ptử chia hết cho 3: %.2f",(double)sum/count);
	}

}
