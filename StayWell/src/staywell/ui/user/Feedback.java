package staywell.ui.user;



import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import staywell.ui.Layout;
import staywell.ui.MainFrame;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class Feedback extends Layout {

	private JPanel contentPane;
	private MainFrame f;
	private final ButtonGroup housekeepingServices = new ButtonGroup();
	private final ButtonGroup hotelFacServices = new ButtonGroup();
	private final ButtonGroup staffServices = new ButtonGroup();
	private final ButtonGroup overServices = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Feedback(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(32, 89, 950, 392);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCommentServices = new JLabel("We would love to hear your comments on our services so that we can serve you better in the future.");
		lblCommentServices.setFont(new Font("Candara",Font.PLAIN, 15));
		lblCommentServices.setBounds(23, 0, 654, 27);
		panel_1.add(lblCommentServices);
		
		JLabel lblRoomServices = new JLabel("Please rate our Housekeeping Services.");
		lblRoomServices.setFont(new Font("Candara",Font.PLAIN, 15));
		lblRoomServices.setBounds(23, 69, 467, 14);
		panel_1.add(lblRoomServices);
		
		JRadioButton rdbtnHSVeryGood = new JRadioButton("Very Good");
		hotelFacServices.add(rdbtnHSVeryGood);
		rdbtnHSVeryGood.setBounds(23, 97, 109, 23);
		panel_1.add(rdbtnHSVeryGood);
		
		JRadioButton rdbtnHSGood = new JRadioButton("Good");
		hotelFacServices.add(rdbtnHSGood);
		rdbtnHSGood.setBounds(147, 97, 109, 23);
		panel_1.add(rdbtnHSGood);
		
		JRadioButton rdbtnHSNetural = new JRadioButton("Netural");
		hotelFacServices.add(rdbtnHSNetural);
		rdbtnHSNetural.setBounds(271, 97, 109, 23);
		panel_1.add(rdbtnHSNetural);
		
		JRadioButton rdbtnHSBad = new JRadioButton("Bad");
		hotelFacServices.add(rdbtnHSBad);
		rdbtnHSBad.setBounds(397, 97, 109, 23);
		panel_1.add(rdbtnHSBad);
		
		JRadioButton rdbtnHSVeryBad = new JRadioButton("Very Bad");
		hotelFacServices.add(rdbtnHSVeryBad);
		rdbtnHSVeryBad.setBounds(525, 97, 109, 23);
		panel_1.add(rdbtnHSVeryBad);
		
		JLabel lblHotelFacServices = new JLabel("Please rate our Hotel Faciliies Services.");
		lblHotelFacServices.setFont(new Font("Candara",Font.PLAIN, 15));
		lblHotelFacServices.setBounds(23, 164, 273, 14);
		panel_1.add(lblHotelFacServices);
		
		
		JRadioButton rdbtnHFSVeryGood = new JRadioButton("Very Good");
		housekeepingServices.add(rdbtnHFSVeryGood);
		rdbtnHFSVeryGood.setBounds(23, 200, 109, 23);
		panel_1.add(rdbtnHFSVeryGood);
		
		JRadioButton rdbtnHFSGood = new JRadioButton("Good");
		housekeepingServices.add(rdbtnHFSGood);
		rdbtnHFSGood.setBounds(147, 200, 109, 23);
		panel_1.add(rdbtnHFSGood);
		
		JRadioButton rdbtnHFSNetural = new JRadioButton("Netural");
		housekeepingServices.add(rdbtnHFSNetural);
		rdbtnHFSNetural.setBounds(271, 200, 109, 23);
		panel_1.add(rdbtnHFSNetural);
		
		JRadioButton rdbtnHFSBad = new JRadioButton("Bad");
		housekeepingServices.add(rdbtnHFSBad);
		rdbtnHFSBad.setBounds(397, 200, 109, 23);
		panel_1.add(rdbtnHFSBad);
		
		JRadioButton rdbtnHFSVeryBad = new JRadioButton("Very Bad");
		housekeepingServices.add(rdbtnHFSVeryBad);
		rdbtnHFSVeryBad.setBounds(525, 200, 109, 23);
		panel_1.add(rdbtnHFSVeryBad);
		
		JLabel lblStaff = new JLabel("Please rate the services of our staffs");
		lblStaff.setFont(new Font("Candara",Font.PLAIN, 15));
		lblStaff.setBounds(23, 256, 275, 14);
		panel_1.add(lblStaff);
		
		JRadioButton rdbtnSVeryGood = new JRadioButton("Very Good");
		staffServices.add(rdbtnSVeryGood);
		rdbtnSVeryGood.setBounds(23, 290, 109, 23);
		panel_1.add(rdbtnSVeryGood);
		
		JRadioButton rdbtnSGood = new JRadioButton("Good");
		staffServices.add(rdbtnSGood);
		rdbtnSGood.setBounds(147, 290, 109, 23);
		panel_1.add(rdbtnSGood);
		
		JRadioButton rdbtnSNetural = new JRadioButton("Netural");
		staffServices.add(rdbtnSNetural);
		rdbtnSNetural.setBounds(271, 290, 109, 23);
		panel_1.add(rdbtnSNetural);
		
		JRadioButton rdbtnSBad = new JRadioButton("Bad");
		staffServices.add(rdbtnSBad);
		rdbtnSBad.setBounds(397, 290, 109, 23);
		panel_1.add(rdbtnSBad);
		
		JRadioButton rdbtnSVeryBad = new JRadioButton("Very Bad");
		staffServices.add(rdbtnSVeryBad);
		rdbtnSVeryBad.setBounds(525, 290, 109, 23);
		panel_1.add(rdbtnSVeryBad);
		
		JLabel lblOverall = new JLabel("Please rate the overall services");
		lblOverall.setFont(new Font("Candara",Font.PLAIN, 15));
		lblOverall.setBounds(24, 330, 275, 14);
		panel_1.add(lblOverall);
		
		JRadioButton rdbtnOAVeryGood = new JRadioButton("Very Good");
		overServices.add(rdbtnOAVeryGood);
		rdbtnOAVeryGood.setBounds(23, 370, 109, 23);
		panel_1.add(rdbtnOAVeryGood);
		
		JRadioButton rdbtnOAGood = new JRadioButton("Good");
		overServices.add(rdbtnOAGood);
		rdbtnOAGood.setBounds(147, 370, 109, 23);
		panel_1.add(rdbtnOAGood);
		
		JRadioButton rdbtnOANetural = new JRadioButton("Netural");
		overServices.add(rdbtnOANetural);
		rdbtnOANetural.setBounds(271, 370, 109, 23);
		panel_1.add(rdbtnOANetural);
		
		JRadioButton rdbtnOABad = new JRadioButton("Bad");
		overServices.add(rdbtnOABad);
		rdbtnOABad.setBounds(397, 370, 109, 23);
		panel_1.add(rdbtnOABad);
		
		JRadioButton rdbtnOAVeryBad = new JRadioButton("Very Bad");
		overServices.add(rdbtnOAVeryBad);
		rdbtnOAVeryBad.setBounds(525, 370, 109, 23);
		panel_1.add(rdbtnOAVeryBad);
		
		JLabel lblFeedBack = new JLabel("FeedBack Form");
		lblFeedBack.setFont(new Font("Candara", Font.BOLD, 30));
		lblFeedBack.setBounds(379, 42, 256, 36);
		add(lblFeedBack);
		
		JButton cashing = new JButton("");
		cashing.setContentAreaFilled(false);
		cashing.setBorderPainted(false);
		cashing.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Cashing70X70.png")));
		cashing.setBorder(null);
		cashing.setBounds(477, 511, 70, 70);
		add(cashing);
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage homepage = new Homepage(f);
				f.getContentPane().removeAll();
				f.getContentPane().add(homepage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		add(logo);
		
		JLabel label = new JLabel("Confirm");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Candara", Font.BOLD, 20));
		label.setBounds(482, 592, 60, 28);
		add(label);
		
		super.setLayout();
	}
}
