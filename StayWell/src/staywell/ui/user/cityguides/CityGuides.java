package staywell.ui.user.cityguides;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;

import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.VirtualEarthTileFactoryInfo;
import org.jdesktop.swingx.input.CenterMapListener;
import org.jdesktop.swingx.input.PanKeyListener;
import org.jdesktop.swingx.input.PanMouseInputListener;
import org.jdesktop.swingx.input.ZoomMouseWheelListenerCenter;
import org.jdesktop.swingx.mapviewer.DefaultTileFactory;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.LocalResponseCache;
import org.jdesktop.swingx.mapviewer.TileFactoryInfo;
import org.jdesktop.swingx.mapviewer.WaypointPainter;

import staywell.ui.user.Homepage;


/**
 * A simple sample application that shows
 * a OSM map of Europe
 * @author Martin Steiger
 */
public class CityGuides extends JFrame
{

	private static JPanel contentPane;
	private static TileFactoryInfo info;
	private static DefaultTileFactory tileFactory;
	private static File cacheDir;
	private static final JXMapViewer mapViewer = new JXMapViewer();
	private final static GeoPosition stayWell = new GeoPosition(1,  18, 0, 103, 49, 0);
	private final static GeoPosition jurongBirdPark = new GeoPosition(1,  19, 0, 103, 42, 0);
	private final static GeoPosition nightSafari= new GeoPosition(1,  24, 0, 103, 47, 0);
	private final static GeoPosition singaporeZoologicalGarden = new GeoPosition(1,  24, 15, 103, 47, 27);
	private final static GeoPosition theSingaporeCrocodilarium = new GeoPosition(1,  17, 44, 103, 53, 26);
	private final static GeoPosition hawParVilla = new GeoPosition(50,  6, 0, 8, 46, 0);
	private final static GeoPosition marinaBaySands = new GeoPosition(50,  6, 0, 8, 46, 0);
	/**
	 * @param args the program args (ignored)
	 */
	
	public CityGuides(){
		info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
		tileFactory = new DefaultTileFactory(info);
		tileFactory.setThreadPoolSize(8);

		// Setup local file cache
		cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
		LocalResponseCache.installResponseCache(info.getBaseURL(), cacheDir, false);

		// Setup JXMapViewer
		
		mapViewer.setTileFactory(tileFactory);
		
		
		
		// Set the focus
		mapViewer.setZoom(8);
		mapViewer.setAddressLocation(stayWell);
	
		// Add interactions
		MouseInputListener mia = new PanMouseInputListener(mapViewer);
		mapViewer.addMouseListener(mia);
		mapViewer.addMouseMotionListener(mia);
		mapViewer.addMouseListener(new CenterMapListener(mapViewer));
		mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
		mapViewer.addKeyListener(new PanKeyListener(mapViewer));

		// Create waypoints from the geo-positions
		Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList(
				new MyWaypoint("H", Color.ORANGE, stayWell),
				new MyWaypoint("Z", Color.CYAN, jurongBirdPark),
				new MyWaypoint("Z", Color.CYAN, nightSafari),
				new MyWaypoint("Z", Color.CYAN, singaporeZoologicalGarden),
				new MyWaypoint("Z", Color.CYAN, theSingaporeCrocodilarium),
				new MyWaypoint("R", Color.BLUE, marinaBaySands),
				new MyWaypoint("T", Color.GREEN, hawParVilla)));

		// Create a waypoint painter that takes all the waypoints
		WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
		waypointPainter.setWaypoints(waypoints);
		waypointPainter.setRenderer(new FancyWaypointRenderer());
		
		mapViewer.setOverlayPainter(waypointPainter);
		
		setUndecorated(true);
		setResizable(false);
		setSize(new Dimension(1024, 768));
		setPreferredSize(new Dimension(1024, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1024,768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(10, 110));

		contentPane.add(southPanel, BorderLayout.SOUTH);
		final JPanel northPanel = new JPanel();
		
		final JLabel guideImage = new JLabel();
		
		guideImage.setPreferredSize(new Dimension(70,70));
		northPanel.add(guideImage);
		
		
		final JLabel infoPage = new JLabel();
		infoPage.setPreferredSize(new Dimension(700, 100));
		northPanel.add(infoPage);
		contentPane.add(northPanel, BorderLayout.NORTH);
		contentPane.add(mapViewer, BorderLayout.CENTER);
		
		
		JButton btnStayWell = new JButton("StayWell");
		btnStayWell.setBounds(142, 5, 203, 23);
		btnStayWell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(4);
				mapViewer.setAddressLocation(stayWell);
				infoPage.setText("<html><h4>This is where you are now!</h4><p>StayWell Hotel</p></html>");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/staywell/image/logo.png")));
			}
		});
		JButton btnJurongBirdPark = new JButton("Jurong Bird Park");
		btnJurongBirdPark.setBounds(142, 76, 203, 23);
		btnJurongBirdPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(6);
				mapViewer.setAddressLocation(jurongBirdPark);
				infoPage.setText("test only");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/staywell/image/cityguides/JurongBirdPark.jpg")));
			}
		});
		southPanel.setLayout(null);
		southPanel.add(btnStayWell);
		southPanel.add(btnJurongBirdPark);
		
		JButton btnNightSafari = new JButton("Night Safari");
		btnNightSafari.setBounds(142, 39, 203, 23);
		btnNightSafari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(4);
				mapViewer.setAddressLocation(nightSafari);
				infoPage.setText("<html><h4>This is where you are now!</h4><p>Safari</p></html>");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/staywell/image/cityguides/NightSafari.jpg")));
			}
		});
		southPanel.add(btnNightSafari);
		
		JButton btnSingaporeZoologicalGardens= new JButton("Singapore Zoological Gardens");
		btnSingaporeZoologicalGardens.setBounds(373, 5, 203, 23);
		btnSingaporeZoologicalGardens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapViewer.setZoom(4);
				mapViewer.setAddressLocation(singaporeZoologicalGarden);
				infoPage.setText("<html><h4>This is where you are now!</h4><p>Safari</p></html>");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/Staywell/image/cityguides/zoo.png")));
			}
		});
		southPanel.add(btnSingaporeZoologicalGardens);
		
		JButton btnTheSingaporeCrocodilarium = new JButton("The Singapore Crocodilarium");
		btnTheSingaporeCrocodilarium.setBounds(373, 76, 203, 23);
		btnTheSingaporeCrocodilarium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(4);
				mapViewer.setAddressLocation(theSingaporeCrocodilarium);
				infoPage.setText("<html><h4>This is where you are now!</h4><p>Safari</p></html>");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/staywell/image/cityguides/SINGAPORE CROCODILARIUM.jpg")));
			}
		});
		
		southPanel.add(btnTheSingaporeCrocodilarium);
		
		JButton btnHawParVilla = new JButton("Haw Par Villa");
		btnHawParVilla.setBounds(601, 5, 203, 23);
		btnHawParVilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(4);
				mapViewer.setAddressLocation(hawParVilla);
				infoPage.setText("<html><h4>This is where you are now!</h4><p>Safari</p></html>");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/staywell/image/cityguides/SINGAPORE CROCODILARIUM.jpg")));
			}
		});
		
		southPanel.add(btnHawParVilla);
		
		JButton btnMarinaBaySands = new JButton("Marina Bay Sands");
		btnMarinaBaySands.setBounds(373, 39, 203, 23);
		btnMarinaBaySands.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(4);
				mapViewer.setAddressLocation(marinaBaySands);
				infoPage.setText("<html><h4>This is where you are now!</h4><p>Safari</p></html>");
				guideImage.setIcon(new ImageIcon(CityGuides.class.getResource("/staywell/image/cityguides/SINGAPORE CROCODILARIUM.jpg")));
			}
		});
		
		southPanel.add(btnMarinaBaySands);
		
		
		
		
		
		
		JButton logo = new JButton();
		logo.setBounds(0, 5, 110, 110);
		logo.setIcon(new ImageIcon(Homepage.class.getResource("/Staywell/image/Logo.png")));
		logo.setBorder(null);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		
		southPanel.add(logo);
		
		
		
		
	}
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					CityGuides frame = new CityGuides();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
