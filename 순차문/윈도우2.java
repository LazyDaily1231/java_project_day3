package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		
		JFrame f= new JFrame();
		f.setSize(501,500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ㅂㅇ");
				JOptionPane.showMessageDialog(f,"ㅂㅇ");
			}
		});
		
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("한컴돋움", Font.BOLD, 15));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(123, 201, 227, 112);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("ㅎㅇ");
			JOptionPane.showMessageDialog(f, "ㅎㅇ");
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setFont(new Font("한컴돋움", Font.BOLD, 15));
		btnNewButton_1.setBounds(120, 66, 231, 111);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBackground(Color.CYAN);
		textField.setBounds(123, 333, 232, 30);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PW");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 374, 57, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(72, 331, 57, 33);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.CYAN);
		textField_1.setBounds(123, 373, 232, 30);
		f.getContentPane().add(textField_1);
		f.setVisible(true);
		
	

	}
}
