package staywell.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import staywell.entities.Session;
import staywell.ui.user.Login;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private static Login login;
	public Session session;
	
	public Login getLogin(){
		return login;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					
					login = new Login(frame);
					frame.getContentPane().add(login);
					login.setVisible(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setUndecorated(true);
		setResizable(false);
		setSize(new Dimension(1366, 768));
		setPreferredSize(new Dimension(1366, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
