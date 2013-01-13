package staywell.ui.user;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
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
	private JTable FacilitiesTable;

	/**
	 * Create the panel.
	 */
	private MainFrame f;

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

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(433, 124, 20, 20);
		add(chckbxNewCheckBox);

		JCheckBox checkBox = new JCheckBox("");
		checkBox.setOpaque(false);
		checkBox.setBounds(433, 178, 20, 20);
		add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setOpaque(false);
		checkBox_1.setBounds(433, 231, 20, 29);
		add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setOpaque(false);
		checkBox_2.setBounds(433, 291, 20, 20);
		add(checkBox_2);

		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setOpaque(false);
		checkBox_3.setBounds(433, 345, 20, 20);
		add(checkBox_3);

		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setOpaque(false);
		checkBox_4.setBounds(433, 400, 20, 20);
		add(checkBox_4);

		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setOpaque(false);
		checkBox_5.setBounds(433, 458, 20, 20);
		add(checkBox_5);

		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setOpaque(false);
		checkBox_6.setBounds(433, 511, 20, 20);
		add(checkBox_6);

		FacilitiesTable = new JTable();
		FacilitiesTable.setEnabled(false);
		FacilitiesTable.setRowSelectionAllowed(false);
		FacilitiesTable.setBackground(Color.WHITE);
		FacilitiesTable.setRowHeight(56);
		FacilitiesTable.setModel(new DefaultTableModel(new Object[][] {
				{ "Fitness Room", null, null, null, null },
				{ "Tennis Court", null, null, null, null },
				{ "Spa Room", null, null, null, null },
				{ "Sauna Room", null, null, null, null },
				{ "Yoga Room", null, null, null, null },
				{ "Jacuzzi Room", null, null, null, null },
				{ "Lounges", null, null, null, null },
				{ "Billiard/Pool Room", null, null, null, null }, },
				new String[] { "-Item-", "Select", "Start", "End", "Date" }) {
			boolean[] columnEditables = new boolean[] { false, true, true,
					true, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		FacilitiesTable.getColumnModel().getColumn(0).setPreferredWidth(190);
		FacilitiesTable.getColumnModel().getColumn(2).setPreferredWidth(85);
		FacilitiesTable.getColumnModel().getColumn(3).setPreferredWidth(96);
		FacilitiesTable.getColumnModel().getColumn(4).setPreferredWidth(179);

		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(720, 105, 36, 14);
		add(lblNewLabel_1);

		JLabel lblMonth = new JLabel("Month");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblMonth.setBounds(798, 105, 46, 14);
		add(lblMonth);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_8.setBounds(718, 125, 40, 25);
		add(comboBox_8);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_9.setBounds(718, 177, 40, 25);
		add(comboBox_9);

		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_10.setBounds(717, 233, 40, 25);
		add(comboBox_10);

		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_11.setBounds(717, 288, 40, 25);
		add(comboBox_11);

		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_12.setBounds(717, 343, 40, 25);
		add(comboBox_12);

		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_13.setBounds(717, 398, 40, 25);
		add(comboBox_13);

		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_14.setBounds(717, 453, 40, 25);
		add(comboBox_14);

		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_15.setBounds(717, 508, 40, 25);
		add(comboBox_15);

		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_16.setBounds(798, 125, 50, 25);
		add(comboBox_16);

		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_17.setBounds(798, 177, 50, 25);
		add(comboBox_17);

		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_18.setBounds(798, 233, 50, 25);
		add(comboBox_18);

		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_19.setBounds(798, 288, 50, 25);
		add(comboBox_19);

		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_20.setBounds(798, 343, 50, 25);
		add(comboBox_20);

		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_21.setBounds(798, 398, 50, 25);
		add(comboBox_21);

		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_22.setBounds(798, 453, 50, 25);
		add(comboBox_22);

		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_23.setBounds(798, 508, 50, 25);
		add(comboBox_23);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_2.setBounds(503, 233, 60, 25);
		add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_3.setBounds(503, 288, 60, 25);
		add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_4.setBounds(503, 343, 60, 25);
		add(comboBox_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_5.setBounds(503, 398, 60, 25);
		add(comboBox_5);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_6.setBounds(503, 453, 60, 25);
		add(comboBox_6);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_7.setBounds(503, 508, 60, 25);
		add(comboBox_7);

		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_24.setBounds(603, 122, 60, 25);
		add(comboBox_24);

		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_25.setBounds(603, 177, 60, 25);
		add(comboBox_25);

		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_26.setBounds(603, 233, 60, 25);
		add(comboBox_26);

		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_27.setBounds(603, 288, 60, 25);
		add(comboBox_27);

		JComboBox comboBox_28 = new JComboBox();
		comboBox_28.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_28.setBounds(603, 343, 60, 25);
		add(comboBox_28);

		JComboBox comboBox_29 = new JComboBox();
		comboBox_29.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_29.setBounds(603, 398, 60, 25);
		add(comboBox_29);

		JComboBox comboBox_30 = new JComboBox();
		comboBox_30.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_30.setBounds(603, 453, 60, 25);
		add(comboBox_30);

		JComboBox comboBox_31 = new JComboBox();
		comboBox_31.setModel(new DefaultComboBoxModel(new String[] { "10am",
				"11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm",
				"7pm", "8pm", "9pm", "10pm" }));
		comboBox_31.setBounds(603, 508, 60, 25);
		add(comboBox_31);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox.setBounds(503, 122, 60, 25);
		add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "9am",
				"10am", "11am", "12pm", "1pm", "2pm", "3pm", "4pm", "5pm",
				"6pm", "7pm", "8pm", "9pm" }));
		comboBox_1.setBounds(503, 177, 60, 25);
		add(comboBox_1);
		FacilitiesTable.setFont(new Font("Candara", Font.BOLD, 17));
		FacilitiesTable.setBounds(200, 105, 675, 440);
		add(FacilitiesTable);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(HotelFacilities.class
				.getResource("/staywell/image/cashing70X70.png")));
		button.setBounds(516, 581, 70, 70);
		add(button);

		JLabel lblComfirm = new JLabel("Confirm");
		lblComfirm.setForeground(Color.RED);
		lblComfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblComfirm.setFont(new Font("Candara", Font.BOLD, 20));
		lblComfirm.setBounds(508, 654, 85, 25);
		add(lblComfirm);

		JLabel lblFacilities_1 = new JLabel("Facilities");
		lblFacilities_1.setForeground(Color.RED);
		lblFacilities_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacilities_1.setFont(new Font("Candara", Font.BOLD, 20));
		lblFacilities_1.setBounds(202, 75, 198, 25);
		add(lblFacilities_1);

		JLabel lblSelect = new JLabel("Select");
		lblSelect.setForeground(Color.RED);
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect.setFont(new Font("Candara", Font.BOLD, 20));
		lblSelect.setBounds(399, 75, 85, 25);
		add(lblSelect);

		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(684, 70, 190, 25);
		add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Start            End\r\n");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 20));
		lblNewLabel_2.setBounds(481, 48, 205, 25);
		add(lblNewLabel_2);

		JLabel lblMaxhrsUsage = new JLabel("Max 2hrs Usage");
		lblMaxhrsUsage.setForeground(Color.RED);
		lblMaxhrsUsage.setFont(new Font("Candara", Font.BOLD, 20));
		lblMaxhrsUsage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxhrsUsage.setBounds(485, 75, 200, 20);
		add(lblMaxhrsUsage);

		JTextArea txtrPleaseSelectAccordingly = new JTextArea();
		txtrPleaseSelectAccordingly.setForeground(Color.RED);
		txtrPleaseSelectAccordingly.setOpaque(false);
		txtrPleaseSelectAccordingly.setWrapStyleWord(true);
		txtrPleaseSelectAccordingly.setRows(10);
		txtrPleaseSelectAccordingly.setLineWrap(true);
		txtrPleaseSelectAccordingly.setFont(new Font("Candara", Font.BOLD, 20));
		txtrPleaseSelectAccordingly.setEditable(false);
		txtrPleaseSelectAccordingly.setText("Please select accordingly.");
		txtrPleaseSelectAccordingly.setBounds(198, 556, 225, 38);
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

		// set layout

		super.setLayout();

	}
}
