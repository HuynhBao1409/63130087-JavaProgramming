package GiaBao.edu;
import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số sv:");
		int n= scanner.nextInt();
		 scanner.nextLine();
		String[] names = new String[n];
		double[] diem = new double[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Nhập sv thứ %d:\n",i);
			System.out.println("Họ tên: ");
			names[i]= scanner.nextLine();
			System.out.println("Điểm: ");
			diem[i]= scanner.nextDouble();
			 scanner.nextLine();
		}
		//Xuat thong tin sinh vien và hoc luc
		System.out.println("THÔNG TIN SINH VIÊN");
		for(int i=0;i<n;i++) {
			System.out.printf("Sv thứ %d:",i);
			System.out.printf("Họ tên: %s\n",names[i]);
			System.out.printf("Điểm: %.2f\n",diem[i]);
			System.out.printf("Học lực: %s\n",xeploai(diem[i]));
		}
		//Sap xep tang dan
        Sapxep(names, diem);
        
        //Xuat danh sach
        System.out.println("\nDanh sách sv sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Họ và tên: %s\n",names[i]);
            System.out.printf("Điểm: %.2f\n",diem[i]);
        }
		
		

	}
	//Xep loai hoc luc
	public static String xeploai(double diem) {
		if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
	}
	//Xap xep tang dan theo diem
	public static void Sapxep(String[] names,double diem[]) {
		int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    //Hoan doi ho ten
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                    
                    //Hoan doi diem
                    double tempScore = diem[j];
                    diem[j] = diem[j + 1];
                   diem[j + 1] = tempScore;
                }
            }
        }
	}

}
