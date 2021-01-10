package javaguidemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CGPAcalculator {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CGPAcalculator window = new CGPAcalculator();
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
	public CGPAcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cgpa calculator");
		lblNewLabel.setBounds(20, 11, 137, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Calculus");
		lblNewLabel_2.setBounds(20, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 86, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("English");
		lblNewLabel_3.setBounds(20, 134, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 131, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Economics");
		lblNewLabel_4.setBounds(20, 185, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextPane textField_3 = new JTextPane();
		textField_3.setBounds(99, 185, 84, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_5 = new JLabel("Digital logic");
		lblNewLabel_5.setBounds(20, 239, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JTextArea textField_4 = new JTextArea();
		textField_4.setBounds(99, 234, 84, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_6 = new JLabel("Result");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(256, 53, 137, 52);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(256, 116, 137, 52);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t2 =textField_1.getText();
				String t3 =textField_2.getText();
				String t4 =textField_3.getText();
				String t5 =textField_4.getText();
				
				
				float cal =Float.parseFloat(t2);
				float eng =Float.parseFloat(t3);
				float eco =Float.parseFloat(t4);
				float dld =Float.parseFloat(t5);
				
				float gpa =(float)((cal*3.0)+(eng*3.0)+(eco*3.0)+(dld*3.0)/12.0);
				lblNewLabel_7.setText(gpa+"");
				
				
			}
		});
		btnNewButton.setBounds(254, 206, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
