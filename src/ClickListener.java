import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class ClickListener implements ActionListener{
	JTextField BillAmountTextfield,TotalAmountTextfield;
	JToggleButton TipPercentage15, TipPercentage18, TipPercentage20;
	
	public ClickListener(JTextField infild,JTextField infild2, JToggleButton infild3,JToggleButton infild4,JToggleButton infild5) {
		BillAmountTextfield = infild;
		TotalAmountTextfield = infild2;
		TipPercentage15 = infild3;
		TipPercentage18 = infild4;
		TipPercentage20 = infild5;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton Button;
		if(e.getSource() instanceof JButton) {
			Button = (JButton) e.getSource();
			
			if(Button.getText() != "CALC") {
				String s = BillAmountTextfield.getText()+Button.getText();
				BillAmountTextfield.setText(s);
			}
			
		}
		double billAmount = Double.parseDouble(BillAmountTextfield.getText());
			if(BillAmountTextfield.getText().length() != 0) {
			
				if(e.getSource() instanceof JButton) {
					Button = (JButton) e.getSource();
					
					if(Button.getText() == "CALC") {
					
						if(TipPercentage15.isSelected() && TipPercentage15.getText() == "15%") {
							double total = (((0.15 * billAmount) + billAmount)*0.0825)+((0.15 * billAmount) + billAmount);
							DecimalFormat dftotal = new DecimalFormat("#.00");
							TotalAmountTextfield.setText("$"+(dftotal.format(total)));
						}
						
						if(TipPercentage18.isSelected() && TipPercentage18.getText() == "18%") {
							double total = (((0.18 * billAmount) + billAmount)*0.0825)+((0.18 * billAmount) + billAmount);
							DecimalFormat dftotal = new DecimalFormat("#.00");
							TotalAmountTextfield.setText("$"+(dftotal.format(total)));
						}
						
						if(TipPercentage20.isSelected() && TipPercentage20.getText() == "20%") {
							double total = (((0.20 * billAmount) + billAmount)*0.0825)+((0.20 * billAmount) + billAmount);
							DecimalFormat dftotal = new DecimalFormat("#.00");
							TotalAmountTextfield.setText("$"+(dftotal.format(total)));
						}
							
					}
			
				}

			}
			
	}

}

