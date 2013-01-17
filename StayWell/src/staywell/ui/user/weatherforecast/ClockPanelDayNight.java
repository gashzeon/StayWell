package staywell.ui.user.weatherforecast;

import java.beans.PropertyChangeEvent;

public class ClockPanelDayNight extends javax.swing.JPanel implements java.beans.PropertyChangeListener
{
    private City city = City.Berlin;
    private String cityName = City.Berlin.getName();
   
    /** Creates new form ClockPanel */
    public ClockPanelDayNight()
    {        
        initComponents();
        cityLabel.setText(cityName);
        addPropertyChangeListener(this);
        setPreferredSize(new java.awt.Dimension(358, 74));
    }

    public City getCity()
    {
        return this.city;
    }

    public void setCity(City city)
    {
        this.city = city;
        this.cityName = city.getName();
        
        cityLabel.setText(this.cityName);       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityLabel = new TextLabel();
        dayLabel = new TextLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(358, 100));
        setSize(new java.awt.Dimension(305, 100));

        cityLabel.setText("City");
        cityLabel.setFont(new java.awt.Font("Arial", 0, 36));
        cityLabel.setName("cityLabel"); // NOI18N

        dayLabel.setText("today");
        dayLabel.setFont(new java.awt.Font("Arial", 0, 18));
        dayLabel.setName("dayLabel"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dayLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cityLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 266, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(cityLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dayLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TextLabel cityLabel;
    public TextLabel dayLabel;
    // End of variables declaration//GEN-END:variables

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

    
}
