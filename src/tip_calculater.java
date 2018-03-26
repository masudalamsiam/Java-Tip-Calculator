
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;


public class tip_calculater extends JPanel{
JLabel TipCalculater = new JLabel("Tip Calculator");
JLabel BillAmount = new JLabel("Bill Amount:");
JLabel TipPercentage = new JLabel("Tip Percentage:");
JLabel TotalAmount = new JLabel("Total Amount:");
JTextField BillAmountTextfield = new JTextField();
JTextField TotalAmountTextfield = new JTextField();
ButtonGroup group = new ButtonGroup();
JToggleButton TipPercentage15 = new JToggleButton("15%");
JToggleButton TipPercentage18 = new JToggleButton("18%");
JToggleButton TipPercentage20 = new JToggleButton("20%");
JButton Calculate = new JButton("CALC");
JButton Button2 = new JButton("0");
ClickListener Click = new ClickListener(BillAmountTextfield, TotalAmountTextfield, TipPercentage15,TipPercentage18,TipPercentage20);
	public tip_calculater(){
		
		setLayout(null);
		setPreferredSize(new Dimension(810, 700));
		setBackground(Color.WHITE);
		
		TipCalculater.setFont(new Font("Arial", Font.BOLD,60));
		TipCalculater.setForeground(Color.red);
		TipCalculater.setBounds(30, 20, 1000, 50);
		
		BillAmount.setFont(new Font("Arial", Font.BOLD,20));
		BillAmount.setBounds(40, 90, 150, 50);
		BillAmountTextfield.setBounds(210, 90, 150, 50);
		BillAmountTextfield.setFont(new Font("Arial", Font.BOLD,20));
		
		TipPercentage.setFont(new Font("Arial", Font.BOLD,20));
		TipPercentage.setBounds(25, 140, 150, 50);
		
		TipPercentage15.setBounds(40, 190, 100, 70);
		TipPercentage15.setFont(new Font("Arial", Font.BOLD,30));
		TipPercentage15.setBackground(Color.WHITE);
		TipPercentage15.addActionListener(Click);
		
		TipPercentage18.setBounds(150, 190, 100, 70);
		TipPercentage18.setFont(new Font("Arial", Font.BOLD,30));
		TipPercentage18.setBackground(Color.WHITE);
		TipPercentage18.addActionListener(Click);
		
		TipPercentage20.setBounds(260, 190, 100, 70);
		TipPercentage20.setFont(new Font("Arial", Font.BOLD,30));
		TipPercentage20.setBackground(Color.WHITE);
		TipPercentage20.addActionListener(Click);
		
		TotalAmount.setFont(new Font("Arial", Font.BOLD,20));
		TotalAmount.setBounds(40, 300, 150, 50);
		TotalAmountTextfield.setBounds(210, 300, 150, 50);
		TotalAmountTextfield.setFont(new Font("Arial", Font.BOLD,20));
		
		Calculate.setBounds(40, 400, 150, 50);
		Calculate.setFont(new Font("Arial", Font.BOLD,30));
		Calculate.setBackground(Color.WHITE);
		Calculate.addActionListener(Click);
		
		int X = 0;
		int Y = 0;
		int num = 1;
		
		for (int i = 0; i<3; i++) {
			
			 for (int j = 0 ; j<3; j++) {
				JButton Button = new JButton();
		        	Button.setBounds((X+450),(Y+50),90,110);
		        	Button.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,30));
		        	Button.setBackground(Color.WHITE);
		        	Button.setText(Integer.toString(num));
		        	X+=110;
		        	num++;
		        	Button.addActionListener(Click);
		        	add(Button);
			 }
			 
			 X-=X;
			 Y+=120;
		}
		 
		Button2.setBounds(560,410 , 90, 110);
		Button2.setFont(new Font("Arial, Helvetica, sans-serif", Font.BOLD,30));
		Button2.addActionListener(Click);
		Button2.setBackground(Color.WHITE);
		 
		add(TipCalculater);
		add(BillAmount);
		add(TipPercentage);
		add(TotalAmount);
		add(BillAmountTextfield);
		add(TotalAmountTextfield);
		add(TipPercentage15);
		add(TipPercentage18);
		add(TipPercentage20);
		group.add(TipPercentage15);
		group.add(TipPercentage18);
		group.add(TipPercentage20);
		add(Calculate);
		add(Button2);

	}
}
