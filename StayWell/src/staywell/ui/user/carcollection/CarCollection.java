package staywell.ui.user.carcollection;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;


import java.awt.Font;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


import staywell.ui.Layout;
import staywell.ui.MainFrame;
import staywell.ui.user.Homepage;


public class CarCollection extends Layout {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CarCollection() {

		setBorder(new EmptyBorder(5,5,5,5));
		setBounds(0,0,1024,768);
		setLayout(null);
		// to make sure it doesn't wait one second at the start
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 20));
		btnNewButton.setBounds(434, 410, 150, 36);
		add(btnNewButton);
		
		JLabel Title = new JLabel("Car Collection");
		Title.setFont(new Font("Candara", Font.BOLD, 30));
		Title.setBounds(0, 47, 1024, 86);
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		add(Title);
		
		JLabel lblNewLabel = new JLabel("Please proceed to the hotel lobby for collection");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel.setBounds(256, 473, 514, 52);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your car plate number");
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(325, 207, 381, 36);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter here:");
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(301, 314, 100, 36);
		add(lblNewLabel_2);
		
		
		
		textField = new JTextField();
		textField.setBounds(411, 315, 221, 36);
		add(textField);
		textField.setColumns(10);
		
		JLabel InnerBackground = new JLabel("");
		InnerBackground.setBounds(112, 123, 803, 465);
		InnerBackground.setIcon(new ImageIcon(CarCollection.class.getResource("/staywell/image/PanelBackground.png")));
		InnerBackground.setHorizontalAlignment(SwingConstants.CENTER);
		add(InnerBackground);
		this.setVisible(true);
		
		super.setLayout();
	}
}
