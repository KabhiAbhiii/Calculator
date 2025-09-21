package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;;
public class cal {

	private JFrame frame;
	private JTextField textField;
	
	double first,second,result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
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
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 277, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 243, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.LIGHT_GRAY);
		
		JButton clearbtn = new JButton("CE");
		clearbtn.setBackground(new Color(128, 128, 128));
		clearbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clearbtn.setBounds(30, 342, 93, 49);
		frame.getContentPane().add(clearbtn);
		
		JButton backbtn = new JButton("\u2B05");
		backbtn.setBackground(new Color(128, 128, 128));
		backbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back=null;
				
				if(textField.getText().length()>0) 
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					back=str.toString();
					textField.setText(back);
				}
			}
		});
		backbtn.setBounds(197, 283, 56, 49);
		frame.getContentPane().add(backbtn);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
				
				
			}
		});
		btn1.setBounds(10, 106, 56, 49);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(192, 192, 192));
		btn2.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn2.setForeground(Color.BLACK);
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(71, 106, 56, 49);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(192, 192, 192));
		btn3.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
		
			}
		});
		btn3.setBounds(131, 106, 56, 49);
		frame.getContentPane().add(btn3);
		
		JButton plusbtn = new JButton("+");
		plusbtn.setBackground(new Color(128, 128, 128));
		plusbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		plusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		plusbtn.setBounds(197, 106, 56, 49);
		frame.getContentPane().add(plusbtn);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(192, 192, 192));
		btn4.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(10, 165, 56, 49);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(192, 192, 192));
		btn5.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(71, 165, 56, 49);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(192, 192, 192));
		btn6.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(131, 165, 56, 49);
		frame.getContentPane().add(btn6);
		
		JButton subbtn = new JButton("-");
		subbtn.setBackground(new Color(128, 128, 128));
		subbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		subbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		subbtn.setBounds(197, 165, 56, 49);
		frame.getContentPane().add(subbtn);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(192, 192, 192));
		btn7.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(10, 224, 56, 49);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(192, 192, 192));
		btn8.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(71, 224, 56, 49);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(192, 192, 192));
		btn9.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(131, 224, 56, 49);
		frame.getContentPane().add(btn9);
		
		JButton multbtn = new JButton("x");
		multbtn.setBackground(new Color(128, 128, 128));
		multbtn.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		multbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		multbtn.setBounds(197, 224, 56, 49);
		frame.getContentPane().add(multbtn);
		
		JButton pointbtn = new JButton(".");
		pointbtn.setBackground(new Color(128, 128, 128));
		pointbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		pointbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+pointbtn.getText();
				textField.setText(number);
			}
		});
		pointbtn.setBounds(10, 283, 56, 49);
		frame.getContentPane().add(pointbtn);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(192, 192, 192));
		btn0.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(71, 283, 56, 49);
		frame.getContentPane().add(btn0);
		
		JButton dividebtn = new JButton("/");
		dividebtn.setBackground(new Color(128, 128, 128));
		dividebtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		dividebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		dividebtn.setBounds(131, 283, 56, 49);
		frame.getContentPane().add(dividebtn);
		
		JButton equalbtn = new JButton("=");
		equalbtn.setBackground(new Color(255, 128, 0));
		equalbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		equalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    second=Double.parseDouble(textField.getText());
				if(operation.equals("+")) {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation.equals("-")) {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation.equals("*")) {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation.equals("/")) {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
			}
		});
		equalbtn.setBounds(133, 342, 106, 49);
		frame.getContentPane().add(equalbtn);
		
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	}

}
