package staywell.ui.user;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Frame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

import staywell.entities.SessionEntities;
import staywell.ui.Layout;
import staywell.ui.MainFrame;

import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacilitiesReservation extends Layout {

	/**
	 * Create the panel.
	 */
	private MainFrame f;
	
	public FacilitiesReservation(MainFrame frame) {
		f = frame;
		
		SessionEntities session = new SessionEntities();
		if(f.getSession() != null){
			session = f.getSession();
		}
		points = session.getPoints();
		
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		
		JLabel lblHotelFacitlities = new JLabel("Hotel Facitlities");
		lblHotelFacitlities.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblRestaurant = new JLabel("Restaurant");
		lblRestaurant.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblBallroom = new JLabel("Ballroom");
		lblBallroom.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(511, 5, 1, 1);
		add(panel);
		panel.setLayout(null);
		
		JLabel facilities = new JLabel("Reservation");
		facilities.setForeground(Color.RED);
		facilities.setHorizontalAlignment(SwingConstants.CENTER);
		facilities.setFont(new Font("Candara", Font.BOLD, 30));
		facilities.setBounds(448, 30, 164, 24);
		add(facilities);
		
		JLabel lblNewLabel1 = new JLabel("New label");
		setLayout(null);
		
		JButton hotelFacilities = new JButton("");
		hotelFacilities.setBorder(null);
		hotelFacilities.setBorderPainted(false);
		hotelFacilities.setContentAreaFilled(false);
		hotelFacilities.setIcon(new ImageIcon(FacilitiesReservation.class.getResource("/staywell/image/hotelfacilities.png")));
		hotelFacilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HotelFacilities hotelFacilities = new HotelFacilities(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(hotelFacilities);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		hotelFacilities.setBounds(157, 218, 150, 150);
		add(hotelFacilities);
		
		JLabel Facilities = new JLabel("Facilities");
		Facilities.setForeground(Color.RED);
		Facilities.setFont(new Font("Candara", Font.BOLD, 20));
		Facilities.setBounds(195, 397, 83, 24);
		add(Facilities);
		
		JButton RestaurantIcon = new JButton("");
		RestaurantIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurant restaurant = new Restaurant(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(restaurant);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		RestaurantIcon.setBorder(null);
		RestaurantIcon.setBorderPainted(false);
		RestaurantIcon.setContentAreaFilled(false);
		RestaurantIcon.setBounds(448, 218, 150, 150);
		RestaurantIcon.setIcon(new javax.swing.ImageIcon(FacilitiesReservation.class.getResource("/staywell/image/restaurant.png")));
		add(RestaurantIcon);
		
		JLabel restaurant = new JLabel("Restaurant");
		restaurant.setForeground(Color.RED);
		restaurant.setFont(new Font("Candara", Font.BOLD, 20));
		restaurant.setBounds(481, 400, 102, 19);
		add(restaurant);
		
		JButton ballRoomIcon = new JButton("");
		ballRoomIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ballroom ballroom = new Ballroom(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(ballroom);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		ballRoomIcon.setBorder(null);
		ballRoomIcon.setBorderPainted(false);
		ballRoomIcon.setContentAreaFilled(false);
		ballRoomIcon.setBounds(718, 218, 150, 150);
		add(ballRoomIcon);
		ballRoomIcon.setIcon(new ImageIcon(FacilitiesReservation.class.getResource("/staywell/image/ballroom.png")));
		
		JLabel ballRoom = new JLabel("Ballroom");
		ballRoom.setForeground(Color.RED);
		ballRoom.setFont(new Font("Candara", Font.BOLD, 20));
		ballRoom.setBounds(761, 401, 83, 17);
		add(ballRoom);
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
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
		
		JLabel pointLb = new JLabel("Reward Points: " + points);
		pointLb.setForeground(Color.RED);
		pointLb.setFont(new Font("Candara", Font.BOLD, 15));
		pointLb.setBounds(0, 0, 200, 38);
		add(pointLb);
		// set layout

		super.setLayout();
		
	}
}
