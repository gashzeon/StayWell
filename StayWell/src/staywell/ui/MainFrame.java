package staywell.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import staywell.entities.SessionEntities;
import staywell.ui.user.*;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private static Homepage homepage;
	private static Taxi taxi;
	private static RoomService roomService;
	private static LaundryServices laundrySerivces;
	private static CleaningServices cleaningServices;
	private static Breakfast breakfast;
	private static Meals meals;
	private static Bluetooth bluetooth;
	private static Login login;
	private static Feedback feedBack;
	private static Ballroom ballroom;
	private static FacilitiesReservation reservation;
	private static HotelFacilities hotelFacilities;
	private static CheckOut checkOut;
	private static Restaurant restaurant;
	private static PointRedemption pointRedemption;
	private static FacilitiesReservation facilitiesReservation;
	public static SessionEntities session;
	/**
	 * Launch the application.
	 */
	public static void setSession(SessionEntities s){
		session = s;
	}
	public SessionEntities getSession(){
		return session;
	}
	public Ballroom getBallroom(){
		return ballroom;
	}
	public FacilitiesReservation getReservation(){
		return reservation;
	}
	public HotelFacilities getHotelFacilities(){
		return hotelFacilities;
	}
	public CheckOut getCheckOut(){
		return checkOut;
	}
	public Restaurant getRestaurant(){
		return restaurant;
	}
	public RoomService getRoomService(){
		return roomService;
	}
	public Taxi getTaxi(){
		return taxi;
	}
	public Homepage getHomePage(){
		return homepage;
	}
	public LaundryServices getLaundryServices(){
		return laundrySerivces;
	}
	public CleaningServices getCleaningServices(){
		return cleaningServices;
	}
	public Breakfast getBreakfast(){
		return breakfast;
	}
	public Meals getMeals(){
		return meals;
	}
	public Bluetooth getBluetooth(){
		return bluetooth;
	}
	public Login getLogin(){
		return login;
	}
	public Feedback getFeedBack(){
		return feedBack;
	}
	public PointRedemption getPointRedemption(){
		return pointRedemption;
	}
	public FacilitiesReservation getFacilitiesReservation(){
		return facilitiesReservation;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					
					login = new Login(frame);
					
					frame.getContentPane().add(login);
					login.setVisible(true);
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
	public MainFrame() {
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
