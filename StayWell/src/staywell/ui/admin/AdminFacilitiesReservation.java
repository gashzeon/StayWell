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

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminFacilitiesReservation extends Layout2 {

	/**
	 * 
	 */
	private JPanel contentPane;
	private Frame2 f =null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminFacilitiesReservation() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		/*All Button*/
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage adminHomePage = f.getAdminHomePage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminHomePage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		button.setFont(new Font("Candara", Font.BOLD, 20));
		button.setBorder(null);
		button.setBounds(10, 11, 111, 25);
		add(button);
		
		JButton Taxi = new JButton("");
		Taxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminBallRoom adminBallRoom = f.getAdminBallRoom();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminBallRoom);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		Taxi.setContentAreaFilled(false);
		Taxi.setBorderPainted(false);
		Taxi.setBorder(null);
		Taxi.setIcon(new ImageIcon(AdminFacilitiesReservation.class.getResource("/Image1/ballroom.png")));
		Taxi.setBounds(723, 296, 150, 150);
		add(Taxi);
		
		JButton roomService = new JButton("");
		roomService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHotelFacilities adminHotelFacilities = f.getAdminHotelFacilities();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminHotelFacilities);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		
		
		
		roomService.setIcon(new ImageIcon(AdminFacilitiesReservation.class.getResource("/Image1/hotelfacilities.png")));
		roomService.setBounds(141, 296, 150, 150);
		roomService.setBorder(null);
		roomService.setBorderPainted(false);
		roomService.setContentAreaFilled(false);
		add(roomService);
		
		JButton facilities = new JButton("");
		facilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFoodNBeverage adminFoodNBeverage = f.getAdminFoodNBeverage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminFoodNBeverage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		facilities.setBounds(432, 296, 150, 150);
		facilities.setBorder(null);
		facilities.setBorderPainted(false);
		facilities.setContentAreaFilled(false);
		facilities.setIcon(new ImageIcon(AdminFacilitiesReservation.class.getResource("/Image1/restaurant.png")));
		add(facilities);
		
		JLabel AdminFacilitiesReservation = new JLabel("Restaurants");
		AdminFacilitiesReservation.setForeground(new Color(255, 0, 0));
		AdminFacilitiesReservation.setFont(new Font("Candara", Font.BOLD, 18));
		AdminFacilitiesReservation.setHorizontalAlignment(SwingConstants.CENTER);
		AdminFacilitiesReservation.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminFacilitiesReservation.setBounds(424, 457, 165, 26);
		add(AdminFacilitiesReservation);
		
		JLabel AdminTaxiBooking = new JLabel("Ball Room");
		AdminTaxiBooking.setForeground(new Color(255, 0, 0));
		AdminTaxiBooking.setFont(new Font("Candara", Font.BOLD, 18));
		AdminTaxiBooking.setHorizontalAlignment(SwingConstants.CENTER);
		AdminTaxiBooking.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminTaxiBooking.setBounds(723, 457, 150, 26);
		add(AdminTaxiBooking);
		
		JLabel AdminRoomServices = new JLabel("Hotel Facilities");
		AdminRoomServices.setForeground(new Color(255, 0, 0));
		AdminRoomServices.setFont(new Font("Candara", Font.BOLD, 18));
		AdminRoomServices.setHorizontalTextPosition(SwingConstants.CENTER);
		AdminRoomServices.setHorizontalAlignment(SwingConstants.CENTER);
		AdminRoomServices.setBounds(141, 457, 150, 26);
		add(AdminRoomServices);
		
		/* To set the logo*/
		
		
		super.RealLayout();
	}
	public AdminFacilitiesReservation(Frame2 frame)
	{
		this();
		f = frame;
	}
}
