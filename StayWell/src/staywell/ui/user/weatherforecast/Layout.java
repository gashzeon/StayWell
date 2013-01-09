package staywell.ui.user.weatherforecast;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Layout extends JPanel {

	/**
	 * Create the panel.
	 */
	public Layout() {
	}
	public void setLayout(){
		JLabel Logo = new JLabel("New label");

		// For the user to be able to click on the logo

		Logo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		Logo.setIcon(new ImageIcon(Layout.class.getResource("/Image/Logo.png")));
		Logo.setBounds(-43, 635, 201, 123);
		add(Logo);

		// To set the background image

		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(Layout.class
				.getResource("/Image/SWBG.png")));
		Background.setBounds(0, 0, 1356, 758);
		add(Background);
	}

}
