package staywell.ui.user;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;

import javax.swing.SwingConstants;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoomService extends Layout {
	private MainFrame f;
	private static String time;
	private int checkTime;

	/**
	 * Create the panel.
	 */
	public RoomService(MainFrame frame) {
		f = frame;

		final DateFormat timeFormat = new SimpleDateFormat(
				"HH:mm:ss");
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				time = timeFormat.format(date);
				checkTime = Integer.parseInt(time.substring(0, 2));
				System.out.println(checkTime);
				
			}
		};
		Timer timer = new Timer(1000, timerListener);
		
		// to make sure it does not wait one second at the start
		timer.setInitialDelay(0);
		timer.start();

		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		JButton CleaningServices = new JButton("");
		CleaningServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CleaningServices cleaningServices = new CleaningServices(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(cleaningServices);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		CleaningServices.setContentAreaFilled(false);
		CleaningServices.setBorderPainted(false);
		CleaningServices.setIcon(new ImageIcon(Homepage.class
				.getResource("/staywell/image/laundryservices.png")));
		CleaningServices.setBorder(null);
		CleaningServices.setBounds(729, 296, 150, 150);
		add(CleaningServices);

		JLabel label = new JLabel("Laundry Services");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Candara", Font.BOLD, 20));
		label.setBounds(143, 457, 150, 22);
		add(label);

		JButton foodAndBeverages = new JButton("");
		foodAndBeverages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkTime < 12 && checkTime > 8){
				Breakfast breakfast = new Breakfast(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(breakfast);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
				}
				else{
					Meals meals = new Meals(f);
					f.getContentPane().removeAll();
					f.getContentPane().add(meals);
					f.repaint();
					f.revalidate();
					f.setVisible(true);
				}
			}
		});
		foodAndBeverages.setContentAreaFilled(false);
		foodAndBeverages.setIcon(new ImageIcon(Homepage.class
				.getResource("/staywell/image/food&beverges.png")));
		foodAndBeverages.setBorderPainted(false);
		foodAndBeverages.setBorder(null);
		foodAndBeverages.setBounds(436, 296, 150, 150);
		add(foodAndBeverages);

		JLabel label_1 = new JLabel("Food & Beverages");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Candara", Font.BOLD, 20));
		label_1.setBounds(426, 457, 172, 22);
		add(label_1);

		JButton LaundryServices = new JButton("");
		LaundryServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LaundryServices laundryServices = new LaundryServices(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(laundryServices);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		LaundryServices.setContentAreaFilled(false);
		LaundryServices.setIcon(new ImageIcon(Homepage.class
				.getResource("/staywell/image/cleaningservices.png")));
		LaundryServices.setBorderPainted(false);
		LaundryServices.setBorder(null);
		LaundryServices.setBounds(143, 296, 150, 150);
		add(LaundryServices);

		JLabel label_2 = new JLabel("Cleaning Services");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Candara", Font.BOLD, 20));
		label_2.setBounds(715, 457, 172, 22);
		add(label_2);

		JLabel lblRoomService = new JLabel("Room Service");
		lblRoomService.setForeground(Color.RED);
		lblRoomService.setFont(new Font("Candara", Font.BOLD, 30));
		lblRoomService.setBounds(423, 11, 177, 30);
		add(lblRoomService);

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
