package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import staywell.ui.user.Homepage;


public class Layout2 extends JPanel {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout2 frame = new Layout2();
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
	public Layout2() {
		
		
	}
	public void RealLayout()
	{
		
JLabel Logo = new JLabel("");
		
		// To set the background image*/
		Logo.setIcon(new ImageIcon(Homepage.class.getResource("/Image1/Logo.png")));
		Logo.setBounds(-43, 635, 201, 123);
		add(Logo);
		
				Logo.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						
					}
				});
		
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(Homepage.class
				.getResource("/Image1/SWBG.png")));
		Background.setBounds(0, 0, 1356, 758);
		add(Background);
		
	}

}
