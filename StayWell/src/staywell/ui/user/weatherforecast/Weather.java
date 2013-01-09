package staywell.ui.user.weatherforecast;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Weather extends javax.swing.JPanel
{
    /** Creates new form Main4 */
    public Weather()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        backgroundPanel1 = new BackgroundPanel();
        clockPanelDayNightWeather1 = new ClockPanelDayNightWeather();
        clockPanelDayNightWeather2 = new ClockPanelDayNightWeather();
        clockPanelDayNightWeather3 = new ClockPanelDayNightWeather();
        clockPanelDayNightWeather4 = new ClockPanelDayNightWeather();

        setSize(new java.awt.Dimension(548, 390));

        backgroundPanel1.setName("backgroundPanel1"); // NOI18N

        clockPanelDayNightWeather1.setCity(City.Singapore);
        clockPanelDayNightWeather1.setName("clockPanelDayNightWeather1");

        clockPanelDayNightWeather2.setCity(City.Berlin);
        clockPanelDayNightWeather2.setName("clockPanelDayNightWeather2");

        clockPanelDayNightWeather3.setCity(City.NewYork);
        clockPanelDayNightWeather3.setName("clockPanelDayNightWeather3");

        clockPanelDayNightWeather4.setCity(City.SanFrancisco);
        clockPanelDayNightWeather4.setName("clockPanelDayNightWeather4");

        GroupLayout backgroundPanel1Layout = new GroupLayout(backgroundPanel1);
        backgroundPanel1Layout.setHorizontalGroup(
        	backgroundPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(backgroundPanel1Layout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(backgroundPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(clockPanelDayNightWeather4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(clockPanelDayNightWeather3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(clockPanelDayNightWeather1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(clockPanelDayNightWeather2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        backgroundPanel1Layout.setVerticalGroup(
        	backgroundPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(backgroundPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(clockPanelDayNightWeather1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(clockPanelDayNightWeather2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(clockPanelDayNightWeather3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(clockPanelDayNightWeather4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(29, Short.MAX_VALUE))
        );
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

       

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                Weather app = new Weather();
                app.setVisible(true);
            }
        });
    }
    private BackgroundPanel backgroundPanel1;
    private ClockPanelDayNightWeather clockPanelDayNightWeather1;
    private ClockPanelDayNightWeather clockPanelDayNightWeather2;
    private ClockPanelDayNightWeather clockPanelDayNightWeather3;
    private ClockPanelDayNightWeather clockPanelDayNightWeather4;
}
