package staywell.ui.user;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.ImageIcon;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

import java.awt.Font;
import java.awt.Color;

public class Bluetooth extends Layout{

	/**
	 * Create the panel.
	 */
	MainFrame f = null;
	public Bluetooth() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		JLabel bluetoothLogo = new JLabel("");
		bluetoothLogo.setFont(new Font("Candara", Font.BOLD, 20));
		bluetoothLogo.setIcon(new ImageIcon(Bluetooth.class.getResource("/staywell/image/bluetooth.png")));
		bluetoothLogo.setBounds(437, 264, 150, 150);
		add(bluetoothLogo);
		
		JLabel promtmsg = new JLabel("Please Activate Your Bluetooth Dongle To Authenticate....");
		promtmsg.setForeground(Color.RED);
		promtmsg.setFont(new Font("Candara", Font.BOLD, 24));
		promtmsg.setBounds(215, 444, 594, 50);
		add(promtmsg);
		
		super.setLayout();
	}
	public Bluetooth(MainFrame frame){
		this();
		f = frame;
	}
}
