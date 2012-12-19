package staywell.ui.user;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;

public class CleaningServices extends Layout {


	/**
	 * Create the panel.
	 */
	
	MainFrame f = new MainFrame();

	public CleaningServices() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		String columnNames[] = { "TIME","SELECT"};
		String dataValues[][] = { { "TIME", "SELECT (To select key in 1 next to the time slot)"},
				{ "9.00am - 11.00am", ""},
				{ "11.00am-1.00pm", ""},
				{ "1.00pm - 3.00pm", ""},
				{ "3.00pm - 5.00pm", ""}};
		TableModel model = new DefaultTableModel(dataValues, columnNames) {
			public boolean isCellEditable(int row, int column) {
				switch (column) {
				case 1:
					switch (row) {
					case 1:
					case 2:
					case 3:
					case 4:
						return true;
						
					default: return false;
					}
				default:
					return false;
				}
			}

		};
		

		JTable table = new JTable(model);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(0).setMaxWidth(1000);
		table.getColumnModel().getColumn(0).setMinWidth(150);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowHeight(50);
		table.setFont(new Font("Candara", Font.BOLD, 20));
		table.setBounds(169, 250, 685, 250);
		add(table);
		
		JButton cashing = new JButton("");
		cashing.setContentAreaFilled(false);
		cashing.setBorderPainted(false);
		cashing.setIcon(new ImageIcon(Homepage.class.getResource("/Image1/Cashing70X70.png")));
		cashing.setBorder(null);
		cashing.setBounds(477, 511, 70, 70);
		add(cashing);
		
		JLabel orderLb = new JLabel("Order!");
		orderLb.setHorizontalAlignment(SwingConstants.CENTER);
		orderLb.setForeground(Color.RED);
		orderLb.setFont(new Font("Candara", Font.BOLD, 20));
		orderLb.setBounds(482, 592, 60, 28);
		add(orderLb);
		
		JLabel lblCleaningServices = new JLabel("Cleaning Services");
		lblCleaningServices.setForeground(Color.RED);
		lblCleaningServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblCleaningServices.setBounds(395, 11, 233, 30);
		add(lblCleaningServices);
		super.setLayout();
	}

	public CleaningServices(MainFrame frame) {
		this();
		f = frame;
	}
}
