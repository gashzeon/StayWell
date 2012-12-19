package staywell.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import staywell.ui.user.Homepage;

public class Layout extends JPanel {
	
	private MainFrame f = null;
	/**
	 * Create the panel.
	 */
	public Layout() {
		
	}
	public void setLayout(){
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Image1/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Homepage homepage = f.getHomePage();
				f.getContentPane().removeAll();
				f.getContentPane().add(homepage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		add(logo);
		// To set the background image

		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(Layout.class
				.getResource("/Image/SWBG.png")));
		Background.setBounds(0, 0, 1356, 758);
		add(Background);
	}
	
	public Layout(MainFrame frame){
		this();
		f = frame;
	}

}
