import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChuongTrinhChinh {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // Tao mot the hien (đoi tợng) cua lớp
        f.setTitle("Vi du JFrame"); //Tieu de cua so
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(300, 200); // kich thuoc cua so

        f.setLayout(new FlowLayout());
        // Tạo một nút bam
        JButton btnOK = new JButton("Nhan toi di");
        BoLangNgheOK ok = new BoLangNgheOK();
        btnOK.addActionListener(ok);
        JButton btnkhac = new JButton("Nhan em di");
        // gắn lên form
        f.add(btnOK);
        f.add(btnkhac);
        // Chạy thu thi Em đa de len Toi
        // hiện form/frame
        f.show(); // hien cua so
    }

    private static class BoLangNgheOK implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JDialog dialog = new JDialog();
            dialog.setTitle("Thong bao gi do");
            dialog.setSize(220, 120);
            dialog.show();
        }
    }
}