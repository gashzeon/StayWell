package staywell.ui.user;
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

import staywell.entities.Guest;
import staywell.entities.Session;
import staywell.entities.User;
import staywell.entities.dao.LoginDAO;
import staywell.ui.Layout;

import staywell.ui.MainFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Login extends Layout {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private MainFrame f;
	private JLabel validateLb;
	
	public Login(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		final JPanel panel_1 = new JPanel();
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
		
		validateLb = new JLabel("");
		validateLb.setBounds(158, 22, 200, 35);
		panel_1.add(validateLb);
		
		
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")){
					validateLb.setText("Please Enter Your Username");
				}
				else if(passwordField.getText().equals("")){
					validateLb.setText("Please Enter Your Password");
				}
				else{
					User user = new User();
					user.setPassword(passwordField.getText());
					user.setUserName(textField.getText());
					User user2 = new User();
					user2=LoginDAO.Login(user);
					Guest guest = new Guest();
					guest.setEmail(user2.getEmail());
					Guest guest2 = new Guest();
					guest2 = LoginDAO.Login(guest);
					Session session = new Session();
					session.setName(user2.getFirstName() + " " + user2.getLastName());
					session.setEmail(guest2.getEmail());
					session.setMembership(guest2.getMembership());
					session.setPoints(guest2.getPoints());
					f.setSession(session);
					if(LoginDAO.successLogin == true ){
						if(user.getPassword().equals(user2.getPassword())){
							Homepage homepage = new Homepage(f);
							f.getContentPane().removeAll();
							f.getContentPane().add(homepage);
							f.repaint();
							f.revalidate();
							f.setVisible(true);
						}
						else{
							validateLb.setText("Wrong Password");
							passwordField.setText("");
						}
					}
					else{
						validateLb.setText("Wrong Username or Password");
						textField.setText("");
						passwordField.setText("");
					}
				}
						
			}
		});
		
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBorder(null);
		btnLogin.setBounds(168, 133, 102, 25);
		panel_1.add(btnLogin);
		
		
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		add(logo);
		
		super.setLayout();
	}
	
}
