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

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import staywell.ui.Layout;
import staywell.ui.user.Homepage;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CheckRegister extends Layout {

	private JPanel contentPane;
	private Frame2 f=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CheckRegister() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		/*set BG Logo*/
		
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
		
		JButton CheckIN = new JButton("");
		CheckIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCheckIn adminCheckIn = f.getAdminCheckIn();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminCheckIn);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		CheckIN.setContentAreaFilled(false);
		CheckIN.setBorderPainted(false);
		CheckIN.setBorder(null);
		CheckIN.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/CheckIN.png")));
		CheckIN.setBounds(626, 304, 150, 150);
		add(CheckIN);
		
		JLabel lblCheckIn = new JLabel("Check In");
		lblCheckIn.setForeground(new Color(255, 0, 0));
		lblCheckIn.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("Candara", Font.BOLD, 18));
		lblCheckIn.setBounds(626, 465, 150, 26);
		add(lblCheckIn);
		
		JButton Register_btn = new JButton("");
		Register_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration registration = f.getRegistration();
				f.getContentPane().removeAll();
				f.getContentPane().add(registration);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		Register_btn.setContentAreaFilled(false);
		Register_btn.setBorderPainted(false);
		Register_btn.setBorder(null);
		Register_btn.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Register_btn.png")));
		Register_btn.setBounds(238, 304, 150, 150);
		add(Register_btn);
		
		JLabel lblRegister = new JLabel("Registration");
		lblRegister.setForeground(new Color(255, 0, 0));
		lblRegister.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Candara", Font.BOLD, 18));
		lblRegister.setBounds(238, 465, 150, 26);
		add(lblRegister);
		
		super.setLayout();
	}
	public CheckRegister(Frame2 frame)
	{
		this();
		f = frame;
	}
}
