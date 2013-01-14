package staywell.ui.user;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class HotelFacilities extends Layout {

	/**
	 * Create the panel.
	 */
	private MainFrame f;
	private JTable table;
	private boolean DEBUG = false;

	public HotelFacilities(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		JLabel lblFacilities = new JLabel("Facilities");
		lblFacilities.setForeground(Color.RED);
		lblFacilities.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFacilities.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacilities.setFont(new Font("Candara", Font.BOLD, 30));
		lblFacilities.setBounds(427, 11, 232, 32);
		add(lblFacilities);

		JButton Confirm = new JButton("");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(
					    null,
					    "Are You Sure?",
					    "Confirmation",
					    JOptionPane.YES_NO_OPTION);
				staywell.entities.HotelFacilities hotelFacilities = new staywell.entities.HotelFacilities();
			}
		});
		Confirm.setOpaque(false);
		Confirm.setIcon(new ImageIcon(HotelFacilities.class
				.getResource("/staywell/image/cashing70X70.png")));
		Confirm.setBounds(516, 581, 70, 70);
		add(Confirm);

		JLabel lblComfirm = new JLabel("Confirm");
		lblComfirm.setForeground(Color.RED);
		lblComfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblComfirm.setFont(new Font("Candara", Font.BOLD, 20));
		lblComfirm.setBounds(508, 654, 85, 25);
		add(lblComfirm);
		
		JTextArea txtrPleaseSelectAccordingly = new JTextArea();
		txtrPleaseSelectAccordingly.setWrapStyleWord(true);
		txtrPleaseSelectAccordingly.setTabSize(10);
		txtrPleaseSelectAccordingly.setOpaque(false);
		txtrPleaseSelectAccordingly.setRows(10);
		txtrPleaseSelectAccordingly.setLineWrap(true);
		txtrPleaseSelectAccordingly.setForeground(Color.RED);
		txtrPleaseSelectAccordingly.setFont(new Font("Candara", Font.BOLD, 20));
		txtrPleaseSelectAccordingly.setEditable(false);
		txtrPleaseSelectAccordingly.setText("Available for booking from 0900hrs to 2200hrs. Max 2hrs of usage . Please select accordingly.");
		txtrPleaseSelectAccordingly.setBounds(150, 555, 230, 100);
		add(txtrPleaseSelectAccordingly);

		JButton logo = new JButton();
		logo.setIcon(new ImageIcon(Homepage.class
				.getResource("/Staywell/image/Logo.png")));
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
		
class MyTableModel extends AbstractTableModel {
			
			private String[] columnNames = { "Select", 
									  		 "Facilities",
									  		 "Date",
									  		 "Time Start",
									  	     "Time End"};
		    private Object[][] data = {
		    		{new Boolean(false), "Fitness Room", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Tennis Court", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Spa Room", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Sauna Room", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Yoga Room", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Jacuzzi Room", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Lounges", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Billiard/Pool Room", "DD/MM/YY", "0915", "1145"},
					};
			
			public int getColumnCount(){
				return columnNames.length;
			}
			
			public int getRowCount(){
				return data.length;
			}
			
			public String getColumnName(int col){
				return columnNames[col];
			}
			
			public Object getValueAt(int row, int col){
				return data[row][col];
			}
			
		
			public boolean isCellEditable(int row, int col) {
	            
	            if (col != 1) {
	                return true;
	            } else {
	                return false;
	            }
			}
			
			
			public void setValueAt(Object value, int row, int col) {
	            if (DEBUG) {
	                System.out.println("Setting value at " + row + "," + col
	                                   + " to " + value
	                                   + " (an instance of "
	                                   + value.getClass() + ")");
	            }
	            
	            data[row][col] = value;
	            fireTableCellUpdated(row, col);

	            if (DEBUG) {
	                System.out.println("New value of data:");
	                printDebugData();
	            }
			}
			
			private void printDebugData() {
	            int numRows = getRowCount();
	            int numCols = getColumnCount();

	            for (int i=0; i < numRows; i++) {
	                System.out.print("    row " + i + ":");
	                for (int j=0; j < numCols; j++) {
	                    System.out.print("  " + data[i][j]);
	                }
	                System.out.println();
	            }
	            System.out.println("--------------------------");
	        }
		}
		JTable table = new JTable(new MyTableModel())
		{
		// Returning the Class of each column will allow different      
		// renderers to be used based on Class      
		public Class getColumnClass(int column)      
		{ 
			if (column == 0) return Boolean.class;
			Object o = getValueAt(0, column);
			if (o != null) return o.getClass();
			else return String.class;
		    
		}  
				
		};
		
		table.setRowHeight(106);
		//table.setModel(new DefaultTableModel(
			
		//));
		table.getColumnModel().getColumn(1).setPreferredWidth(163);
		table.getColumnModel().getColumn(2).setPreferredWidth(119);
		table.getColumnModel().getColumn(3).setPreferredWidth(106);
		table.getColumnModel().getColumn(4).setPreferredWidth(130);
		table.setRowSelectionAllowed(false);
		table.setFont(new Font("Candara", Font.BOLD, 17));

		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(150, 75, 715, 450);
		add(scrollPane);
		
		JTextArea txtrFillInThe = new JTextArea();
		txtrFillInThe.setEditable(false);
		txtrFillInThe.setForeground(Color.RED);
		txtrFillInThe.setOpaque(false);
		txtrFillInThe.setText("Fill in the date and time in the correct format. Time is in 24hrs format and interval of 15 minutes. Thank You." );
		txtrFillInThe.setWrapStyleWord(true);
		txtrFillInThe.setRows(10);
		txtrFillInThe.setLineWrap(true);
		txtrFillInThe.setFont(new Font("Candara", Font.BOLD, 17));
		txtrFillInThe.setBounds(615, 555, 250, 125);
		add(txtrFillInThe);

		// set layout

		super.setLayout();

	}
}
