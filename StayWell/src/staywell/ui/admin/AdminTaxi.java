package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableCell;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import staywell.ui.Layout;

import java.awt.Color;
import java.util.ArrayList;

public class AdminTaxi extends Layout {

	private JPanel contentPane;
	private JTable table;
	private Frame2 f = null;
	private String data2;
	private ArrayList<String> BTO = new ArrayList<>();

	/**
	 * 
	 * 
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */

	public AdminTaxi() {
		setBounds(new Rectangle(0, 0, 1024, 768));
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setFont(new Font("Candara", Font.PLAIN, 11));
		scrollPane.setEnabled(true);
		scrollPane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setFocusable(false);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(32, 144, 950, 375);
		scrollPane.getViewport().setOpaque(false);

		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage adminHomePage = f.getAdminHomePage();
				f.getContentPane().removeAll();
				f.getContentPane().add(adminHomePage);
				f.repaint();
				f.revalidate();
				f.setVisible(true);
			}
		});
		button.setFont(new Font("Candara", Font.BOLD, 20));
		button.setBorder(null);
		button.setBounds(10, 11, 111, 25);
		add(button);
		add(scrollPane);

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Candara", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Date / Time", "Membership No", "Name of Customer", "Taxi No"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(0).setMinWidth(120);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		table.getColumnModel().getColumn(1).setMinWidth(50);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setMinWidth(150);

		table.setRowHeight(50);
		table.getTableHeader().setReorderingAllowed(false);
		table.setOpaque(false);
		scrollPane.setViewportView(table);

		JLabel lblLaundryServices = new JLabel("Taxi");
		lblLaundryServices.setFont(new Font("Candara", Font.BOLD, 30));
		lblLaundryServices.setBounds(480, 42, 53, 36);
		add(lblLaundryServices);

		final JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(
						JOptionPane.getFrameForComponent(btnSend),
						"Taxi Number Send !");

				for (int i = 0; i < table.getRowCount(); i++) {

					int selectedRowIndex = i;
					int selectedColumnIndex = 3;
					Object selectedObject = (Object) table.getModel()
							.getValueAt(selectedRowIndex, selectedColumnIndex);

					if (selectedObject == null) {
						selectedObject = "";
						
						
					}

					String data = selectedObject.toString();
					data2 = data;
					BTO.add(data2);
					System.out.println(data2);

				}

				


			}

		});

		btnSend.setFont(new Font("Candara", Font.BOLD, 20));
		btnSend.setBorder(null);
		btnSend.setBounds(871, 108, 111, 25);
		add(btnSend);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.repaint();

			}
		});
		btnRefresh.setFont(new Font("Candara", Font.BOLD, 20));
		btnRefresh.setBorder(null);
		btnRefresh.setBounds(750, 108, 111, 25);
		add(btnRefresh);

		super.setLayout();

	}

	public AdminTaxi(Frame2 frame) {
		this();
		f = frame;
	}
}
