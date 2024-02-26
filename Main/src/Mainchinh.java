import javax.swing. JButton;
import javax. swing. JFrame;
import javax. swing. WindowConstants;



public class Mainchinh {
	public static void main (String[] args) {
		JFrame f = new JFrame (); // Tạo một the hien (đoi tượng) của lớp
		f.setTitle ("Vi du JFrame"); //Tieu đe cua
		f.setDefaultCloseOperation (WindowConstants. EXIT_ON_CLOSE) ;
		f.setSize (300,200) ;

		// Tạo một nút bam
		JButton btnOK = new JButton ("Nhan toi di");
		JButton btnkhac = new JButton ("Nhan em di") ;
		// gắn lên form
		f.add (btnOK) ;
		f.add (btnkhac);
		// Chay thu thì Em đa de lên Toi
		// hiện form/frame
		f.show (); // hiện cua
	}
}
