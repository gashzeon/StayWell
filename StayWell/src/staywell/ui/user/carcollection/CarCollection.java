package staywell.ui.user.carcollection;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import staywell.entities.SessionEntities;
import staywell.ui.Layout;
import staywell.ui.MainFrame;
public class CarCollection extends Layout {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	MainFrame f;
	
	public CarCollection(MainFrame frame) {
		f = frame;
		
		SessionEntities session = new SessionEntities();
		if(f.getSession() != null){
			session = f.getSession();
		}
		points = session.getPoints();
		
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		final JLabel Time = new JLabel("New label");
		Time.setFont(new Font("Candara", Font.BOLD, 20));
		add(Time);

		final DateFormat timeFormat = new SimpleDateFormat("EEE, d MMM yyyy H:mm:ss z");
		ActionListener timerListener = new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		Date date = new Date();
		String time = timeFormat.format(date);
		Time.setText(time);
		}
		};
		Timer timer = new Timer(1000, timerListener);
		
		// to make sure it doesn't wait one second at the start
		timer.setInitialDelay(0);
		timer.start();
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 20));
		add(btnNewButton, "3, 10, fill, fill");
		
		JLabel Title = new JLabel("Car Collection");
		Title.setFont(new Font("Candara", Font.BOLD, 30));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		add(Title, "1, 2, 5, 3, fill, fill");
		
		JLabel lblNewLabel = new JLabel("Please proceed to the hotel lobby for collection");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
		add(lblNewLabel, "1, 12, 5, 1, center, top");
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your car plate number");
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1, "1, 6, 5, 1, center, fill");
		
		JLabel lblNewLabel_2 = new JLabel("Enter here:");
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_2, "1, 8, right, fill");
		
		textField = new JTextField();
		add(textField, "3, 8, 3, 1, left, fill");
		textField.setColumns(10);
		
		JLabel InnerBackground = new JLabel("");
		InnerBackground.setIcon(new ImageIcon(CarCollection.class.getResource("/staywell/image/PanelBackground.png")));
		InnerBackground.setHorizontalAlignment(SwingConstants.CENTER);
		add(InnerBackground, "1, 4, 5, 9, center, fill");
		
		// Set a larger, nicer font for the digital clock than the default.
		Time.setFont(new Font("CANDARA", Font.BOLD, 20));
		this.add(Time);
		this.setVisible(true);
		
		super.setLayout();
	}
}
