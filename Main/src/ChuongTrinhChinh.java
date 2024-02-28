import javax. swing. JButton;
import javax.swing. JFrame;
import javax.swing. WindowConstants;

public class ChuongTrinhChinh {
	public static void main (String[] args) {
		JFrame f = new JFrame(); // Tao mot the hien (đoi tợng) cua lớp
		f.setTitle("Vi du JFrame"); //Tieu de cua so
		f.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE) ;
		f.setSize (300,200); // kich thuoc cua so

		// Tạo một nút bam
		JButton btnOK = new JButton ("Nhan toi di");
		JButton btnkhac = new JButton ("Nhan em di") ;
		// gắn lên form
		f.add (btnOK) ;
		f.add (btnkhac) ;
		// Chạy thu thi Em đa de len Toi
		// hiện form/frame
		f.show(); // hien cua so
	}
}
