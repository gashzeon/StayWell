package staywell.ui.user;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.graphics.Rectangle;

import Homepage.FacilitiesReservation;
import Homepage.PointRedemption;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private static PointRedemption pointRedemption;
	private static Homepage homepage;
	private static Taxi taxi;
	private static RoomService roomService;
	private static LaundryServices laundrySerivces;
	private static CleaningServices cleaningServices;
	private static Breakfast breakfast;
	private static Meals meals;
	private static FacilitiesReservation facilitiesReservation;
	private static Bluetooth bluetooth;
	private static Login login;
	private static Feedback feedBack;
	/**
	 * Launch the application.
	 */
	public RoomService getRoomService(){
		return roomService;
	}
	public Taxi getTaxi(){
		return taxi;
	}
	public Homepage getHomePage(){
		return homepage;
	}
	
	public PointRedemption getPointRedemption(){
		return pointRedemption;
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
	public FacilitiesReservation getFacilitiesReservation(){
		return facilitiesReservation;
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
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					
					taxi = new Taxi(frame);
					pointRedemption = new PointRedemption(frame);
					roomService = new RoomService(frame);
					homepage = new Homepage(frame);
					laundrySerivces = new LaundryServices(frame);
					cleaningServices = new CleaningServices(frame);
					breakfast = new Breakfast(frame);
					meals = new Meals(frame);
					facilitiesReservation = new FacilitiesReservation(frame);
					bluetooth = new Bluetooth(frame);
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
