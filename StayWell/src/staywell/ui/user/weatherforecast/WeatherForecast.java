package staywell.ui.user.weatherforecast;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import staywell.ui.Layout;
import staywell.ui.MainFrame;


public class WeatherForecast extends Layout {
	
	/**
	 * Create the panel.
	 */
	MainFrame f = new MainFrame();
	JPanel panel = new JPanel();
	public WeatherForecast() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		// create a label for time
		final JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(621, 11, 331, 52);
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 20));
		add(lblNewLabel_3);

		final DateFormat timeFormat = new SimpleDateFormat("EEE, d MMM yyyy H:mm:ss z");
		ActionListener timerListener = new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		Date date = new Date();
		String time = timeFormat.format(date);
		lblNewLabel_3.setText(time);
		}
		};
		Timer timer = new Timer(1000, timerListener);
		
		// to make sure it does not wait one second at the start
				timer.setInitialDelay(0);
				timer.start();
		
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

		super.setLayout();
	}

	public WeatherForecast(MainFrame frame) {
		this();
		f = frame;
	}
}