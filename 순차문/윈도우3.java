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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;

	public static void main(String[] args) {
		
		JFrame f= new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("나의 일기장");
		tglbtnNewToggleButton.setFont(new Font("굴림", Font.PLAIN, 65));
		tglbtnNewToggleButton.setBounds(12, 10, 460, 90);
		f.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel = new JLabel("오늘의 일기 작성을 시작합니다");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 110, 460, 36);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 162, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("날짜");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 196, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("제목");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(12, 230, 57, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(67, 159, 405, 21);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(67, 193, 405, 21);
		f.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(67, 227, 405, 21);
		f.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_4 = new JLabel("내용");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(8, 324, 57, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.LIGHT_GRAY);
		textField_5.setText("글을 작성하세요");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(67, 272, 405, 118);
		f.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("일기작성");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(67, 413, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1.setBounds(212, 413, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("저장");
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(357, 413, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);
		
		
		f.setVisible(true);
		
	

	}
}
