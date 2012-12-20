package staywell.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class FacilitiesReservation extends Layout {
	MainFrame f = null;
	/**
	 * Create the panel.
	 */
	public FacilitiesReservation() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		JButton ballroomBtn = new JButton("");
		ballroomBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ballroom ballroom = f.getBallroom();
				f.getContentPane().removeAll();
				f.getContentPane().add(ballroom);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		ballroomBtn.setContentAreaFilled(false);
		ballroomBtn.setBorderPainted(false);
		ballroomBtn.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/laundryservices.png")));
		ballroomBtn.setBorder(null);
		ballroomBtn.setBounds(729, 296, 150, 150);
		add(ballroomBtn);
		
		JLabel hotelFacilitiesLb = new JLabel("Hotel Facilities");
		hotelFacilitiesLb.setHorizontalAlignment(SwingConstants.CENTER);
		hotelFacilitiesLb.setForeground(Color.RED);
		hotelFacilitiesLb.setFont(new Font("Candara", Font.BOLD, 20));
		hotelFacilitiesLb.setBounds(143, 457, 150, 22);
		add(hotelFacilitiesLb);
		
		JButton restaurantBtn = new JButton("");
		restaurantBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurant restaurant = f.getRestaurant();
				f.getContentPane().removeAll();
				f.getContentPane().add(restaurant);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		restaurantBtn.setContentAreaFilled(false);
		restaurantBtn.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/food&beverges.png")));
		restaurantBtn.setBorderPainted(false);
		restaurantBtn.setBorder(null);
		restaurantBtn.setBounds(436, 296, 150, 150);
		add(restaurantBtn);
		
		JLabel restaurantLb = new JLabel("Restaurants");
		restaurantLb.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantLb.setForeground(Color.RED);
		restaurantLb.setFont(new Font("Candara", Font.BOLD, 20));
		restaurantLb.setBounds(426, 457, 172, 22);
		add(restaurantLb);
		
		JButton hotelFacilitiesBtn = new JButton("");
		hotelFacilitiesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelFacilities hotelFacilites = f.getHotelFacilities();
				f.getContentPane().removeAll();
				f.getContentPane().add(hotelFacilites);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		hotelFacilitiesBtn.setContentAreaFilled(false);
		hotelFacilitiesBtn.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/cleaningservices.png")));
		hotelFacilitiesBtn.setBorderPainted(false);
		hotelFacilitiesBtn.setBorder(null);
		hotelFacilitiesBtn.setBounds(143, 296, 150, 150);
		add(hotelFacilitiesBtn);
		
		JLabel label_2 = new JLabel("Ball Room");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Candara", Font.BOLD, 20));
		label_2.setBounds(715, 457, 172, 22);
		add(label_2);
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Homepage homepage = f.getHomePage();
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
	public FacilitiesReservation(MainFrame frame){
		this();
		f = frame;
	}

}
