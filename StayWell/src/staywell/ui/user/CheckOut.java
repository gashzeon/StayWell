package staywell.ui.user;


import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class CheckOut extends Layout {
	private JTable table;
	private JTable table_1;
	private MainFrame f;

	/**
	 * Create the panel.
	 */
	public CheckOut(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
		JLabel lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setBounds(433, 11, 192, 35);
		lblCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckOut.setForeground(Color.RED);
		lblCheckOut.setFont(new Font("Candara", Font.BOLD, 30));
		add(lblCheckOut);
		
		JTextArea txtrDateOfStay = new JTextArea();
		txtrDateOfStay.setBounds(35, 11, 175, 52);
		txtrDateOfStay.setEditable(false);
		txtrDateOfStay.setForeground(Color.RED);
		txtrDateOfStay.setFont(new Font("Candara", Font.BOLD, 20));
		txtrDateOfStay.setLineWrap(true);
		txtrDateOfStay.setOpaque(false);
		txtrDateOfStay.setRows(10);
		txtrDateOfStay.setWrapStyleWord(true);
		txtrDateOfStay.setText("Date Of Stay : \r\n12/12/2012");
		add(txtrDateOfStay);
		
		JLabel lblMember = new JLabel("Member: ");
		lblMember.setBounds(795, 11, 192, 27);
		lblMember.setForeground(Color.RED);
		lblMember.setFont(new Font("Candara", Font.BOLD, 20));
		add(lblMember);
		
		JLabel lblNewLabel = new JLabel("Room No:");
		lblNewLabel.setBounds(795, 49, 192, 27);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
		add(lblNewLabel);
		
		JTextArea txtrIfThereIs = new JTextArea();
		txtrIfThereIs.setBounds(135, 603, 300, 105);
		txtrIfThereIs.setFont(new Font("Candara", Font.BOLD, 20));
		txtrIfThereIs.setForeground(Color.RED);
		txtrIfThereIs.setLineWrap(true);
		txtrIfThereIs.setOpaque(false);
		txtrIfThereIs.setWrapStyleWord(true);
		txtrIfThereIs.setRows(10);
		txtrIfThereIs.setText("If there are any doubt and queries about the displayed information, please inform any hotel counter staffs. Thank you.");
		add(txtrIfThereIs);
		
		table = new JTable();
		table.setRowHeight(53);
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Room", null, null, null, null},
				{"Room Service", null, null, null, null},
				{"Laundry", null, null, null, null},
				{"Food Delivery", null, null, null, null},
				{"Restaurant Booking", null, null, null, null},
				{"Facilities Booking", null, null, null, null},
				{"Ballroom Booking", null, null, null, null},
				{"Taxi Booking", null, null, null, null},
			},
			new String[] {
				"Menu", "Item 1 ", "Item 2", "Item 3", "Cost"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(137);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.setFont(new Font("Candara", Font.BOLD, 17));
		table.setEnabled(false);
		table.setBounds(135, 155, 770, 425);
		add(table);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setForeground(Color.RED);
		lblMenu.setFont(new Font("Candara", Font.BOLD, 20));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(135, 119, 204, 25);
		add(lblMenu);
		
		JLabel lblNewLabel_1 = new JLabel("Item 1");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(340, 119, 141, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Item 2");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(480, 119, 141, 25);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Item 3");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_3.setBounds(620, 119, 141, 25);
		add(lblNewLabel_3);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setForeground(new Color(255, 0, 0));
		lblCost.setFont(new Font("Candara", Font.BOLD, 20));
		lblCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblCost.setBounds(761, 119, 144, 25);
		add(lblCost);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(CheckOut.class.getResource("/staywell/image/cashing70X70.png")));
		btnNewButton.setBounds(490, 607, 70, 70);
		add(btnNewButton);
		
		JLabel lblConfirm = new JLabel("Confirm");
		lblConfirm.setForeground(Color.RED);
		lblConfirm.setFont(new Font("Candara", Font.BOLD, 20));
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setBounds(480, 688, 90, 25);
		add(lblConfirm);
		
		table_1 = new JTable();
		table_1.setRowHeight(50);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Discount", "Total"
			}
		));
		table_1.setBounds(620, 620, 285, 50);
		add(table_1);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setForeground(Color.RED);
		lblDiscount.setFont(new Font("Candara", Font.BOLD, 20));
		lblDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscount.setBounds(620, 595, 141, 25);
		add(lblDiscount);
		
		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(761, 595, 144, 25);
		add(lblNewLabel_4);
		
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

		// set layout

		super.setLayout();
	}
}
