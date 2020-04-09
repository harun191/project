import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(39, 32, 156, 42);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(218, 32, 156, 42);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 int num1, num2, ans ;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
			}
		});
		btnNewButton.setBounds(71, 85, 104, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int num1, num2, ans ;
					try {
						num1=Integer.parseInt(textFieldNum1.getText());
						num2=Integer.parseInt(textFieldNum2.getText());
						
						ans = num1 - num2;
						textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
				
			}
		});
		btnNewButton_1.setBounds(271, 85, 89, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("The Answer  is ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(62, 204, 101, 22);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(153, 206, 121, 20);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int num1, num2, ans ;
					try {
						num1=Integer.parseInt(textFieldNum1.getText());
						num2=Integer.parseInt(textFieldNum2.getText());
						
						ans = num1 * num2;
						textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
				
			}
		});
		btnNewButton_2.setBounds(71, 129, 104, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int num1, num2, ans ;
					try {
						num1=Integer.parseInt(textFieldNum1.getText());
						num2=Integer.parseInt(textFieldNum2.getText());
						
						ans = num1 / num2;
						textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
				
			}
		});
		btnNewButton_3.setBounds(271, 129, 89, 37);
		frame.getContentPane().add(btnNewButton_3);
	}

}
