import javax.swing.*;
import java.awt.FlowLayout;

public class Main {
	JFrame  Frame = new JFrame();
	tip_calculater Panel = new tip_calculater();

	public Main(){
		Frame.setLayout(new FlowLayout() );
		Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Frame.add(Panel);
		Frame.pack();
		Frame.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}
}
