package staywell.ui.user;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

import staywell.entities.SessionEntities;
import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class HotelFacilities extends Layout {
	private JTable table;
	private boolean DEBUG = false;

	/**
	 * Create the panel.
	 */
	private MainFrame f;

	public HotelFacilities(MainFrame frame) {
		f = frame;
		
		SessionEntities session = new SessionEntities();
		if(f.getSession() != null){
			session = f.getSession();
		}
		points = session.getPoints();
		
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
			}
		});
		Confirm.setOpaque(false);
		Confirm.setIcon(new ImageIcon(HotelFacilities.class
				.getResource("/staywell/image/cashing70X70.png")));
		Confirm.setBounds(515, 550, 70, 70);
		add(Confirm);

		JLabel lblComfirm = new JLabel("Confirm");
		lblComfirm.setForeground(Color.RED);
		lblComfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblComfirm.setFont(new Font("Candara", Font.BOLD, 20));
		lblComfirm.setBounds(510, 625, 85, 25);
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
		txtrPleaseSelectAccordingly.setBounds(115, 545, 230, 100);
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
			  		 						 "Types",
			  		 						 "Day",
			  		 						 "Month",
			  		 						 "Year",
			  		 						 "Time Start",
			  	     						 "Time End"};
			
				    private Object[][] data = {
				    		{new Boolean(false), "Fitness Room",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Tennis Court",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Spa Room",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Sauna Room",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Yoga Room",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Jacuzzi Room",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Lounges",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
							{new Boolean(false), "Billiard/Pool Room",new Integer(01), new Integer(01), new Integer(2013), "0900","1100"},
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
				table.getColumnModel().getColumn(1).setPreferredWidth(180);
				table.getColumnModel().getColumn(2).setPreferredWidth(110);
				table.getColumnModel().getColumn(3).setPreferredWidth(110);
				table.getColumnModel().getColumn(4).setPreferredWidth(110);
				table.getColumnModel().getColumn(5).setPreferredWidth(130);
				table.getColumnModel().getColumn(6).setPreferredWidth(130);
				table.setRowSelectionAllowed(false);
				table.setFont(new Font("Candara", Font.BOLD, 17));
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(115, 75, 800, 450);
				add(scrollPane);
				
				JTextArea txtrFillInThe = new JTextArea();
				txtrFillInThe.setEditable(false);
				txtrFillInThe.setForeground(Color.RED);
				txtrFillInThe.setOpaque(false);
				txtrFillInThe.setText("Time is in 24hrs format and interval of 30 minutes. Thank You." );
				txtrFillInThe.setWrapStyleWord(true);
				txtrFillInThe.setRows(10);
				txtrFillInThe.setLineWrap(true);
				txtrFillInThe.setFont(new Font("Candara", Font.BOLD, 17));
				txtrFillInThe.setBounds(665, 545, 250, 90);
				add(txtrFillInThe);
		
		JLabel pointLb = new JLabel("Reward Points: " + points);
		pointLb.setForeground(Color.RED);
		pointLb.setFont(new Font("Candara", Font.BOLD, 15));
		pointLb.setBounds(0, 0, 200, 38);
		add(pointLb);

		setUpDayColumn(table, table.getColumnModel().getColumn(2));
		setUpMonthColumn(table, table.getColumnModel().getColumn(3));
		setUpYearColumn(table, table.getColumnModel().getColumn(4));
		setUpTimeStartColumn(table, table.getColumnModel().getColumn(5));
		setUpTimeEndColumn(table, table.getColumnModel().getColumn(6));

		super.setLayout();

	}
	
	public void setUpDayColumn(JTable table, TableColumn DayColumn) {
		JComboBox comboBox = new JComboBox();
        comboBox.addItem("01");
        comboBox.addItem("02");
        comboBox.addItem("03");
        comboBox.addItem("04");
        comboBox.addItem("05");
        comboBox.addItem("07");
        comboBox.addItem("08");
        comboBox.addItem("09");
        comboBox.addItem("10");
        comboBox.addItem("11");
        comboBox.addItem("12");
        comboBox.addItem("13");
        comboBox.addItem("14");
        comboBox.addItem("15");
        comboBox.addItem("16");
        comboBox.addItem("17");
        comboBox.addItem("18");
        comboBox.addItem("19");
        comboBox.addItem("20");
        comboBox.addItem("21");
        comboBox.addItem("22");
        comboBox.addItem("23");
        comboBox.addItem("24");
        comboBox.addItem("25");
        comboBox.addItem("26");
        comboBox.addItem("27");
        comboBox.addItem("28");
        comboBox.addItem("29");
        comboBox.addItem("30");
        comboBox.addItem("31");
        DayColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
        DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        DayColumn.setCellRenderer(renderer);
    
	}
	
	public void setUpMonthColumn(JTable table, TableColumn MonthColumn) {
		JComboBox comboBox = new JComboBox();
        comboBox.addItem("01");
        comboBox.addItem("02");
        comboBox.addItem("03");
        comboBox.addItem("04");
        comboBox.addItem("05");
        comboBox.addItem("07");
        comboBox.addItem("08");
        comboBox.addItem("09");
        comboBox.addItem("10");
        comboBox.addItem("11");
        comboBox.addItem("12");
        MonthColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
        DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        MonthColumn.setCellRenderer(renderer);
	}
	
	public void setUpYearColumn(JTable table, TableColumn YearColumn) {
		JComboBox comboBox = new JComboBox();
        comboBox.addItem("2013");
        comboBox.addItem("2014");
        comboBox.addItem("2015");
        comboBox.addItem("2016");
        comboBox.addItem("2017");
        comboBox.addItem("2018");
        comboBox.addItem("2019");
        comboBox.addItem("2020");
      
        YearColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
        DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        YearColumn.setCellRenderer(renderer);
    
	}
	
	public void setUpTimeStartColumn(JTable table, TableColumn TimeStartColumn) {
		JComboBox comboBox = new JComboBox();
        comboBox.addItem("0900");
        comboBox.addItem("0930");
        comboBox.addItem("1000");
        comboBox.addItem("1030");
        comboBox.addItem("1100");
        comboBox.addItem("1130");
        comboBox.addItem("1200");
        comboBox.addItem("1230");
        comboBox.addItem("1300");
        comboBox.addItem("1330");
        comboBox.addItem("1400");
        comboBox.addItem("1430");
        comboBox.addItem("1500");
        comboBox.addItem("1530");
        comboBox.addItem("1600");
        comboBox.addItem("1630");
        comboBox.addItem("1700");
        comboBox.addItem("1730");
        comboBox.addItem("1800");
        comboBox.addItem("1830");
        comboBox.addItem("1900");
        comboBox.addItem("1930");
        comboBox.addItem("2000");
        comboBox.addItem("2030");
        comboBox.addItem("2100");
       
        TimeStartColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
        DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        TimeStartColumn.setCellRenderer(renderer);
    
	}
	
	public void setUpTimeEndColumn(JTable table, TableColumn TimeEndColumn) {
		JComboBox comboBox = new JComboBox();
        comboBox.addItem("1100");
        comboBox.addItem("1130");
        comboBox.addItem("1200");
        comboBox.addItem("1230");
        comboBox.addItem("1300");
        comboBox.addItem("1330");
        comboBox.addItem("1400");
        comboBox.addItem("1430");
        comboBox.addItem("1500");
        comboBox.addItem("1530");
        comboBox.addItem("1600");
        comboBox.addItem("1630");
        comboBox.addItem("1700");
        comboBox.addItem("1730");
        comboBox.addItem("1800");
        comboBox.addItem("1830");
        comboBox.addItem("1900");
        comboBox.addItem("1930");
        comboBox.addItem("2000");
        comboBox.addItem("2030");
        comboBox.addItem("2100");
        comboBox.addItem("2130");
        comboBox.addItem("2200");
       
        TimeEndColumn.setCellEditor(new DefaultCellEditor(comboBox));
        
        DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        TimeEndColumn.setCellRenderer(renderer);
    
	}
}