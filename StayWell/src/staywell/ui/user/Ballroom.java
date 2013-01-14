package staywell.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class Ballroom extends Layout {
	private boolean DEBUG = false;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	MainFrame f;

	public Ballroom(MainFrame frame) {
		f = frame;
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		JLabel lblBallRoom = new JLabel("Ball Room");
		lblBallRoom.setForeground(Color.RED);
		lblBallRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblBallRoom.setFont(new Font("Candara", Font.BOLD, 30));
		lblBallRoom.setBounds(465, 11, 134, 40);
		add(lblBallRoom);

		JButton Confirm = new JButton("");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int n = JOptionPane.showConfirmDialog(
					    null,
					    "Are You Sure?",
					    "Confirmation",
					    JOptionPane.YES_NO_OPTION);
				staywell.entities.Ballroom ballroom = new staywell.entities.Ballroom();
			}
		});
		Confirm.setOpaque(false);
		Confirm.setIcon(new ImageIcon(Ballroom.class
				.getResource("/staywell/image/cashing70X70.png")));
		Confirm.setBounds(497, 574, 70, 70);
		add(Confirm);

		JLabel lblComfirm = new JLabel("Confirm");
		lblComfirm.setForeground(Color.RED);
		lblComfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblComfirm.setFont(new Font("Candara", Font.BOLD, 20));
		lblComfirm.setBounds(487, 655, 90, 25);
		add(lblComfirm);
		
		JTextArea txtrPleaseChooseThe = new JTextArea();
		txtrPleaseChooseThe.setForeground(Color.RED);
		txtrPleaseChooseThe.setColumns(10);
		txtrPleaseChooseThe.setEditable(false);
		txtrPleaseChooseThe.setFont(new Font("Candara", Font.BOLD, 20));
		txtrPleaseChooseThe.setLineWrap(true);
		txtrPleaseChooseThe.setOpaque(false);
		txtrPleaseChooseThe.setRows(10);
		txtrPleaseChooseThe.setWrapStyleWord(true);
		txtrPleaseChooseThe.setText("Available for booking from 0900hrs to 2300hrs. Max 5hrs of usage . Please select accordingly.");
		txtrPleaseChooseThe.setBounds(150, 555, 230, 125);
		add(txtrPleaseChooseThe);

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
		
class MyTableModel extends AbstractTableModel {
			
			private String[] columnNames = { "Select", 
									  		 "Types",
									  		 "Date",
									  		 "Time Start",
									  	     "Time End"};
		    private Object[][] data = {
					{new Boolean(false), "Parties (30 - 35 Pax)", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Weddings (70 - 80 Pax)", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Events (80 - 100 Pax)", "DD/MM/YY", "0915", "1145"},
					{new Boolean(false), "Buffets (30 - 40 Pax)", "DD/MM/YY", "0915", "1145"},
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
		
		add(logo);
		super.setLayout();
	}
}
