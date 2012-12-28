package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
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

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;


public class AdminCarCollection2 extends Layout2{

	private JPanel contentPane;
	private JTable table;
	private Frame2 f =null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminCarCollection2() {
		
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		JLabel lblLaundryServices = new JLabel("Car Collection");
		lblLaundryServices.setBackground(Color.WHITE);
		lblLaundryServices.setOpaque(true);
		lblLaundryServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblLaundryServices.setBounds(359, 42, 295, 36);
		add(lblLaundryServices);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(true);
		scrollPane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setFocusable(false);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(32, 144, 950, 470);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Candara", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Date / Time", "Room No", "Name of Customer", "Customer Car Plate No"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(0).setMinWidth(120);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		table.getColumnModel().getColumn(1).setMinWidth(50);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setMinWidth(150);
		table.setRowHeight(50);
		table.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(table);
		
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
		
		super.RealLayout();
		
	}
	public AdminCarCollection2(Frame2 frame)
	{
		this();
		f =frame;
	}
}
