package staywell.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

import staywell.entities.Session;
import staywell.ui.user.Homepage;

public class Layout extends JPanel {
	
	private MainFrame f = null;
	private String name;
	/**
	 * Create the panel.
	 */
	public Layout() {
		
	}
	public void setLayout(){
		// To set the background image]
		

		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(Layout.class
				.getResource("/staywell/image/SWBG.png")));
		Background.setBounds(0, 0, 1356, 758);
		add(Background);
		
		
	}
	
	public Layout(MainFrame frame){
		this();
		f = frame;
	}

}
