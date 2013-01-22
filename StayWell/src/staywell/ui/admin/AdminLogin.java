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

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import staywell.ui.Layout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminLogin extends Layout {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private Frame2 f=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminLogin() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(307, 281, 400, 196);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(48, 68, 100, 20);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 68, 200, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(48, 99, 100, 20);
		panel_1.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 102, 200, 20);
		panel_1.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminHomePage adminHomePage = f.getAdminHomePage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminHomePage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBorder(null);
		btnLogin.setBounds(168, 133, 102, 25);
		panel_1.add(btnLogin);
		
		JLabel lblOnlyAuthorizedLogin = new JLabel("Authorized User Only");
		lblOnlyAuthorizedLogin.setFont(new Font("Candara", Font.BOLD, 30));
		lblOnlyAuthorizedLogin.setBounds(372, 42, 279, 36);
		add(lblOnlyAuthorizedLogin);
		
		super.setLayout();
	}
	public AdminLogin(Frame2 frame)
	{
		this();
		f = frame;
	}
}
