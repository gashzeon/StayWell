package staywell.ui.user.weatherforecast;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import staywell.ui.Layout;
import staywell.ui.MainFrame;
import staywell.ui.user.Homepage;


public class WeatherForecast extends Layout {
	
	/**
	 * Create the panel.
	 */
	MainFrame f = new MainFrame();
	JPanel panel = new JPanel();
	public WeatherForecast(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		
		JLabel Title = new JLabel("Weather Forecast");
		Title.setBounds(0, 74, 1024, 86);
		Title.setFont(new Font("Candara", Font.BOLD, 30));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		add(Title);
		Title.setFont(new Font("Candara", Font.BOLD, 20));
		
		JPanel panel = new Weather();
		panel.setBounds(214, 199, 600, 380);
		add(panel);
		
		JLabel lblpleaseWaitA = new JLabel("*Please wait a few seconds for the weather to load*");
		lblpleaseWaitA.setBounds(390, 590, 311, 14);
		add(lblpleaseWaitA);
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class
				.getResource("/Staywell/image/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage homepage = new Homepage(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(homepage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		add(logo);

		super.setLayout();
	}
}