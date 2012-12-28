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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminCheckIn extends Layout2 {

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
	public AdminCheckIn() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(307, 281, 400, 196);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("UserName :");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(46, 41, 100, 20);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(156, 41, 200, 20);
		panel_1.add(textField);
		
		JLabel lblRoomNumber = new JLabel("Room Number :");
		lblRoomNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRoomNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRoomNumber.setBounds(20, 72, 126, 20);
		panel_1.add(lblRoomNumber);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 75, 200, 20);
		panel_1.add(passwordField);
		
		JButton btnCheckIn = new JButton("Check In");
		btnCheckIn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCheckIn.setBorder(null);
		btnCheckIn.setBounds(166, 106, 102, 25);
		panel_1.add(btnCheckIn);
		
		super.RealLayout();
		
	}
	public AdminCheckIn(Frame2 frame)
	{
		this();
		f = frame;
	}
}
