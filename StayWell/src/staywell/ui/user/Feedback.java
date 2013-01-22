package staywell.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import staywell.entities.*;
import staywell.entities.dao.FeedbackDAO;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class Feedback extends Layout {

	private JPanel contentPane;
	private MainFrame f;
	private final ButtonGroup housekeepingServices = new ButtonGroup();
	private final ButtonGroup hotelFacServices = new ButtonGroup();
	private final ButtonGroup staffServices = new ButtonGroup();
	private final ButtonGroup overServices = new ButtonGroup();
	private static String houseKeeping;
	private static String hotelFacilities;
	private static String staff;
	private static String overall;
	private String membershipNo;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Feedback(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		SessionEntities session = new SessionEntities();
		if(f.getSession() != null){
			session = f.getSession();
		}
		membershipNo = session.getMembershipNo();

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(32, 89, 950, 392);
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblCommentServices = new JLabel(
				"We would love to hear your comments on our services so that we can serve you better in the future.");
		lblCommentServices.setFont(new Font("Candara", Font.PLAIN, 15));
		lblCommentServices.setBounds(23, 0, 654, 27);
		panel_1.add(lblCommentServices);

		JLabel lblRoomServices = new JLabel(
				"Please rate our Housekeeping Services.");
		lblRoomServices.setFont(new Font("Candara", Font.PLAIN, 15));
		lblRoomServices.setBounds(23, 69, 467, 14);
		panel_1.add(lblRoomServices);

		JRadioButton rdbtnHSVeryGood = new JRadioButton("Very Good");
		hotelFacServices.add(rdbtnHSVeryGood);
		rdbtnHSVeryGood.setBounds(23, 97, 109, 23);
		rdbtnHSVeryGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtnHSVeryGoodEvent(evt);
			}
		});

		panel_1.add(rdbtnHSVeryGood);

		JRadioButton rdbtnHSGood = new JRadioButton("Good");
		hotelFacServices.add(rdbtnHSGood);
		rdbtnHSGood.setBounds(147, 97, 109, 23);
		rdbtnHSGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtnHSGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnHSGood);

		JRadioButton rdbtnHSNetural = new JRadioButton("Netural");
		hotelFacServices.add(rdbtnHSNetural);
		rdbtnHSNetural.setBounds(271, 97, 109, 23);
		rdbtnHSNetural.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdbtnHSNeutralEvent(evt);
			}
		});
		panel_1.add(rdbtnHSNetural);

		JRadioButton rdbtnHSBad = new JRadioButton("Bad");
		hotelFacServices.add(rdbtnHSBad);
		rdbtnHSBad.setBounds(397, 97, 109, 23);
		rdbtnHSBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHSBadEvent(evt);
			}
		});
		panel_1.add(rdbtnHSBad);

		JRadioButton rdbtnHSVeryBad = new JRadioButton("Very Bad");
		hotelFacServices.add(rdbtnHSVeryBad);
		rdbtnHSVeryBad.setBounds(525, 97, 109, 23);
		rdbtnHSVeryBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHSVeryBadEvent(evt);
			}
		});

		panel_1.add(rdbtnHSVeryBad);

		JLabel lblHotelFacServices = new JLabel(
				"Please rate our Hotel Faciliies Services.");
		lblHotelFacServices.setFont(new Font("Candara", Font.PLAIN, 15));
		lblHotelFacServices.setBounds(23, 164, 273, 14);
		panel_1.add(lblHotelFacServices);

		JRadioButton rdbtnHFSVeryGood = new JRadioButton("Very Good");
		housekeepingServices.add(rdbtnHFSVeryGood);
		rdbtnHFSVeryGood.setBounds(23, 200, 109, 23);
		rdbtnHFSVeryGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHFSVeryGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnHFSVeryGood);

		JRadioButton rdbtnHFSGood = new JRadioButton("Good");
		housekeepingServices.add(rdbtnHFSGood);
		rdbtnHFSGood.setBounds(147, 200, 109, 23);
		rdbtnHFSGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHFSGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnHFSGood);

		JRadioButton rdbtnHFSNetural = new JRadioButton("Netural");
		housekeepingServices.add(rdbtnHFSNetural);
		rdbtnHFSNetural.setBounds(271, 200, 109, 23);
		rdbtnHFSNetural.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHFSNeutralEvent(evt);
			}
		});
		panel_1.add(rdbtnHFSNetural);

		JRadioButton rdbtnHFSBad = new JRadioButton("Bad");
		housekeepingServices.add(rdbtnHFSBad);
		rdbtnHFSBad.setBounds(397, 200, 109, 23);
		rdbtnHSBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHFSBadEvent(evt);
			}
		});
		panel_1.add(rdbtnHFSBad);

		JRadioButton rdbtnHFSVeryBad = new JRadioButton("Very Bad");
		housekeepingServices.add(rdbtnHFSVeryBad);
		rdbtnHFSVeryBad.setBounds(525, 200, 109, 23);
		rdbtnHSVeryBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnHFSVeryBadEvent(evt);
			}
		});
		panel_1.add(rdbtnHFSVeryBad);

		JLabel lblStaff = new JLabel("Please rate the services of our staffs");
		lblStaff.setFont(new Font("Candara", Font.PLAIN, 15));
		lblStaff.setBounds(23, 256, 275, 14);
		panel_1.add(lblStaff);

		JRadioButton rdbtnSVeryGood = new JRadioButton("Very Good");
		staffServices.add(rdbtnSVeryGood);
		rdbtnSVeryGood.setBounds(23, 290, 109, 23);
		rdbtnSVeryGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnSVeryGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnSVeryGood);

		JRadioButton rdbtnSGood = new JRadioButton("Good");
		staffServices.add(rdbtnSGood);
		rdbtnSGood.setBounds(147, 290, 109, 23);
		rdbtnSGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnSGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnSGood);

		JRadioButton rdbtnSNeutral = new JRadioButton("Netural");
		staffServices.add(rdbtnSNeutral);
		rdbtnSNeutral.setBounds(271, 290, 109, 23);
		rdbtnSNeutral.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnSNeutralEvent(evt);
			}
		});
		panel_1.add(rdbtnSNeutral);

		JRadioButton rdbtnSBad = new JRadioButton("Bad");
		staffServices.add(rdbtnSBad);
		rdbtnSBad.setBounds(397, 290, 109, 23);
		rdbtnSBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnSBadEvent(evt);
			}
		});
		panel_1.add(rdbtnSBad);

		JRadioButton rdbtnSVeryBad = new JRadioButton("Very Bad");
		staffServices.add(rdbtnSVeryBad);
		rdbtnSVeryBad.setBounds(525, 290, 109, 23);
		rdbtnSVeryBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnSVeryBadEvent(evt);
			}
		});
		panel_1.add(rdbtnSVeryBad);

		JLabel lblOverall = new JLabel("Please rate the overall services");
		lblOverall.setFont(new Font("Candara", Font.PLAIN, 15));
		lblOverall.setBounds(24, 330, 275, 14);
		panel_1.add(lblOverall);

		JRadioButton rdbtnOAVeryGood = new JRadioButton("Very Good");
		overServices.add(rdbtnOAVeryGood);
		rdbtnOAVeryGood.setBounds(23, 370, 109, 23);
		rdbtnOAVeryGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnOAVeryGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnOAVeryGood);

		JRadioButton rdbtnOAGood = new JRadioButton("Good");
		overServices.add(rdbtnOAGood);
		rdbtnOAGood.setBounds(147, 370, 109, 23);
		rdbtnOAGood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnOAGoodEvent(evt);
			}
		});
		panel_1.add(rdbtnOAGood);

		JRadioButton rdbtnOANeutral = new JRadioButton("Netural");
		overServices.add(rdbtnOANeutral);
		rdbtnOANeutral.setBounds(271, 370, 109, 23);
		rdbtnOANeutral.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnOANeturalEvent(evt);
			}
		});
		panel_1.add(rdbtnOANeutral);

		JRadioButton rdbtnOABad = new JRadioButton("Bad");
		overServices.add(rdbtnOABad);
		rdbtnOABad.setBounds(397, 370, 109, 23);
		rdbtnOABad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnOABadEvent(evt);
			}
		});
		panel_1.add(rdbtnOABad);

		JRadioButton rdbtnOAVeryBad = new JRadioButton("Very Bad");
		overServices.add(rdbtnOAVeryBad);
		rdbtnOAVeryBad.setBounds(525, 370, 109, 23);
		rdbtnOAVeryBad.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rdBtnOAVeryBadEvent(evt);
			}
		});
		panel_1.add(rdbtnOAVeryBad);

		JLabel lblFeedBack = new JLabel("FeedBack Form");
		lblFeedBack.setFont(new Font("Candara", Font.BOLD, 30));
		lblFeedBack.setBounds(379, 42, 256, 36);
		add(lblFeedBack);

		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class
				.getResource("/Staywell/image/Logo.png")));
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

		final JLabel label = new JLabel("Confirm");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FeedbackEntities feedback = new FeedbackEntities();
				feedback.setFacilities(hotelFacilities);
				feedback.setHouseKeeping(houseKeeping);
				feedback.setOverall(overall);
				feedback.setStaff(staff);
				feedback.setMembershipNo(membershipNo);
				FeedbackDAO feedbackDAO = new FeedbackDAO();
				feedbackDAO.insertFeedback(feedback);
				
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
	}

	private void rdbtnHSVeryGoodEvent(java.awt.event.ActionEvent evt) {
		houseKeeping = "Very Good";
	}

	private void rdbtnHSGoodEvent(java.awt.event.ActionEvent evt) {
		houseKeeping = "Good";
	}

	private void rdbtnHSNeutralEvent(java.awt.event.ActionEvent evt) {
		houseKeeping = "Neutral";
	}

	private void rdBtnHSBadEvent(java.awt.event.ActionEvent evt) {
		houseKeeping = "Bad";
	}

	private void rdBtnHFSVeryGoodEvent(java.awt.event.ActionEvent evt) {
		hotelFacilities = "Very Good";
	}

	private void rdBtnHFSGoodEvent(java.awt.event.ActionEvent evt) {
		hotelFacilities = "Good";
	}

	private void rdBtnHFSNeutralEvent(java.awt.event.ActionEvent evt) {
		hotelFacilities = "Neutral";
	}

	private void rdBtnHFSBadEvent(java.awt.event.ActionEvent evt) {
		hotelFacilities = "Bad";
	}

	private void rdBtnHFSVeryBadEvent(java.awt.event.ActionEvent evt) {
		hotelFacilities = "Very Bad";
	}

	private void rdBtnHSVeryBadEvent(java.awt.event.ActionEvent evt) {
		houseKeeping = "Very Bad";
	}

	private void rdBtnSVeryGoodEvent(java.awt.event.ActionEvent evt) {
		staff = "Very Good";
	}

	private void rdBtnSGoodEvent(java.awt.event.ActionEvent evt) {
		staff = "Good";
	}

	private void rdBtnSNeutralEvent(java.awt.event.ActionEvent evt) {
		staff = "Neutral";
	}

	private void rdBtnSBadEvent(java.awt.event.ActionEvent evt) {
		staff = "Bad";
	}

	private void rdBtnSVeryBadEvent(java.awt.event.ActionEvent evt) {
		staff = "Very Bad";
	}

	private void rdBtnOAVeryGoodEvent(java.awt.event.ActionEvent evt) {
		overall = "Very Good";
	}

	private void rdBtnOAGoodEvent(java.awt.event.ActionEvent evt) {
		overall = "Good";
	}

	private void rdBtnOANeturalEvent(java.awt.event.ActionEvent evt) {
		overall = "Neutral";
	}

	private void rdBtnOABadEvent(java.awt.event.ActionEvent evt) {
		overall = "Bad";
	}

	private void rdBtnOAVeryBadEvent(java.awt.event.ActionEvent evt) {
		overall = "Very Bad";
	}

}
