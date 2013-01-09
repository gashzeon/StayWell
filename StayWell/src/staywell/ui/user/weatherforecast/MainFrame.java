package staywell.ui.user.weatherforecast;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainFrame extends JFrame{

	private JPanel contentPane = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MainFrame thisClass = new MainFrame();
				JPanel panel = new WeatherForecast();
				thisClass.getContentPane().add(panel);
				thisClass.setSize(1024,768);
				thisClass.setVisible(true);
			}
		});

	}


	
}

