package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import staywell.ui.Layout;
import staywell.ui.user.Homepage;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminHomePage extends Layout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Frame2 f =null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminHomePage() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		/*All Button*/
		
		JButton button = new JButton("Log Out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin adminLogin = f.getAdminLogin();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminLogin);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		button.setFont(new Font("Candara", Font.BOLD, 20));
		button.setBorder(null);
		button.setBounds(10, 11, 111, 25);
		add(button);
		
		JButton CheckIn = new JButton("");
		CheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckRegister checkRegister = f.getCheckRegister();
				f.getContentPane().removeAll();
				f.getContentPane().add(checkRegister);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		CheckIn.setContentAreaFilled(false);
		CheckIn.setBorderPainted(false);
		CheckIn.setBorder(null);
		CheckIn.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/CheckIN.png")));
		CheckIn.setBounds(576, 305, 150, 150);
		add(CheckIn);
		
		JLabel lblCheckIn = new JLabel("Check In / Register");
		lblCheckIn.setForeground(new Color(255, 0, 0));
		lblCheckIn.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("Candara", Font.BOLD, 18));
		lblCheckIn.setBounds(576, 466, 150, 26);
		add(lblCheckIn);
		
		JButton pointRedemption = new JButton("");
		pointRedemption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminItemRedemption adminItemRedemption = f.getAdminItemRedemption();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminItemRedemption);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		pointRedemption.setBounds(723, 534, 150, 150);
		pointRedemption.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/PointRedemption.png")));
		pointRedemption.setBorder(null);
		pointRedemption.setBorderPainted(false);
		pointRedemption.setContentAreaFilled(false);
		add(pointRedemption);
		
		JButton Feedback = new JButton("");
		Feedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFeedBack adminFeedBack = f.getAdminFeedBack();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminFeedBack);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		Feedback.setContentAreaFilled(false);
		Feedback.setBorderPainted(false);
		Feedback.setBorder(null);
		Feedback.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Feedback2.png")));
		Feedback.setBounds(432, 534, 150, 150);
		add(Feedback);
		
		JButton valetParking = new JButton("");
		valetParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCarCollection2 adminCarCollection2 = f.getAdminCarCollection2();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminCarCollection2);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		valetParking.setBounds(141, 534, 150, 150);
		valetParking.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/ValetParking.png")));
		valetParking.setBorder(null);
		valetParking.setBorderPainted(false);
		valetParking.setContentAreaFilled(false);
		add(valetParking);
		
		JButton Taxi = new JButton("");
		Taxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminTaxi adminTaxi = f.getAdminTaxi();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminTaxi);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		Taxi.setContentAreaFilled(false);
		Taxi.setBorderPainted(false);
		Taxi.setBorder(null);
		Taxi.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/taxxi.png")));
		Taxi.setBounds(723, 78, 150, 150);
		add(Taxi);
		
		JButton BillOut = new JButton("");
		BillOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCheckOut adminCheckOut = f.getAdminCheckOut();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminCheckOut);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		BillOut.setContentAreaFilled(false);
		BillOut.setBorderPainted(false);
		BillOut.setBorder(null);
		BillOut.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/BillOut.png")));
		BillOut.setBounds(282, 305, 150, 150);
		add(BillOut);
		
		JButton roomService = new JButton("");
		roomService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminRoomServices adminRoomServices = f.getAdminRoomServices();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminRoomServices);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		
		
		
		roomService.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/roomservice.png")));
		roomService.setBounds(141, 78, 150, 150);
		roomService.setBorder(null);
		roomService.setBorderPainted(false);
		roomService.setContentAreaFilled(false);
		add(roomService);
		
		JButton facilities = new JButton("");
		facilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFacilitiesReservation adminFacilitiesReservation = f.getAdminFacilitiesReservation();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminFacilitiesReservation);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		facilities.setBounds(432, 78, 150, 150);
		facilities.setBorder(null);
		facilities.setBorderPainted(false);
		facilities.setContentAreaFilled(false);
		facilities.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/facreservation.png")));
		add(facilities);
		
		JLabel AdminFacilitiesReservation = new JLabel("Facilities Reservation");
		AdminFacilitiesReservation.setForeground(new Color(255, 0, 0));
		AdminFacilitiesReservation.setFont(new Font("Candara", Font.BOLD, 18));
		AdminFacilitiesReservation.setHorizontalAlignment(SwingConstants.CENTER);
		AdminFacilitiesReservation.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminFacilitiesReservation.setBounds(424, 239, 165, 26);
		add(AdminFacilitiesReservation);
		
		/*Icon Labels*/
		
		JLabel AdminFeedBack = new JLabel("FeedBack");
		AdminFeedBack.setForeground(new Color(255, 0, 0));
		AdminFeedBack.setFont(new Font("Candara", Font.BOLD, 18));
		AdminFeedBack.setHorizontalAlignment(SwingConstants.CENTER);
		AdminFeedBack.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminFeedBack.setBounds(432, 695, 150, 26);
		add(AdminFeedBack);
		
		JLabel AdminBillOut = new JLabel("Check Out");
		AdminBillOut.setForeground(new Color(255, 0, 0));
		AdminBillOut.setFont(new Font("Candara", Font.BOLD, 18));
		AdminBillOut.setHorizontalAlignment(SwingConstants.CENTER);
		AdminBillOut.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminBillOut.setBounds(282, 466, 150, 26);
		add(AdminBillOut);
		
		JLabel AdminPointRedemption = new JLabel("Point Redemption");
		AdminPointRedemption.setForeground(new Color(255, 0, 0));
		AdminPointRedemption.setFont(new Font("Candara", Font.BOLD, 18));
		AdminPointRedemption.setHorizontalAlignment(SwingConstants.CENTER);
		AdminPointRedemption.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminPointRedemption.setBounds(723, 695, 150, 26);
		add(AdminPointRedemption);
		
		JLabel AdminCarCollection = new JLabel("Car Collection");
		AdminCarCollection.setForeground(new Color(255, 0, 0));
		AdminCarCollection.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AdminCarCollection.setHorizontalAlignment(SwingConstants.CENTER);
		AdminCarCollection.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminCarCollection.setBounds(141, 695, 150, 26);
		add(AdminCarCollection);
		
		JLabel AdminTaxiBooking = new JLabel("Taxi Booking");
		AdminTaxiBooking.setForeground(new Color(255, 0, 0));
		AdminTaxiBooking.setFont(new Font("Candara", Font.BOLD, 18));
		AdminTaxiBooking.setHorizontalAlignment(SwingConstants.CENTER);
		AdminTaxiBooking.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminTaxiBooking.setBounds(723, 239, 150, 26);
		add(AdminTaxiBooking);
		
		JLabel AdminRoomServices = new JLabel("Room Services");
		AdminRoomServices.setForeground(new Color(255, 0, 0));
		AdminRoomServices.setFont(new Font("Candara", Font.BOLD, 18));
		AdminRoomServices.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminRoomServices.setHorizontalAlignment(SwingConstants.CENTER);
		AdminRoomServices.setBounds(141, 239, 150, 26);
		add(AdminRoomServices);
		
		/* To set the logo*/
		
		
		super.setLayout();
	}
	public AdminHomePage(Frame2 frame)
	{
		this();
		f = frame;
	}
}
