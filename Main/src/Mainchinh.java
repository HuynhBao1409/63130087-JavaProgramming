import javax.swing. JButton;
import javax. swing. JFrame;
import javax. swing. WindowConstants;



public class Mainchinh {
	public static void main (String[] args) {
		JFrame f = new JFrame (); // Tạo một the hien (đoi tượng) của lớp
		f.setTitle ("Vi du JFrame"); //Tieu đe cua
		f.setDefaultCloseOperation (WindowConstants. EXIT_ON_CLOSE) ;
		f.setSize (300,200) ;
		//Qui dinh loai bo cuc (Layout)
		f.setLayout (new FlowLayout());
		
		// Tạo một nút bam
		JButton btnOK = new JButton ("Nhan toi di");
		// Tao tai nghe
		BoLangNgheOK ok = new BoLangNgheOK () ;
		// gan vao cho nút OK
		btnOK.addActionListener(ok);
		JButton btnkhac = new JButton ("Nhan em di");
		// gắn lên form
		f.add (btnOK) ;
		f.add (btnkhac);
		// Chay thu thì Em đa de lên Toi
		// hiện form/frame
		f.show (); // hiện cua so
	}
	// Tao bộ lắng nghe (hữu danh) va xử lý cho nút OK
	private static class BoLangNgheOK implements ActionListener

	@override
	public void actionPerformed (ActionEvent e) {
	// Mã xử lý khi user click chuột ở đây
	JDialog dialog = new JDialog ();
	dialog.setTitle ("Thông bao gì đó");
	dialog.setSize (220, 120) ;
	dialog. show () ;
	}
}

