package staywell.ui.user;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;

import staywell.entities.CleaningServicesEntities;
import staywell.entities.FeedbackEntities;
import staywell.entities.SessionEntities;
import staywell.entities.dao.CleaningServicesDAO;
import staywell.entities.dao.FeedbackDAO;
import staywell.ui.Layout;
import staywell.ui.MainFrame;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.ButtonGroup;

public class CleaningServices extends Layout {

	private int roomNo;
	private static String time;
	private String membershipNo;
	/**
	 * Create the panel.
	 */
	
	MainFrame f;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public CleaningServices(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		
		SessionEntities session = new SessionEntities();
		if(f.getSession() != null){
			session = f.getSession();
		}
		
		roomNo = session.getRoomNo();
		membershipNo = session.getMembershipNo();
		
		
		JLabel lblCleaningServices = new JLabel("Housekeeping Services");
		lblCleaningServices.setForeground(Color.RED);
		lblCleaningServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblCleaningServices.setBounds(395, 11, 319, 30);
		add(lblCleaningServices);
		
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
		
		JLabel lblRoomCS = new JLabel("The following is the time slot for the next day housekeeping. Please selected ur prefered timeslot for your housekeeping to take place and click on submit. ");
		lblRoomCS.setFont(new Font("Candara", Font.BOLD, 16));
		lblRoomCS.setBounds(43, 91, 755, 14);
		add(lblRoomCS);
		
		JRadioButton rdbtn0800 = new JRadioButton("0800");
		buttonGroup.add(rdbtn0800);
		rdbtn0800.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn0800.setBounds(206, 190, 258, 36);
		rdbtn0800.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn0800Event(evt);
			}
		});
		add(rdbtn0800);
		
		JRadioButton rdbtn0900 = new JRadioButton("0900");
		buttonGroup.add(rdbtn0900);
		rdbtn0900.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn0900.setBounds(206, 243, 258, 36);
		rdbtn0900.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn0900Event(evt);
			}
		});
		add(rdbtn0900);
		
		JRadioButton rdbtn1000 = new JRadioButton("1000");
		buttonGroup.add(rdbtn1000);
		rdbtn1000.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1000.setBounds(206, 302, 258, 36);
		rdbtn1000.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1000Event(evt);
			}
		});
		add(rdbtn1000);
		
		JRadioButton rdbtn1100 = new JRadioButton("1100");
		buttonGroup.add(rdbtn1100);
		rdbtn1100.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1100.setBounds(206, 357, 258, 36);
		rdbtn1100.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1100Event(evt);
			}
		});
		add(rdbtn1100);
		
		JRadioButton rdbtn1200 = new JRadioButton("1200");
		buttonGroup.add(rdbtn1200);
		rdbtn1200.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1200.setAlignmentX(Component.RIGHT_ALIGNMENT);
		rdbtn1200.setBounds(206, 412, 258, 36);
		rdbtn1200.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1200Event(evt);
			}
		});
		add(rdbtn1200);
		
		JRadioButton rdbtn1300 = new JRadioButton("1300");
		buttonGroup.add(rdbtn1300);
		rdbtn1300.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1300.setBounds(568, 190, 258, 36);
		rdbtn1300.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1300Event(evt);
			}
		});
		add(rdbtn1300);
		
		JRadioButton rdbtn1400 = new JRadioButton("1400");
		buttonGroup.add(rdbtn1400);
		rdbtn1400.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1400.setBounds(568, 243, 258, 36);
		rdbtn1400.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1400Event(evt);
			}
		});
		add(rdbtn1400);
		
		JRadioButton rdbtn1500 = new JRadioButton("1500");
		buttonGroup.add(rdbtn1500);
		rdbtn1500.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1500.setBounds(568, 302, 258, 36);
		rdbtn1500.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1500Event(evt);
			}
		});
		add(rdbtn1500);
		
		JRadioButton rdbtn1600 = new JRadioButton("1600");
		buttonGroup.add(rdbtn1600);
		rdbtn1600.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1600.setBounds(568, 357, 258, 36);
		rdbtn1600.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1600Event(evt);
			}
		});
		add(rdbtn1600);
		
		JRadioButton rdbtn1700 = new JRadioButton("1700");
		buttonGroup.add(rdbtn1700);
		rdbtn1700.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtn1700.setBounds(568, 412, 258, 36);
		rdbtn1700.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtn1700Event(evt);
			}
		});
		add(rdbtn1700);
		
		
		final JLabel label = new JLabel("Confirm");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CleaningServicesEntities cleaningServices = new CleaningServicesEntities();
				cleaningServices.setRoomNo(roomNo);
				cleaningServices.setTime(time);
				CleaningServicesDAO cleaningDAO = new CleaningServicesDAO();
				cleaningDAO.insertTiming(cleaningServices);
				
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.RED);
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Candara", Font.BOLD, 20));
		label.setBounds(454, 592, 115, 28);
		add(label);
		super.setLayout();
		
		/// CONFIRM START HERE
		
		///CONFIRM END HERE
	}
	
	private void rdbtn0800Event(java.awt.event.ActionEvent evt) {
		time = "0800";
	}
	private void rdbtn0900Event(java.awt.event.ActionEvent evt) {
		time = "0900";
	}
	private void rdbtn1000Event(java.awt.event.ActionEvent evt) {
		time = "1000";
	}
	private void rdbtn1100Event(java.awt.event.ActionEvent evt) {
		time = "1100";
	}
	private void rdbtn1200Event(java.awt.event.ActionEvent evt) {
		time = "1200";
	}
	private void rdbtn1300Event(java.awt.event.ActionEvent evt) {
		time = "1300";
	}
	private void rdbtn1400Event(java.awt.event.ActionEvent evt) {
		time = "1400";
	}
	private void rdbtn1500Event(java.awt.event.ActionEvent evt) {
		time = "1500";
	}
	private void rdbtn1600Event(java.awt.event.ActionEvent evt) {
		time = "1600";
	}
	private void rdbtn1700Event(java.awt.event.ActionEvent evt) {
		time = "1700";
	}
	
}

