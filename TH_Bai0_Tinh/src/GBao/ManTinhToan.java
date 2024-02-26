package GBao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	public ManTinhToan() {
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txt1 = new JLabel("Nhập số thứ nhất: ");
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt1.setBounds(41, 78, 134, 37);
		contentPane.add(txt1);
		
		JLabel txt2 = new JLabel("Nhập số thứ hai: ");
		txt2.setHorizontalAlignment(SwingConstants.CENTER);
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt2.setBounds(41, 146, 134, 37);
		contentPane.add(txt2);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setBounds(185, 78, 318, 37);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setBounds(185, 148, 318, 37);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//xu ly cong
				xuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(77, 217, 98, 37);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//xu ly tru
				xuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(209, 217, 98, 37);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nhan
				xuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(343, 217, 98, 37);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chia
				xuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(478, 217, 98, 37);
		contentPane.add(btnChia);
		
		JLabel labelKQ = new JLabel("Kết quả: ");
		labelKQ.setHorizontalAlignment(SwingConstants.CENTER);
		labelKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelKQ.setBounds(41, 290, 134, 37);
		contentPane.add(labelKQ);
		
		txtKQ = new JTextField();
		txtKQ.setHorizontalAlignment(SwingConstants.CENTER);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(185, 290, 318, 37);
		contentPane.add(txtKQ);
	}
	void xuLyCong() {
		String soA= txtA.getText();
		String soB= txtB.getText();
		//Chuyen kieu
		Double soADouble= Double.parseDouble(soA);
		Double soBDouble= Double.parseDouble(soB);
		//Tinh toan
		double tong = soADouble+soBDouble;
		//xuat len dieu khien
		txtKQ.setText(String.valueOf(tong));
	}
	void xuLyTru() {
		String soA= txtA.getText();
		String soB= txtB.getText();
		//Chuyen kieu
		Double soADouble= Double.parseDouble(soA);
		Double soBDouble= Double.parseDouble(soB);
		//Tinh toan
		double hieu = soADouble-soBDouble;
		//xuat len dieu khien
		txtKQ.setText(String.valueOf(hieu));
	}
	void xuLyNhan() {
		String soA= txtA.getText();
		String soB= txtB.getText();
		//Chuyen kieu
		Double soADouble= Double.parseDouble(soA);
		Double soBDouble= Double.parseDouble(soB);
		//Tinh toan
		double tich = soADouble*soBDouble;
		//xuat len dieu khien
		txtKQ.setText(String.valueOf(tich));
	}
	void xuLyChia() {
		String soA= txtA.getText();
		String soB= txtB.getText();
		//Chuyen kieu
		Double soADouble= Double.parseDouble(soA);
		Double soBDouble= Double.parseDouble(soB);
		//Tinh toan
		double thuong = soADouble/soBDouble;
		//xuat len dieu khien
		txtKQ.setText(String.valueOf(thuong));
	}	
}
