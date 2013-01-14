package staywell.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import staywell.entities.Session;
import staywell.ui.Layout;
import staywell.ui.MainFrame;
import staywell.ui.user.cityguides.CityGuides;

import javax.swing.JTextField;

public class Homepage extends Layout {

	private JPanel contentPane;
	private MainFrame f;
	private JLabel nameLb;
	private String name;
	
	public Homepage(MainFrame frame) {
		f = frame;
		
		Session session = new Session();
		if(f.getSession() != null){
			session = f.getSession();
		}
		name = session.getName();
		
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		JLabel pointRedemptionLb = new JLabel("Point Redemption");
		pointRedemptionLb.setForeground(Color.RED);
		pointRedemptionLb.setHorizontalAlignment(SwingConstants.CENTER);
		pointRedemptionLb.setFont(new Font("Candara", Font.BOLD, 20));
		pointRedemptionLb.setBounds(712, 555, 172, 22);
		add(pointRedemptionLb);
		
		
		JButton roomService = new JButton("");
		roomService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomService roomService = new RoomService(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(roomService);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		roomService.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/roomservice.png")));
		roomService.setBounds(141, 152, 150, 150);
		roomService.setBorder(null);
		roomService.setBorderPainted(false);
		roomService.setContentAreaFilled(false);
		add(roomService);
		
		JButton cashing = new JButton("");
		cashing.setBounds(914, 0, 100, 100);
		cashing.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Cashing.png")));
		cashing.setBorder(null);
		cashing.setBorderPainted(false);
		cashing.setContentAreaFilled(false);
		add(cashing);
		
		JLabel facilitiesReservationsLb = new JLabel("Facilities Reservations");
		facilitiesReservationsLb.setForeground(Color.RED);
		facilitiesReservationsLb.setHorizontalAlignment(SwingConstants.CENTER);
		facilitiesReservationsLb.setFont(new Font("Candara", Font.BOLD, 20));
		facilitiesReservationsLb.setBounds(416, 313, 188, 22);
		add(facilitiesReservationsLb);
		
		JButton feedback = new JButton("");
		feedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedback feedBack = new Feedback(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(feedBack);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		feedback.setBounds(311, 607, 100, 100);
		feedback.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/feedback100X100.png")));
		feedback.setBorder(null);
		feedback.setBorderPainted(false);
		feedback.setContentAreaFilled(false);
		add(feedback);
		
		JLabel checkOutLb = new JLabel("Check Out");
		checkOutLb.setForeground(Color.RED);
		checkOutLb.setHorizontalAlignment(SwingConstants.CENTER);
		checkOutLb.setFont(new Font("Candara", Font.BOLD, 20));
		checkOutLb.setBounds(914, 111, 100, 22);
		add(checkOutLb);
		
		JButton valetParking = new JButton("");
		valetParking.setBounds(141, 394, 150, 150);
		valetParking.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/ValetParking.png")));
		valetParking.setBorder(null);
		valetParking.setBorderPainted(false);
		valetParking.setContentAreaFilled(false);
		add(valetParking);
		
		JLabel weatherForcastLb = new JLabel("Weather Forcast");
		weatherForcastLb.setForeground(Color.RED);
		weatherForcastLb.setHorizontalAlignment(SwingConstants.CENTER);
		weatherForcastLb.setFont(new Font("Candara", Font.BOLD, 20));
		weatherForcastLb.setBounds(723, 313, 150, 22);
		add(weatherForcastLb);
		
		JLabel roomLb = new JLabel("Room Service\r\n");
		roomLb.setForeground(Color.RED);
		roomLb.setHorizontalAlignment(SwingConstants.CENTER);
		roomLb.setFont(new Font("Candara", Font.BOLD, 20));
		roomLb.setBounds(141, 313, 150, 22);
		add(roomLb);
		
		JButton weatherForcast = new JButton("");
		weatherForcast.setBounds(723, 152, 150, 150);
		weatherForcast.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/weatherforcast.png")));
		weatherForcast.setBorder(null);
		weatherForcast.setBorderPainted(false);
		weatherForcast.setContentAreaFilled(false);
		add(weatherForcast);
		
		JLabel carCollectionLb = new JLabel("Car Collection");
		carCollectionLb.setForeground(Color.RED);
		carCollectionLb.setHorizontalAlignment(SwingConstants.CENTER);
		carCollectionLb.setFont(new Font("Candara", Font.BOLD, 20));
		carCollectionLb.setBounds(141, 555, 150, 22);
		add(carCollectionLb);
		
		JButton pointRedemption = new JButton("");
		pointRedemption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			PointRedemption pointRedemption = new PointRedemption(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(pointRedemption);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		pointRedemption.setBounds(723, 394, 150, 150);
		pointRedemption.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/PointRedemption.png")));
		pointRedemption.setBorder(null);
		pointRedemption.setBorderPainted(false);
		pointRedemption.setContentAreaFilled(false);
		add(pointRedemption);
		
		JLabel cityGuideLb = new JLabel("City Guide");
		cityGuideLb.setForeground(Color.RED);
		cityGuideLb.setHorizontalAlignment(SwingConstants.CENTER);
		cityGuideLb.setFont(new Font("Candara", Font.BOLD, 20));
		cityGuideLb.setBounds(432, 555, 150, 22);
		add(cityGuideLb);
		
		JButton cityGuideBtn = new JButton("");
		cityGuideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CityGuides cityGuide = new CityGuides();
				cityGuide.setVisible(true);
			}
		});
		cityGuideBtn.setBounds(432, 394, 150, 150);
		cityGuideBtn.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/cityguide.png")));
		cityGuideBtn.setBorder(null);
		cityGuideBtn.setBorderPainted(false);
		cityGuideBtn.setContentAreaFilled(false);
		add(cityGuideBtn);
		
		JButton facRes = new JButton("");
		facRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacilitiesReservation facilitiesReservation = new FacilitiesReservation(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(facilitiesReservation);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
	
		facRes.setBounds(432, 152, 150, 150);
		facRes.setBorder(null);
		facRes.setBorderPainted(false);
		facRes.setContentAreaFilled(false);
		facRes.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/facreservation.png")));
		add(facRes);
		
		// To set the logo

		
		JButton taxi = new JButton("");
		taxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Taxi taxi = new Taxi(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(taxi);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		taxi.setBounds(603, 607, 100, 100);
		taxi.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Taxi.png")));
		taxi.setBorder(null);
		taxi.setBorderPainted(false);
		taxi.setContentAreaFilled(false);
		add(taxi);
		
		JLabel feedbackLb = new JLabel("Feedback");
		feedbackLb.setForeground(Color.RED);
		feedbackLb.setHorizontalAlignment(SwingConstants.CENTER);
		feedbackLb.setFont(new Font("Candara", Font.BOLD, 20));
		feedbackLb.setBounds(311, 718, 100, 21);
		add(feedbackLb);
		
		JLabel taxiBookingLb = new JLabel("Taxi Booking");
		taxiBookingLb.setForeground(Color.RED);
		taxiBookingLb.setHorizontalAlignment(SwingConstants.CENTER);
		taxiBookingLb.setFont(new Font("Candara", Font.BOLD, 20));
		taxiBookingLb.setBounds(592, 718, 128, 21);
		add(taxiBookingLb);
		
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		add(logo);
		
		
		JLabel nameLb = new JLabel("Welcome " +name);
		nameLb.setForeground(Color.RED);
		nameLb.setFont(new Font("Candara", Font.BOLD, 20));
		nameLb.setBounds(0, 0, 210, 38);
		add(nameLb);
		
		System.out.println(session.getEmail() + " " + session.getMembership());
		// To set the background image
		super.setLayout();
	}
	

}
 
