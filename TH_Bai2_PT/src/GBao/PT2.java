package GBao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PT2 {

	private JFrame frmPhngTrnhBc;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PT2 window = new PT2();
					window.frmPhngTrnhBc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PT2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhngTrnhBc = new JFrame("Phương trình bậc 2");
	    frmPhngTrnhBc.setBounds(100, 100, 543, 422);
	    frmPhngTrnhBc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frmPhngTrnhBc.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 51, 110, 34);
		frmPhngTrnhBc.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(146, 57, 310, 27);
		frmPhngTrnhBc.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 113, 310, 27);
		frmPhngTrnhBc.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(146, 163, 310, 27);
		frmPhngTrnhBc.getContentPane().add(textField_2);

		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(26, 113, 110, 34);
		frmPhngTrnhBc.getContentPane().add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(26, 170, 110, 34);
		frmPhngTrnhBc.getContentPane().add(lblNhpC);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setHorizontalAlignment(SwingConstants.CENTER);
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(26, 266, 110, 34);
		frmPhngTrnhBc.getContentPane().add(lblKtQu);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(146, 276, 310, 27);
		frmPhngTrnhBc.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
	            double b = Double.parseDouble(textField_1.getText());
	            double c = Double.parseDouble(textField_2.getText());

	            double delta = b * b - 4 * a * c;
	            if (delta > 0) {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                textField_3.setText("Phương trình có hai nghiệm phân biệt:\nX1 = " + x1 + "\nX2 = " + x2);
	            } else if (delta == 0) {
	                double x = -b / (2 * a);
	                textField_3.setText("Phương trình có nghiệm kép:\nX = " + x);
	            } else {
	                textField_3.setText("Phương trình vô nghiệm");
	            }	
	        }
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(225, 217, 110, 34);
		frmPhngTrnhBc.getContentPane().add(btnNewButton);
	}
}
