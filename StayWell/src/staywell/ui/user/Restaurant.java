package staywell.ui.user;




import javax.swing.JPanel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Frame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

import staywell.ui.Layout;
import staywell.ui.MainFrame;

public class Restaurant extends Layout {
	private JTable RestaurantTable;

	/**
	 * Create the panel.
	 */
	private MainFrame f = null;
	
	public Restaurant() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);
		
				
				JLabel lblRestaurant = new JLabel("Restaurant");
				lblRestaurant.setForeground(Color.RED);
				lblRestaurant.setHorizontalAlignment(SwingConstants.CENTER);
				lblRestaurant.setFont(new Font("Candara", Font.BOLD, 30));
				lblRestaurant.setBounds(460, 11, 143, 25);
				add(lblRestaurant);
						
						JButton button = new JButton("");
						button.setIcon(new ImageIcon(Restaurant.class.getResource("/Image1/cashing70X70.png")));
						button.setBounds(514, 598, 70, 70);
						add(button);
						
						JLabel lblComfirm = new JLabel("Confirm");
						lblComfirm.setForeground(Color.RED);
						lblComfirm.setHorizontalAlignment(SwingConstants.CENTER);
						lblComfirm.setFont(new Font("Candara", Font.BOLD, 20));
						lblComfirm.setBounds(505, 679, 90, 25);
						add(lblComfirm);
						
						JCheckBox checkBox = new JCheckBox("");
						checkBox.setOpaque(false);
						checkBox.setBounds(340, 132, 20, 20);
						add(checkBox);
						
						JCheckBox checkBox_1 = new JCheckBox("");
						checkBox_1.setOpaque(false);
						checkBox_1.setBounds(340, 232, 20, 20);
						add(checkBox_1);
						
						JCheckBox checkBox_2 = new JCheckBox("");
						checkBox_2.setOpaque(false);
						checkBox_2.setBounds(340, 334, 20, 20);
						add(checkBox_2);
						
						JCheckBox checkBox_3 = new JCheckBox("");
						checkBox_3.setOpaque(false);
						checkBox_3.setBounds(340, 428, 20, 20);
						add(checkBox_3);
						
						JCheckBox checkBox_4 = new JCheckBox("");
						checkBox_4.setOpaque(false);
						checkBox_4.setBounds(340, 522, 20, 20);
						add(checkBox_4);
						
						JComboBox comboBox_1 = new JComboBox();
						comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_1.setBounds(525, 147, 70, 31);
						add(comboBox_1);
						
						JComboBox comboBox_2 = new JComboBox();
						comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm"}));
						comboBox_2.setBounds(442, 232, 60, 30);
						add(comboBox_2);
						
						JComboBox comboBox_4 = new JComboBox();
						comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm"}));
						comboBox_4.setBounds(442, 418, 60, 30);
						add(comboBox_4);
						
						JComboBox comboBox_5 = new JComboBox();
						comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm"}));
						comboBox_5.setBounds(442, 512, 60, 30);
						add(comboBox_5);
						
						JComboBox comboBox_6 = new JComboBox();
						comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_6.setBounds(525, 232, 70, 31);
						add(comboBox_6);
						
						JComboBox comboBox_7 = new JComboBox();
						comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_7.setBounds(525, 323, 70, 31);
						add(comboBox_7);
						
						JComboBox comboBox_8 = new JComboBox();
						comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_8.setBounds(525, 418, 70, 31);
						add(comboBox_8);
						
						JComboBox comboBox_9 = new JComboBox();
						comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_9.setBounds(525, 512, 70, 31);
						add(comboBox_9);
						
						JLabel lblHour = new JLabel("Hour");
						lblHour.setFont(new Font("Candara", Font.BOLD, 15));
						lblHour.setHorizontalAlignment(SwingConstants.CENTER);
						lblHour.setBounds(448, 111, 46, 14);
						add(lblHour);
						
						JLabel lblMinutes = new JLabel("Minutes");
						lblMinutes.setFont(new Font("Candara", Font.BOLD, 15));
						lblMinutes.setHorizontalAlignment(SwingConstants.CENTER);
						lblMinutes.setBounds(529, 111, 61, 14);
						add(lblMinutes);
						
						JLabel lblHour_1 = new JLabel("Hour");
						lblHour_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblHour_1.setFont(new Font("Candara", Font.BOLD, 15));
						lblHour_1.setBounds(614, 111, 60, 14);
						add(lblHour_1);
						
						JLabel lblMinutes_1 = new JLabel("Minutes");
						lblMinutes_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblMinutes_1.setFont(new Font("Candara", Font.BOLD, 15));
						lblMinutes_1.setBounds(694, 111, 58, 14);
						add(lblMinutes_1);
						
						JComboBox comboBox_10 = new JComboBox();
						comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm"}));
						comboBox_10.setBounds(615, 147, 60, 31);
						add(comboBox_10);
						
						JComboBox comboBox_11 = new JComboBox();
						comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm"}));
						comboBox_11.setBounds(615, 232, 60, 31);
						add(comboBox_11);
						
						JComboBox comboBox_12 = new JComboBox();
						comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm"}));
						comboBox_12.setBounds(615, 323, 60, 31);
						add(comboBox_12);
						
						JComboBox comboBox_13 = new JComboBox();
						comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm"}));
						comboBox_13.setBounds(615, 418, 60, 31);
						add(comboBox_13);
						
						JComboBox comboBox_14 = new JComboBox();
						comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm"}));
						comboBox_14.setBounds(615, 512, 60, 31);
						add(comboBox_14);
						
						JComboBox comboBox_15 = new JComboBox();
						comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_15.setBounds(690, 147, 70, 30);
						add(comboBox_15);
						
						JComboBox comboBox_16 = new JComboBox();
						comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_16.setBounds(690, 232, 70, 31);
						add(comboBox_16);
						
						JComboBox comboBox_17 = new JComboBox();
						comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_17.setBounds(690, 323, 70, 31);
						add(comboBox_17);
						
						JComboBox comboBox_18 = new JComboBox();
						comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_18.setBounds(690, 418, 70, 31);
						add(comboBox_18);
						
						JComboBox comboBox_19 = new JComboBox();
						comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"00mins", "30mins"}));
						comboBox_19.setBounds(690, 512, 70, 31);
						add(comboBox_19);
						
						JLabel lblMonth = new JLabel("Month");
						lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
						lblMonth.setFont(new Font("Candara", Font.BOLD, 15));
						lblMonth.setBounds(874, 111, 46, 14);
						add(lblMonth);
						
						JLabel lblDate1 = new JLabel("Date");
						lblDate1.setHorizontalAlignment(SwingConstants.CENTER);
						lblDate1.setFont(new Font("Candara", Font.BOLD, 15));
						lblDate1.setBounds(796, 111, 46, 14);
						add(lblDate1);
						
						JComboBox comboBox_20 = new JComboBox();
						comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
						comboBox_20.setBounds(796, 147, 45, 30);
						add(comboBox_20);
						
						JComboBox comboBox_21 = new JComboBox();
						comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
						comboBox_21.setBounds(796, 232, 45, 31);
						add(comboBox_21);
						
						JComboBox comboBox_22 = new JComboBox();
						comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
						comboBox_22.setBounds(796, 323, 45, 31);
						add(comboBox_22);
						
						JComboBox comboBox_23 = new JComboBox();
						comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
						comboBox_23.setBounds(796, 418, 45, 31);
						add(comboBox_23);
						
						JComboBox comboBox_24 = new JComboBox();
						comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
						comboBox_24.setBounds(796, 512, 45, 31);
						add(comboBox_24);
						
						JComboBox comboBox_25 = new JComboBox();
						comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						comboBox_25.setBounds(875, 147, 45, 31);
						add(comboBox_25);
						
						JComboBox comboBox_26 = new JComboBox();
						comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						comboBox_26.setBounds(875, 232, 45, 31);
						add(comboBox_26);
						
						JComboBox comboBox_27 = new JComboBox();
						comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						comboBox_27.setBounds(875, 323, 45, 31);
						add(comboBox_27);
						
						JComboBox comboBox_28 = new JComboBox();
						comboBox_28.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						comboBox_28.setBounds(875, 418, 45, 31);
						add(comboBox_28);
						
						JComboBox comboBox_29 = new JComboBox();
						comboBox_29.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						comboBox_29.setBounds(875, 512, 45, 31);
						add(comboBox_29);
						
						JComboBox comboBox = new JComboBox();
						comboBox.setModel(new DefaultComboBoxModel(new String[] {"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm"}));
						comboBox.setBounds(442, 147, 60, 30);
						add(comboBox);
						
						JComboBox comboBox_3 = new JComboBox();
						comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm"}));
						comboBox_3.setBounds(442, 323, 60, 30);
						add(comboBox_3);
						
						RestaurantTable = new JTable();
						RestaurantTable.setEnabled(false);
						RestaurantTable.setRowSelectionAllowed(false);
						RestaurantTable.setRowHeight(98);
						RestaurantTable.setModel(new DefaultTableModel(
							new Object[][] {
								{"Aston's", null, null, null, null},
								{"Oceania", null, null, null, null},
								{"Indie's Rock", null, null, null, null},
								{"Veggie Fresh", null, null, null, null},
								{"Hotel ", null, null, null, null},
							},
							new String[] {
								"Restaurant", "Select", "Start", "End", "Date"
							}
						));
						RestaurantTable.setFont(new Font("Candara", Font.BOLD, 20));
						RestaurantTable.setBounds(90, 95, 860, 482);
						add(RestaurantTable);
						
						JLabel lblRestaurant_1 = new JLabel("Restaurant");
						lblRestaurant_1.setForeground(Color.RED);
						lblRestaurant_1.setFont(new Font("Candara", Font.BOLD, 20));
						lblRestaurant_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblRestaurant_1.setBounds(90, 51, 170, 25);
						add(lblRestaurant_1);
						
						JLabel lblSelect = new JLabel("Select");
						lblSelect.setForeground(Color.RED);
						lblSelect.setFont(new Font("Candara", Font.BOLD, 20));
						lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
						lblSelect.setBounds(260, 51, 170, 25);
						add(lblSelect);
						
						JLabel lblStart = new JLabel("Start");
						lblStart.setForeground(Color.RED);
						lblStart.setHorizontalAlignment(SwingConstants.CENTER);
						lblStart.setFont(new Font("Candara", Font.BOLD, 20));
						lblStart.setBounds(434, 47, 170, 16);
						add(lblStart);
						
						JLabel lblEnd = new JLabel("End");
						lblEnd.setForeground(Color.RED);
						lblEnd.setFont(new Font("Candara", Font.BOLD, 20));
						lblEnd.setHorizontalAlignment(SwingConstants.CENTER);
						lblEnd.setBounds(605, 47, 170, 16);
						add(lblEnd);
						
						JLabel lblDate = new JLabel("Date");
						lblDate.setForeground(Color.RED);
						lblDate.setHorizontalAlignment(SwingConstants.CENTER);
						lblDate.setFont(new Font("Candara", Font.BOLD, 20));
						lblDate.setBounds(777, 51, 170, 25);
						add(lblDate);
						
						JLabel lblNewLabel = new JLabel("Max 2hrs Usage");
						lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
						lblNewLabel.setForeground(Color.RED);
						lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel.setBounds(434, 68, 342, 25);
						add(lblNewLabel);
						
						JTextArea txtrPleaseSelectAccordingly = new JTextArea();
						txtrPleaseSelectAccordingly.setWrapStyleWord(true);
						txtrPleaseSelectAccordingly.setTabSize(10);
						txtrPleaseSelectAccordingly.setOpaque(false);
						txtrPleaseSelectAccordingly.setRows(10);
						txtrPleaseSelectAccordingly.setLineWrap(true);
						txtrPleaseSelectAccordingly.setForeground(Color.RED);
						txtrPleaseSelectAccordingly.setFont(new Font("Candara", Font.BOLD, 20));
						txtrPleaseSelectAccordingly.setEditable(false);
						txtrPleaseSelectAccordingly.setText("Please select accordingly.");
						txtrPleaseSelectAccordingly.setBounds(90, 595, 230, 25);
						add(txtrPleaseSelectAccordingly);
				
				// set layout

					super.setLayout();

	}
	public Restaurant(MainFrame frame) {
		this();
		f = frame;
	}
}
