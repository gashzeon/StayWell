package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminCheckOut extends Layout2 {

	private JPanel contentPane;
	private JTable table;
	private Frame2 f =null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminCheckOut() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Candara", Font.PLAIN, 11));
		scrollPane.setEnabled(true);
		scrollPane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setFocusable(false);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(7, 144, 1000, 470);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage adminHomePage = f.getAdminHomePage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminHomePage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		button.setFont(new Font("Candara", Font.BOLD, 20));
		button.setBorder(null);
		button.setBounds(10, 11, 111, 25);
		add(button);
		add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Candara", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Date / Time", "Room No", "Name of Customer", "Food & Beverage ($)", "Laundry Services ($)", "Restaurants ($)", "Ball Room ($)", "Hotel Room Fee ($)", "Discount (%)", "Total Cost ($)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(110);
		table.getColumnModel().getColumn(0).setMinWidth(110);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setMinWidth(70);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(110);
		table.getColumnModel().getColumn(2).setMinWidth(110);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setMinWidth(120);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setMinWidth(120);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setMinWidth(90);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setMinWidth(80);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(110);
		table.getColumnModel().getColumn(7).setMinWidth(110);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(80);
		table.getColumnModel().getColumn(8).setMinWidth(80);
		table.getColumnModel().getColumn(9).setResizable(false);
		table.getColumnModel().getColumn(9).setPreferredWidth(80);
		table.getColumnModel().getColumn(9).setMinWidth(80);
		table.setRowHeight(50);
		table.setOpaque(false);
		table.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(table);
		
		JLabel lblLaundryServices = new JLabel("Customer Check Out");
		lblLaundryServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblLaundryServices.setBounds(374, 42, 265, 36);
		add(lblLaundryServices);
			
		super.RealLayout();	
		
	}
	public AdminCheckOut(Frame2 frame)
	{
		this();
		f = frame;
	}
}
