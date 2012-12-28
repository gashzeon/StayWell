package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminFeedBack_P2 extends Layout2 {

	private JPanel contentPane;
	private JTable table;
	private Frame2 f=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AdminFeedBack_P2() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(32, 89, 950, 392);
		add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setFont(new Font("Candara",Font.BOLD,20));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setRowHeight(87);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Hotel Services FeedBack", null},
				{"Facilities FeedBack", null},
				{"System FeedBack", null},
				{"Other Additional FeedBack", null},
			},
			new String[] {
				"New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(150);
		table.getColumnModel().getColumn(0).setMinWidth(150);
		table.getColumnModel().getColumn(1).setPreferredWidth(600);
		table.getColumnModel().getColumn(1).setMinWidth(600);
		table.setOpaque(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setBounds(5, 33, 940, 350);
		
		panel_1.add(table);
		
		
		
		JLabel lblLaundryServices = new JLabel("Customer FeedBack");
		lblLaundryServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblLaundryServices.setBounds(379, 42, 256, 36);
		add(lblLaundryServices);
		
		super.RealLayout();
	}
	public AdminFeedBack_P2(Frame2 frame)
	{
		this();
		f = frame;
	}
}
