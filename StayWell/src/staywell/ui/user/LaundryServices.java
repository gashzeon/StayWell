package staywell.ui.user;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class LaundryServices extends Layout {

	/**
	 * Create the panel.
	 */
	MainFrame f;

	public LaundryServices(MainFrame frame) {
		f=frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		String columnNames[] = { "SERVICES", "NO.", "COLLECTION DATE" };
		String dataValues[][] = { { "SERVICES", "NO", "COLLECTION DATE" },
				{ "Normal Washing (per piece) $4", "", "" },
				{ "Soft Washing (per piece) $5", "", "" },
				{ "Softener (per piece) $6", "", "" },
				{ "Dry Cleaning (per piece) $22", "", "" },
				{ "Ironing (per piece) $4", "", "" } };
		TableModel model = new DefaultTableModel(dataValues, columnNames) {
			public boolean isCellEditable(int row, int column) {
				switch (column) {
				case 1:
				case 2:
					switch (row) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
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
		table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(1).setMaxWidth(100);
		table.setRowHeight(50);
		table.setFont(new Font("Candara", Font.BOLD, 20));
		table.setBounds(169, 225, 685, 300);
		add(table);
		
		JButton cashing = new JButton("");
		cashing.setContentAreaFilled(false);
		cashing.setBorderPainted(false);
		cashing.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Cashing70X70.png")));
		cashing.setBorder(null);
		cashing.setBounds(477, 542, 70, 70);
		add(cashing);
		
		JLabel orderLb = new JLabel("Order!");
		orderLb.setHorizontalAlignment(SwingConstants.CENTER);
		orderLb.setForeground(Color.RED);
		orderLb.setFont(new Font("Candara", Font.BOLD, 20));
		orderLb.setBounds(482, 623, 60, 28);
		add(orderLb);
		
		JLabel lblLaundryServices = new JLabel("Laundry Services\r\n");
		lblLaundryServices.setForeground(Color.RED);
		lblLaundryServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblLaundryServices.setBounds(399, 11, 226, 30);
		add(lblLaundryServices);
		
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
		
		super.setLayout();
	}
}
