package Main;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import classes.Conversor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblResult = new JLabel("Result:");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//JLabel lblResult = new JLabel("Result:");
		//lblResult.setBounds(12, 200, 200, 15);
		frame.getContentPane().add(lblResult);
		
		JLabel lblEnterThe = new JLabel("Enter the value in degrees");
		lblEnterThe.setBounds(12, 31, 200, 15);
		frame.getContentPane().add(lblEnterThe);
		
		textField = new JTextField();
		textField.setBounds(12, 58, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter the value in radiens");
		lblNewLabel.setBounds(12, 130, 200, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 157, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(12, 200, 200, 15);
		//frame.getContentPane().add(lblResult);
		//..
		JButton btnToRadiens = new JButton("to radiens");
		btnToRadiens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conversor convers = new Conversor();
				
				if(textField.getText().isEmpty()){
					
					lblResult.setText("No degree found, try again");
				}
				else{
				double degree = Double.parseDouble(textField.getText());
				
				double result = convers.DegreesToRadiens(degree);
				
				String text = Double.toString(result);
				
				lblResult.setText("Result: "+text);
				textField.setText(null);
				}
			}
		});
		btnToRadiens.setBounds(9, 233, 117, 25);
		frame.getContentPane().add(btnToRadiens);
		
		JButton btnToDegrees = new JButton("to degrees");
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conversor convers = new Conversor();
				
				if(textField_1.getText().isEmpty()){
					lblResult.setText("No radien found, try again");
				}
				else{
				double radien = Double.parseDouble(textField_1.getText());
				
				double result = convers.RadiensToDegrees(radien);
				
				String text = Double.toString(result);
				lblResult.setText("Result: "+text);
				textField_1.setText(null);
				}
				
			}
		});
		btnToDegrees.setBounds(159, 233, 117, 25);
		frame.getContentPane().add(btnToDegrees);
	}
}
