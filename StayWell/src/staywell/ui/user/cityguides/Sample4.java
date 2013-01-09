package staywell.ui.user.cityguides;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

/**
 * A simple sample application that shows
 * a OSM map of Europe
 * @author Martin Steiger
 */
public class Sample4
{
	/**
	 * @param args the program args (ignored)
	 */
	public static void main(String[] args)
	{
		JPanel contentPane;
		// Create a TileFactoryInfo for Virtual Earth
		TileFactoryInfo info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		tileFactory.setThreadPoolSize(8);

		// Setup local file cache
		File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
		LocalResponseCache.installResponseCache(info.getBaseURL(), cacheDir, false);

		// Setup JXMapViewer
		final JXMapViewer mapViewer = new JXMapViewer();
		mapViewer.setTileFactory(tileFactory);
		GeoPosition stayWell = new GeoPosition(1,  22, 0, 103, 48, 0);
		final GeoPosition wiesbaden = new GeoPosition(50,  5, 0, 8, 14, 0);
		final GeoPosition mainz     = new GeoPosition(50,  0, 0, 8, 16, 0);
		GeoPosition darmstadt = new GeoPosition(49, 52, 0, 8, 39, 0);
		GeoPosition offenbach = new GeoPosition(50,  6, 0, 8, 46, 0);
		
		
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
				new MyWaypoint("F", Color.ORANGE, stayWell),
				new MyWaypoint("W", Color.CYAN, wiesbaden),
				new MyWaypoint("M", Color.GRAY, mainz),
				new MyWaypoint("D", Color.MAGENTA, darmstadt),
				new MyWaypoint("O", Color.GREEN, offenbach)));

		// Create a waypoint painter that takes all the waypoints
		WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
		waypointPainter.setWaypoints(waypoints);
		waypointPainter.setRenderer(new FancyWaypointRenderer());
		
		mapViewer.setOverlayPainter(waypointPainter);
		


		// Display the viewer in a JFrame
		JFrame frame = new JFrame("JXMapviewer2 Example 4");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
	
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(10, 30));

		contentPane.add(southPanel, BorderLayout.SOUTH);
		JPanel northPanel = new JPanel();
		final JLabel infoPage = new JLabel();
		infoPage.setPreferredSize(new Dimension(700, 70));
		northPanel.add(infoPage);
		contentPane.add(northPanel, BorderLayout.NORTH);
		contentPane.add(mapViewer, BorderLayout.CENTER);
		frame.setContentPane(contentPane);
		frame.getContentPane();
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JButton btnNewButton1 = new JButton("New button");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(8);
				mapViewer.setAddressLocation(mainz);
				infoPage.setText("<html>this is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a test<br>this is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a testthis is a test</html>");
			}
		});
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mapViewer.setZoom(8);
				mapViewer.setAddressLocation(wiesbaden);
				infoPage.setText("test only");
			}
		});
		southPanel.add(btnNewButton);
		southPanel.add(btnNewButton1);
	}

}
