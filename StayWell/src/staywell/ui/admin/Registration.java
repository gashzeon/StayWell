package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.util.Locale;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import java.awt.ComponentOrientation;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Registration extends Layout2 {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private Frame2 f=null;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Registration() {
		setBounds(new Rectangle(0,0,1024,768));
		setLayout(null);
		
	JButton btnHome = new JButton("Home");
	btnHome.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AdminHomePage adminHomePage = f.getAdminHomePage();
			f.getContentPane().removeAll();
			f.getContentPane().add(adminHomePage);
			f.repaint();
			f.revalidate();
			f.setVisible(true);
		}
	});
	btnHome.setFont(new Font("Candara", Font.BOLD, 20));
	btnHome.setBorder(null);
	btnHome.setBounds(10, 11, 111, 25);
	add(btnHome);
	
	JPanel InnerPanel = new JPanel();
	InnerPanel.setOpaque(false);
	InnerPanel.setBounds(157, 101, 700, 555);
	add(InnerPanel);
	InnerPanel.setLayout(null);
	JPanel InnerTopPanel = new JPanel();
	InnerTopPanel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
	InnerTopPanel.setOpaque(false);
	InnerTopPanel.setBounds(0, 99, 700, 405);
	InnerPanel.add(InnerTopPanel);
	InnerTopPanel.setLayout(null);
	JLabel lblNewLabel = new JLabel("UserName :");
	lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblNewLabel.setBounds(37, 19, 117, 14);
	lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
	lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
	InnerTopPanel.add(lblNewLabel);
	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblPassword.setHorizontalTextPosition(SwingConstants.CENTER);
	lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
	lblPassword.setBounds(37, 52, 117, 14);
	InnerTopPanel.add(lblPassword);
	JLabel lblEmail = new JLabel("Email :");
	lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblEmail.setHorizontalTextPosition(SwingConstants.CENTER);
	lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
	lblEmail.setBounds(37, 85, 117, 14);
	InnerTopPanel.add(lblEmail);
	textField = new JTextField();
	textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	textField.setBounds(191, 17, 177, 20);
	InnerTopPanel.add(textField);
	textField.setColumns(10);
	textField_2 = new JTextField();
	textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	textField_2.setColumns(10);
	textField_2.setBounds(191, 83, 177, 20);
	InnerTopPanel.add(textField_2);
	passwordField = new JPasswordField();
	passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	passwordField.setBounds(191, 50, 177, 20);
	InnerTopPanel.add(passwordField);
	JLabel label = new JLabel("Nationality :");
	label.setHorizontalTextPosition(SwingConstants.CENTER);
	label.setHorizontalAlignment(SwingConstants.TRAILING);
	label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	label.setBounds(37, 110, 117, 20);
	InnerTopPanel.add(label);
	JComboBox comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Afghanistan", "Akrotiri", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Ashmore and Cartier Islands", "Australia", "Austria", "Azerbaijan", "Bahamas, The", "Bahrain", "Bangladesh", "Barbados", "Bassas da India", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Clipperton Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Cook Islands", "Coral Sea Islands", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Dhekelia", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Europa Island", "Falkland Islands (Islas Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern and Antarctic Lands", "Gabon", "Gambia, The", "Gaza Strip", "Georgia", "Germany", "Ghana", "Gibraltar", "Glorioso Islands", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Holy See (Vatican City)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Jan Mayen", "Japan", "Jersey", "Jordan", "Juan de Nova Island", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Namibia", "Nauru", "Navassa Island", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paracel Islands", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russia", "Rwanda", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia and Montenegro", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Spratly Islands", "Sri Lanka", "Sudan", "Suriname", "Svalbard", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tromelin Island", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands", "Wake Island", "Wallis and Futuna", "West Bank", "Western Sahara", "Yemen", "Zambia", "Zimbabwe"}));
	comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	comboBox.setBounds(191, 111, 302, 22);
	InnerTopPanel.add(comboBox);
	JLabel label_1 = new JLabel("Occupation :");
	label_1.setHorizontalTextPosition(SwingConstants.CENTER);
	label_1.setHorizontalAlignment(SwingConstants.TRAILING);
	label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	label_1.setBounds(37, 296, 117, 20);
	InnerTopPanel.add(label_1);
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Architecture", "Artist", "Banking/Financial", "Craftsman/Construction ", "Engineer", "Executive Management ", "Homemaker", "Professional Trade", "Real Estate", "Retired", "Sales/Marketing", "Travel/Hospitality", "Student", "Self-Employed", "Unemployed", "Others"}));
	comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	comboBox_1.setBounds(191, 297, 226, 22);
	InnerTopPanel.add(comboBox_1);
	textField_1 = new JTextField();
	textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	textField_1.setColumns(10);
	textField_1.setBounds(191, 269, 449, 20);
	InnerTopPanel.add(textField_1);
	JComboBox comboBox_2 = new JComboBox();
	comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920"}));
	comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	comboBox_2.setBounds(357, 238, 76, 22);
	InnerTopPanel.add(comboBox_2);
	JComboBox comboBox_3 = new JComboBox();
	comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"January\t", "February", "March", "April", "May\t", "June", "July", "August\t", "September\t", "October\t", "November", "December"}));
	comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	comboBox_3.setBounds(258, 238, 89, 22);
	InnerTopPanel.add(comboBox_3);
	JComboBox comboBox_4 = new JComboBox();
	comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
	comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	comboBox_4.setBounds(191, 238, 57, 22);
	InnerTopPanel.add(comboBox_4);
	JLabel lblDateOfBirth = new JLabel("DateOfBirth :");
	lblDateOfBirth.setHorizontalTextPosition(SwingConstants.CENTER);
	lblDateOfBirth.setHorizontalAlignment(SwingConstants.TRAILING);
	lblDateOfBirth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblDateOfBirth.setBounds(37, 237, 117, 20);
	InnerTopPanel.add(lblDateOfBirth);
	JLabel label_3 = new JLabel("Address :");
	label_3.setHorizontalTextPosition(SwingConstants.CENTER);
	label_3.setHorizontalAlignment(SwingConstants.TRAILING);
	label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	label_3.setBounds(37, 271, 117, 14);
	InnerTopPanel.add(label_3);
	JLabel label_4 = new JLabel("LastName :");
	label_4.setHorizontalTextPosition(SwingConstants.CENTER);
	label_4.setHorizontalAlignment(SwingConstants.TRAILING);
	label_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	label_4.setBounds(37, 209, 117, 14);
	InnerTopPanel.add(label_4);
	textField_3 = new JTextField();
	textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	textField_3.setColumns(10);
	textField_3.setBounds(191, 207, 177, 20);
	InnerTopPanel.add(textField_3);
	textField_4 = new JTextField();
	textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	textField_4.setColumns(10);
	textField_4.setBounds(191, 176, 177, 20);
	InnerTopPanel.add(textField_4);
	JLabel label_5 = new JLabel("FirstName :");
	label_5.setHorizontalTextPosition(SwingConstants.CENTER);
	label_5.setHorizontalAlignment(SwingConstants.TRAILING);
	label_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	label_5.setBounds(37, 178, 117, 14);
	InnerTopPanel.add(label_5);
	JLabel lblMembership = new JLabel("MemberShip :");
	lblMembership.setHorizontalTextPosition(SwingConstants.CENTER);
	lblMembership.setHorizontalAlignment(SwingConstants.TRAILING);
	lblMembership.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblMembership.setBounds(37, 326, 117, 21);
	InnerTopPanel.add(lblMembership);
	JRadioButton rdbtnSilver = new JRadioButton("Silver");
	rdbtnSilver.setFocusable(false);
	rdbtnSilver.setOpaque(false);
	rdbtnSilver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	buttonGroup_1.add(rdbtnSilver);
	rdbtnSilver.setBounds(269, 324, 76, 23);
	InnerTopPanel.add(rdbtnSilver);
	JRadioButton rdbtnBronze = new JRadioButton("Bronze");
	rdbtnBronze.setFocusable(false);
	rdbtnBronze.setOpaque(false);
	rdbtnBronze.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	buttonGroup_1.add(rdbtnBronze);
	rdbtnBronze.setBounds(191, 324, 117, 23);
	InnerTopPanel.add(rdbtnBronze);
	JRadioButton rdbtnPlatinum = new JRadioButton("Platinum");
	rdbtnPlatinum.setFocusable(false);
	rdbtnPlatinum.setOpaque(false);
	rdbtnPlatinum.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	buttonGroup_1.add(rdbtnPlatinum);
	rdbtnPlatinum.setBounds(410, 324, 102, 23);
	InnerTopPanel.add(rdbtnPlatinum);
	JRadioButton rdbtnGold = new JRadioButton("Gold");
	rdbtnGold.setFocusable(false);
	rdbtnGold.setOpaque(false);
	rdbtnGold.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	buttonGroup_1.add(rdbtnGold);
	rdbtnGold.setBounds(344, 324, 89, 23);
	InnerTopPanel.add(rdbtnGold);
	JRadioButton rdbtnCorporate = new JRadioButton("Corporate");
	rdbtnCorporate.setFocusable(false);
	rdbtnCorporate.setOpaque(false);
	rdbtnCorporate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	buttonGroup_1.add(rdbtnCorporate);
	rdbtnCorporate.setBounds(514, 325, 117, 23);
	InnerTopPanel.add(rdbtnCorporate);
	JLabel lblGender = new JLabel("Gender :");
	lblGender.setHorizontalTextPosition(SwingConstants.CENTER);
	lblGender.setHorizontalAlignment(SwingConstants.TRAILING);
	lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	lblGender.setBounds(37, 143, 117, 21);
	InnerTopPanel.add(lblGender);
	JRadioButton rdbtnMale = new JRadioButton("Male");
	rdbtnMale.setFocusable(false);
	rdbtnMale.setOpaque(false);
	buttonGroup.add(rdbtnMale);
	rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	rdbtnMale.setBounds(191, 141, 76, 23);
	InnerTopPanel.add(rdbtnMale);
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	rdbtnFemale.setFocusable(false);
	rdbtnFemale.setOpaque(false);
	buttonGroup.add(rdbtnFemale);
	rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	rdbtnFemale.setBounds(269, 141, 89, 23);
	InnerTopPanel.add(rdbtnFemale);
	JButton btnCreate = new JButton("Submit");
	
	
	btnCreate.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			AdminHomePage adminHomePage = f.getAdminHomePage();
			f.getContentPane().removeAll();
			f.getContentPane().add(adminHomePage);
			f.repaint();
			f.revalidate();
			f.setVisible(true);
			
		}
	});
	
	
	btnCreate.setBorder(null);
	btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	btnCreate.setBounds(299, 369, 102, 25);
	InnerTopPanel.add(btnCreate);
	
	JLabel lblRegistration = new JLabel("Registration");
	lblRegistration.setBounds(270, 11, 160, 36);
	InnerPanel.add(lblRegistration);
	lblRegistration.setFont(new Font("Candara", Font.BOLD, 30));
	DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
	dlcr.setHorizontalAlignment(DefaultListCellRenderer.LEFT);
			
	super.RealLayout();

	}
	public Registration(Frame2 frame)
	{
		this();
		f = frame;
	}
}
