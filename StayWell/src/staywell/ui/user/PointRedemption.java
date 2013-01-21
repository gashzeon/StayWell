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

import staywell.entities.SessionEntities;
import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class PointRedemption extends Layout {

	/**
	 * Create the panel.
	 */
	private MainFrame f;
	public PointRedemption(MainFrame frame) {
		f = frame;
		
		SessionEntities session = new SessionEntities();
		if(f.getSession() != null){
			session = f.getSession();
		}
		points = session.getPoints();
		
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		
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
		
		JLabel pointLb = new JLabel("Reward Points: " + points);
		pointLb.setForeground(Color.RED);
		pointLb.setFont(new Font("Candara", Font.BOLD, 15));
		pointLb.setBounds(0, 0, 200, 38);
		add(pointLb);
		super.setLayout();
	}
}
