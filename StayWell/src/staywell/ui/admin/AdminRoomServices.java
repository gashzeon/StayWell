package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import staywell.ui.Layout;
import staywell.ui.user.Homepage;
import staywell.ui.user.PointRedemption;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminRoomServices extends Layout {

	private JPanel contentPane;
	private Frame2 f =null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminRoomServices() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);

		// To set the logo

		JLabel Logo = new JLabel("");

		// For the user to be able to click on the logo

		Logo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		JButton button_2 = new JButton("Home");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage adminHomePage = f.getAdminHomePage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminHomePage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		
		JLabel label = new JLabel("Cleaning Services");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Candara", Font.BOLD, 20));
		label.setBounds(714, 510, 172, 22);
		add(label);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/cleaningservices.png")));
		button_3.setBounds(729, 349, 150, 150);
		add(button_3);
		button_2.setFont(new Font("Candara", Font.BOLD, 20));
		button_2.setBorder(null);
		
		button_2.setBounds(10, 11, 111, 25);
		add(button_2);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFoodNBeverage adminFoodNBeverage = f.getAdminFoodNBeverage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminFoodNBeverage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/food&beverges.png")));
		button.setBounds(436, 345, 150, 150);
		add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLaundry adminLaundry = f.getAdminLaundry();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminLaundry);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/laundryservices.png")));
		button_1.setBorder(null);
		button_1.setBounds(143, 345, 150, 150);
		add(button_1);
		
		JLabel lblLaundryServices = new JLabel("Laundry Services");
		lblLaundryServices.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLaundryServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaundryServices.setForeground(Color.RED);
		lblLaundryServices.setFont(new Font("Candara", Font.BOLD, 18));
		lblLaundryServices.setBounds(143, 509, 150, 26);
		add(lblLaundryServices);
		
		JLabel lblFoodBeverage = new JLabel("Food & Beverage");
		lblFoodBeverage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFoodBeverage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodBeverage.setForeground(Color.RED);
		lblFoodBeverage.setFont(new Font("Candara", Font.BOLD, 18));
		lblFoodBeverage.setBounds(436, 509, 150, 26);
		add(lblFoodBeverage);

		Logo.setIcon(new ImageIcon(PointRedemption.class.getResource("/staywell/image/Logo.png")));
		Logo.setBounds(-43, 635, 201, 123);
		add(Logo);

		// To set the background image

		JLabel Background = new JLabel("");
		Background.setOpaque(true);
		Background.setIcon(new ImageIcon(PointRedemption.class
				.getResource("/staywell/image/SWBG.png")));
		Background.setBounds(0, 0, 1356, 758);
		add(Background);
		
		super.setLayout();
	}
	public AdminRoomServices(Frame2 frame)
	{
		this();
		f = frame;
	}
}
