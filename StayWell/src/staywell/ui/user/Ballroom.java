package staywell.ui.user;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class Ballroom extends Layout {
	private boolean DEBUG = false;
	private JTable table_1;
	private JTable BallRoomTable;

	/**
	 * Create the panel.
	 */
	MainFrame f = null;
	public Ballroom() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
				
		
		JLabel lblBallRoom = new JLabel("Ball Room");
		lblBallRoom.setForeground(Color.RED);
		lblBallRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblBallRoom.setFont(new Font("Candara", Font.BOLD, 30));
		lblBallRoom.setBounds(465, 11, 134, 40);
		add(lblBallRoom);
		
		BallRoomTable = new JTable();
		BallRoomTable.setPreferredScrollableViewportSize(new Dimension(450, 450));
		BallRoomTable.setRowSelectionAllowed(false);
		BallRoomTable.setRowHeight(100);
		BallRoomTable.setEnabled(false);
		BallRoomTable.setFont(new Font("Candara", Font.BOLD, 17));
		BallRoomTable.setBackground(Color.WHITE);
		BallRoomTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Parties (30-35 Pax)", null, null, null},
				{"Weddings (70 - 80 Pax)", null, null, null},
				{"Events (80 - 100 Pax)", null, null, null},
				{"Buffets (30 - 40 Pax)", null, null, null},
			},
			new String[] {
				"-Item-", "Select", "Time Slot", "Date"
			}
		));
		BallRoomTable.getColumnModel().getColumn(0).setPreferredWidth(151);
		BallRoomTable.getColumnModel().getColumn(2).setPreferredWidth(168);
		BallRoomTable.getColumnModel().getColumn(3).setPreferredWidth(230);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setActionCommand("");
		chckbxNewCheckBox.setBounds(378, 170, 21, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setOpaque(false);
		chckbxNewCheckBox_1.setBounds(378, 263, 21, 23);
		add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setOpaque(false);
		chckbxNewCheckBox_2.setBounds(378, 366, 21, 23);
		add(chckbxNewCheckBox_2);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setOpaque(false);
		checkBox.setBounds(378, 461, 21, 23);
		add(checkBox);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDate_1.setBounds(705, 135, 46, 14);
		add(lblDate_1);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(808, 135, 46, 14);
		add(lblMonth);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_5.setBounds(707, 173, 45, 25);
		add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_6.setBounds(707, 263, 45, 25);
		add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_7.setBounds(707, 366, 45, 25);
		add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_8.setBounds(707, 461, 45, 25);
		add(comboBox_8);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_10.setBounds(810, 173, 45, 25);
		add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_11.setBounds(810, 263, 45, 25);
		add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_12.setBounds(810, 366, 45, 25);
		add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_13.setBounds(810, 461, 45, 25);
		add(comboBox_13);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setBounds(470, 136, 46, 14);
		add(lblStart);
		
		JLabel lblEnd = new JLabel("End");
		lblEnd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnd.setBounds(558, 136, 46, 14);
		add(lblEnd);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm"}));
		comboBox_2.setBounds(465, 366, 60, 25);
		add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm"}));
		comboBox_3.setBounds(465, 460, 60, 25);
		add(comboBox_3);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm"}));
		comboBox_15.setBounds(553, 170, 60, 25);
		add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm"}));
		comboBox_16.setBounds(553, 263, 60, 25);
		add(comboBox_16);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm"}));
		comboBox_17.setBounds(553, 366, 60, 25);
		add(comboBox_17);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm", "11pm"}));
		comboBox_18.setBounds(553, 460, 60, 25);
		add(comboBox_18);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm"}));
		comboBox.setBounds(465, 170, 60, 25);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"9am", "10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm"}));
		comboBox_1.setBounds(465, 263, 60, 25);
		add(comboBox_1);
		BallRoomTable.setCellSelectionEnabled(true);
		BallRoomTable.setBounds(150, 125, 757, 400);
		add(BallRoomTable);
					
					JButton button = new JButton("");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						}
					});
					button.setOpaque(false);
					button.setIcon(new ImageIcon(Ballroom.class.getResource("/staywell/image/cashing70X70.png")));
					button.setBounds(497, 574, 70, 70);
					add(button);
										
										JLabel lblComfirm = new JLabel("Confirm");
										lblComfirm.setForeground(Color.RED);
										lblComfirm.setHorizontalAlignment(SwingConstants.CENTER);
										lblComfirm.setFont(new Font("Candara", Font.BOLD, 20));
										lblComfirm.setBounds(487, 655, 90, 25);
										add(lblComfirm);
															
															JLabel lblSelect = new JLabel("Select");
															lblSelect.setForeground(Color.RED);
															lblSelect.setFont(new Font("Candara", Font.BOLD, 20));
															lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
															lblSelect.setBounds(332, 93, 109, 25);
															add(lblSelect);
															
															JLabel lblTimeSlot = new JLabel("Time Slot");
															lblTimeSlot.setForeground(Color.RED);
															lblTimeSlot.setHorizontalAlignment(SwingConstants.CENTER);
															lblTimeSlot.setFont(new Font("Candara", Font.BOLD, 20));
															lblTimeSlot.setBounds(441, 93, 202, 25);
															add(lblTimeSlot);
															
															JLabel lblDate = new JLabel("Date");
															lblDate.setForeground(Color.RED);
															lblDate.setFont(new Font("Candara", Font.BOLD, 20));
															lblDate.setHorizontalAlignment(SwingConstants.CENTER);
															lblDate.setBounds(642, 93, 265, 25);
															add(lblDate);
															
															JLabel lblTypes = new JLabel("Types");
															lblTypes.setForeground(Color.RED);
															lblTypes.setHorizontalAlignment(SwingConstants.CENTER);
															lblTypes.setFont(new Font("Candara", Font.BOLD, 20));
															lblTypes.setBounds(150, 93, 183, 25);
															add(lblTypes);
															
															JTextArea txtrPleaseChooseThe = new JTextArea();
															txtrPleaseChooseThe.setForeground(Color.RED);
															txtrPleaseChooseThe.setColumns(10);
															txtrPleaseChooseThe.setEditable(false);
															txtrPleaseChooseThe.setFont(new Font("Candara", Font.BOLD, 20));
															txtrPleaseChooseThe.setLineWrap(true);
															txtrPleaseChooseThe.setOpaque(false);
															txtrPleaseChooseThe.setRows(10);
															txtrPleaseChooseThe.setWrapStyleWord(true);
															txtrPleaseChooseThe.setText("Please select accordingly.");
															txtrPleaseChooseThe.setBounds(149, 557, 230, 70);
															add(txtrPleaseChooseThe);
															
			//set layout							
			super.setLayout();
	}
	public Ballroom(MainFrame frame) {
		this();
		f = frame;
	}
}
	

