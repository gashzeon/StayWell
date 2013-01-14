package staywell.ui.user;

import javax.swing.JPanel;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class Taxi extends Layout {

	/**
	 * Create the panel.
	 */
	
	private MainFrame f;
	
	public Taxi(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(245, 138, 534, 474);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblEstimatedTimeOf = new JLabel("Estimated Time Of Arrival");
		lblEstimatedTimeOf.setFont(new Font("Candara", Font.BOLD, 20));
		lblEstimatedTimeOf.setBounds(152, 65, 229, 39);
		panel.add(lblEstimatedTimeOf);
		
		JLabel lblCarPlateNumber = new JLabel("Car Plate Number");
		lblCarPlateNumber.setFont(new Font("Candara", Font.BOLD, 20));
		lblCarPlateNumber.setBounds(192, 260, 150, 34);
		panel.add(lblCarPlateNumber);
		
		JLabel lblNewLabel = new JLabel("5 minutes\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel.setBounds(222, 131, 89, 25);
		panel.add(lblNewLabel);
		
		JLabel lblSssj = new JLabel("SSS1234J");
		lblSssj.setForeground(Color.RED);
		lblSssj.setFont(new Font("Candara", Font.BOLD, 20));
		lblSssj.setBounds(227, 305, 80, 25);
		panel.add(lblSssj);
		
		JLabel orderlb = new JLabel("Book!");
		orderlb.setHorizontalAlignment(SwingConstants.CENTER);
		orderlb.setForeground(Color.RED);
		orderlb.setFont(new Font("Candara", Font.BOLD, 20));
		orderlb.setBounds(482, 704, 60, 28);
		add(orderlb);
		
		JButton book = new JButton("");
		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(
					    null,
					    "Are You Sure?",
					    "Confirmation",
					    JOptionPane.YES_NO_OPTION);
				staywell.entities.Taxi taxi = new staywell.entities.Taxi();
			}
		});
		book.setContentAreaFilled(false);
		book.setBorderPainted(false);
		book.setBorder(null);
		book.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Cashing70X70.png")));
		book.setBounds(477, 623, 70, 70);
		add(book);
		
		JLabel lblTaxi = new JLabel("Taxi");
		lblTaxi.setForeground(Color.RED);
		lblTaxi.setFont(new Font("Candara", Font.BOLD, 30));
		lblTaxi.setBounds(482, 11, 60, 30);
		add(lblTaxi);
		
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
		
		super.setLayout();
	}
}


