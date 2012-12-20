package staywell.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class Meals extends Layout{

	/**
	 * Create the panel.
	 */
	MainFrame f = new MainFrame();
	public Meals() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		String columnNames[] = { "BREAKFAST MENU", "NO."};
		String dataValues[][] = { { "BREAKFAST MENU", "NO"},
				{ "Thai Style Fried Rice $8", "" },
				{ "Hong Kong Style Fried Rice $8", ""},
				{ "Beet and Braised Bacon $10", ""},
				{ "House-Smoked Salmon and Smoked Whitefish Rillettes $22", ""},
				{ "Grilled Creekstone Farms Angus Burger $25", ""},
				{ "Braised Chicken $16", ""},
				{ "Grilled Flat Iron Steak $30", ""},
				{ "Pan Fried Fillet of John Dory $25", ""},
				{ "Roast Duckling with Onion & Apricot Stuffing $17", ""},
				{ "Roast Rack of Connemara Lamb $20", ""}};
		TableModel model = new DefaultTableModel(dataValues, columnNames) {
			public boolean isCellEditable(int row, int column) {
				switch (column) {
				case 1:
					switch (row) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 11:
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
		table.getColumnModel().getColumn(1).setMaxWidth(50);
		table.getColumnModel().getColumn(1).setMinWidth(50);
		table.setRowHeight(50);
		table.setFont(new Font("Candara", Font.BOLD, 20));
		table.setBounds(454, 22, 552, 550);
		add(table);
		String columnNames1[] = { "BEVERAGES MENU", "NO."};
		String dataValues1[][] = { { "BEVERAGES MENU", "NO"},
				{ "Mineral Water $2", "" },
				{ "Coke $3.50", ""},
				{ "Lemon Tea $3.50", ""},
				{ "Orange $3.50", ""},
				{ "Tiger Beer $8", ""},
				{ "Carlsberg $8", ""},
				{ "Heineken $9", ""},
				{ "White Wine $40", ""},
				{ "Red Wine $45", ""}};
		
		TableModel model1 = new DefaultTableModel(dataValues1, columnNames1) {
			public boolean isCellEditable(int row, int column) {
				switch (column) {
				case 1:
					switch (row) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
						return true;
						
					default: return false;
					}
				default:
					return false;
				}
			}

		};

		JTable beverages = new JTable(model1);
		beverages.setBorder(new LineBorder(new Color(0, 0, 0)));
		DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
		beverages.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		centerRenderer1.setHorizontalAlignment(JLabel.CENTER);
		beverages.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		beverages.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		beverages.getColumnModel().getColumn(1).setMaxWidth(50);
		beverages.getColumnModel().getColumn(1).setMinWidth(50);
		beverages.setRowHeight(50);
		beverages.setFont(new Font("Candara", Font.BOLD, 20));
		beverages.setBounds(16, 22, 422, 500);
		add(beverages);
		
		JButton cashing = new JButton("");
		cashing.setContentAreaFilled(false);
		cashing.setBorderPainted(false);
		cashing.setIcon(new ImageIcon(Homepage.class.getResource("/staywell/image/Cashing70X70.png")));
		cashing.setBorder(null);
		cashing.setBounds(477, 641, 70, 70);
		add(cashing);
		
		JLabel orderLb = new JLabel("Order!");
		orderLb.setHorizontalAlignment(SwingConstants.CENTER);
		orderLb.setForeground(Color.RED);
		orderLb.setFont(new Font("Candara", Font.BOLD, 20));
		orderLb.setBounds(482, 722, 60, 28);
		add(orderLb);
		
		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
		logo.setBounds(2, 641, 110, 110);
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Homepage homepage = f.getHomePage();
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

	public Meals(MainFrame frame) {
		this();
		f = frame;
	}
}
