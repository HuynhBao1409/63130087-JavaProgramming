package GiaBao;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame FormDN;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.FormDN.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FormDN = new JFrame();
		FormDN.setFont(new Font("Times New Roman", Font.BOLD, 14));
		FormDN.setTitle("Form đăng nhập");
		FormDN.setBounds(100, 100, 622, 367);
		FormDN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FormDN.getContentPane().setLayout(null);
		
		JLabel txtDN = new JLabel("Tên đăng nhập");
		txtDN.setHorizontalAlignment(SwingConstants.CENTER);
		txtDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDN.setBounds(56, 71, 122, 32);
		FormDN.getContentPane().add(txtDN);
		
		JLabel txtMK = new JLabel("Mật khẩu");
		txtMK.setHorizontalAlignment(SwingConstants.CENTER);
		txtMK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMK.setBounds(56, 126, 122, 32);
		FormDN.getContentPane().add(txtMK);
		
		JTextField textField = new JTextField();
		textField.setBounds(212, 77, 255, 32);
		FormDN.getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(212, 126, 255, 32);
		FormDN.getContentPane().add(passwordField);
		
		JButton Logging = new JButton("Đăng nhập");
		Logging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDN(textField.getText(), new String(passwordField.getPassword()));
				
			}
		});
		Logging.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Logging.setBounds(212, 187, 128, 32);
		FormDN.getContentPane().add(Logging);
	}
	
	public void xuLyDN(String username, String password) {
		if (username.equals("63CNTT") && password.equals("123")) {
			ManChinh manHinhChinh = new ManChinh();
			manHinhChinh.setVisible(true);
			FormDN.dispose();
		} else {
			// Xử lý khi đăng nhập không thành công
			JOptionPane.showMessageDialog(null, "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin đăng nhập.");
		}
		
	}
}
