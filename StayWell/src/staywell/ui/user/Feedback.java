package staywell.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import staywell.ui.Layout;
import staywell.ui.MainFrame;


public class Feedback extends Layout {

	private JPanel contentPane;
	private JTable table;
	private MainFrame f=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Feedback() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
		JButton button = new JButton("Home");
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
		
		super.setLayout();
	}
	public Feedback(MainFrame frame)
	{
		this();
		f = frame;
	}
}
