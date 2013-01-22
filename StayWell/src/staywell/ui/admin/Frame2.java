
package staywell.ui.admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;


public class Frame2 extends JFrame {

	private JPanel contentPane;
	private static AdminBallRoom adminBallRoom;
	private static AdminCarCollection2 adminCarCollection2;
	private static AdminCheckIn adminCheckIn;
	private static AdminCheckOut adminCheckOut;
	
	private static AdminFeedBack adminFeedBack;
	private static AdminFoodNBeverage adminFoodNBeverage;
	private static AdminHomePage adminHomePage;
	private static AdminHotelFacilities adminHotelFacilities;
	private static AdminItemRedemption adminItemRedemption;
	private static AdminLaundry adminLaundry;
	private static AdminLogin adminLogin;
	private static AdminRestaurantsReservation adminRestaurantsReservation; 
	private static AdminTaxi adminTaxi;
	private static CheckRegister checkRegister;
	private static Registration registration;
	private static AdminRoomServices adminRoomServices;
	private static AdminFacilitiesReservation adminFacilitiesReservation;
	/**
	 * Launch the application.
	 */
	public AdminBallRoom getAdminBallRoom()
	{
		return adminBallRoom;
	}
	
	public AdminCarCollection2 getAdminCarCollection2()
	{
		return adminCarCollection2;
	}
	
	public AdminCheckIn getAdminCheckIn()
	{
		return adminCheckIn;
	}
	
	public AdminCheckOut getAdminCheckOut()
	{
		return adminCheckOut;
	}

	
	public AdminFeedBack getAdminFeedBack()
	{
		return adminFeedBack;
	}
	
	public AdminFoodNBeverage getAdminFoodNBeverage()
	{
		return adminFoodNBeverage;
	}
	
	public AdminHomePage getAdminHomePage()
	{
		return adminHomePage;
	}
	
	public AdminHotelFacilities getAdminHotelFacilities()
	{
		return adminHotelFacilities;
	}
	
	public AdminItemRedemption getAdminItemRedemption()
	{
		return adminItemRedemption;
	}
	
	public AdminLaundry getAdminLaundry()
	{
		return adminLaundry;
	}
	
	public AdminLogin getAdminLogin()
	{
		return adminLogin;
	}
	
	public AdminRestaurantsReservation getAdminRestaurantsReservation()
	{
		return adminRestaurantsReservation;
	}
	
	public AdminTaxi getAdminTaxi()
	{
		return adminTaxi;
	}
	
	public CheckRegister getCheckRegister()
	{
		return checkRegister;
	}
	
	public Registration getRegistration()
	{
		return registration;
	}
	
	public AdminRoomServices getAdminRoomServices()
	{
		return adminRoomServices;
	}
	
	public AdminFacilitiesReservation getAdminFacilitiesReservation()
	{
		return adminFacilitiesReservation;
	}
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					
					adminBallRoom = new AdminBallRoom(frame);
					adminCarCollection2 = new AdminCarCollection2(frame);
					adminCheckIn = new AdminCheckIn(frame);
					adminCheckOut = new AdminCheckOut(frame);
					
					adminFeedBack = new AdminFeedBack(frame);
					adminFoodNBeverage = new AdminFoodNBeverage(frame);
					adminHomePage = new AdminHomePage(frame);
					adminHotelFacilities = new AdminHotelFacilities(frame);
					adminItemRedemption = new AdminItemRedemption(frame);
					adminLaundry = new AdminLaundry(frame);
					adminLogin = new AdminLogin(frame);
					adminRestaurantsReservation = new AdminRestaurantsReservation(frame);
					adminTaxi = new AdminTaxi(frame);
					checkRegister = new CheckRegister(frame);
					registration = new Registration(frame);
					adminRoomServices = new AdminRoomServices(frame);
					adminFacilitiesReservation = new AdminFacilitiesReservation(frame);
					
					
					frame.getContentPane().add(adminLogin);
					
					adminLogin.setVisible(true);
					
					
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
		setUndecorated(true);
		setResizable(false);
		setSize(new Dimension(1366, 768));
		setPreferredSize(new Dimension(1366, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
	}

}
