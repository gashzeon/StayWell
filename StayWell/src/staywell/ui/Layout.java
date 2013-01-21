package staywell.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import staywell.entities.SessionEntities;
import staywell.ui.user.Homepage;

public class Layout extends JPanel {
	
	private MainFrame f = null;
	private String name;
	protected int points;
	/**
	 * Create the panel.
	 */
	public Layout() {
		
		
	}
	public void setLayout(){
		// To set the background image]
		final JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(800, 0, 331, 52);
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 20));
		add(lblNewLabel_3);

		final DateFormat timeFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
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


		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(Layout.class
				.getResource("/staywell/image/SWBG.png")));
		Background.setBounds(0, 0, 1356, 758);
		add(Background);
		
		
	}
	
	public Layout(MainFrame frame){
		this();
		f = frame;
	}

}
