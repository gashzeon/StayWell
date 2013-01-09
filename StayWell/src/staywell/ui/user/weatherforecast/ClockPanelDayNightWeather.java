package staywell.ui.user.weatherforecast;

public class ClockPanelDayNightWeather extends javax.swing.JPanel implements java.beans.PropertyChangeListener, WeatherServiceEventListener, java.awt.event.ActionListener
{
    // Common variables
    private City city;
    private String cityName;

    // Clock related variables
    private long offset; // TimeZone offset

    // Weather related variables
    private java.util.HashMap<String, WeatherCondition> conditionMap;
    private boolean celsius = true; // Indicates if celsius or fahrenheit is used
    private javax.swing.Timer weatherCheck;
    private final int REFRESH_PERIOD = 600000; // Refresh weather info every 10 min    

    /** Creates new form ClockPanelWeather */
    public ClockPanelDayNightWeather()
    {        
        initComponents();   
        
        this.conditionMap = createConditionMap();
        this.cityName = City.Muenster.getName();
        this.offset = City.Muenster.getOffset();
        this.cityLabel.setText(cityName);
             
        addPropertyChangeListener(this);
        WeatherService.INSTANCE.addWeatherServiceEventListener(this);
        setPreferredSize(new java.awt.Dimension(508, 74));
        setSize(getPreferredSize());
        // For the initial weather check set the refresh period to 7 sec
        weatherCheck = new javax.swing.Timer(7000, this);
        WeatherService.INSTANCE.detectAndSetProxy();
    }

    public City getCity()
    {
        return this.city;
    }

    public void setCity(City city)
    {
        this.city = city;
        this.cityName = city.getName();
        this.offset = city.getOffset();

        long localOffset = java.util.Calendar.getInstance().get(java.util.Calendar.ZONE_OFFSET);        
        long diff = localOffset + offset;
        int minDiff = (int) (diff % 3600000);
        int hourDiff = (int) (diff / 3600000);

        this.clock.setTimeZoneOffsetHour(hourDiff);
        this.clock.setTimeZoneOffsetMinute(minDiff);
        
        cityLabel.setText(this.cityName);
        if (weatherCheck.isRunning())
        {
            weatherCheck.stop();
        }
        // After the first access set the refresh period
        // to the defined value
        weatherCheck.start();
        weatherCheck.setDelay(REFRESH_PERIOD);
    }

    public TimeOfDay getTimeOfDay()
    {
        return weatherPanel.getTimeOfDay();
    }

    public void setTimeOfDay(TimeOfDay timeOfDay)
    {
        weatherPanel.setTimeOfDay(timeOfDay);
        weatherPanel.setCondition(weatherPanel.getCondition());
    }

    public WeatherCondition getCondition()
    {
        return weatherPanel.getCondition();
    }

    public void setCondition(WeatherCondition condition)
    {
        weatherPanel.setCondition(condition);
    }

    public String getTemperature()
    {
        return weatherPanel.getTemperature();
    }

    public void setTemperature(String temperature)
    {
        weatherPanel.setTemperature(temperature);
    }

    public boolean isCelsius()
    {
        return this.celsius;
    }

    public void setCelsius(boolean celsius)
    {
        this.celsius = celsius;
        repaint();
    }

    private java.util.HashMap<String, WeatherCondition> createConditionMap()
    {
        java.util.HashMap<String,WeatherCondition> tmpMap = new java.util.HashMap<String, WeatherCondition>();
        tmpMap.put("chanceflurries",WeatherCondition.CHANCE_FLURRIES);
        tmpMap.put("chancerain", WeatherCondition.CHANCE_RAIN);
        tmpMap.put("chancesleet", WeatherCondition.CHANCE_SLEET);
        tmpMap.put("chancesnow", WeatherCondition.CHANCE_SNOW);
        tmpMap.put("chancetstorms",WeatherCondition.CHANCE_TSTORMS);
        tmpMap.put("clear", WeatherCondition.CLEAR);
        tmpMap.put("cloudy", WeatherCondition.CLOUDY);
        tmpMap.put("flurries", WeatherCondition.FLURRIES);
        tmpMap.put("fog", WeatherCondition.FOG);
        tmpMap.put("hazy", WeatherCondition.HAZY);
        tmpMap.put("mostlycloudy", WeatherCondition.MOSTLY_CLOUDY);
        tmpMap.put("mostlysunny", WeatherCondition.MOSTLY_SUNNY);
        tmpMap.put("partlycloudy", WeatherCondition.PARTLY_CLOUDY);
        tmpMap.put("partlysunny", WeatherCondition.PARTLY_SUNNY);
        tmpMap.put("rain", WeatherCondition.RAIN);
        tmpMap.put("sleet", WeatherCondition.SLEET);
        tmpMap.put("snow", WeatherCondition.SNOW);
        tmpMap.put("sunny", WeatherCondition.SUNNY);
        tmpMap.put("tstorms", WeatherCondition.TSTORMS);
        tmpMap.put("unknown", WeatherCondition.UNKNOWN);

        return (java.util.HashMap<String, WeatherCondition>) tmpMap.clone();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityLabel = new TextLabel();
        dayLabel = new TextLabel();
        weatherPanel = new WeatherPanel();
        clock = new staywell.ui.user.weatherforecast.AnalogClockDayNight();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(358, 74));
        setSize(new java.awt.Dimension(358, 74));

        cityLabel.setText("City");
        cityLabel.setFont(new java.awt.Font("Candara", 0, 36));
        cityLabel.setName("cityLabel"); // NOI18N

        dayLabel.setText("today");
        dayLabel.setFont(new java.awt.Font("Candara", 0, 18));
        dayLabel.setName("dayLabel"); // NOI18N

        weatherPanel.setName("weatherPanel"); // NOI18N

        setName("clock"); // NOI18N
        setPreferredSize(new java.awt.Dimension(74, 74));

        org.jdesktop.layout.GroupLayout clockLayout = new org.jdesktop.layout.GroupLayout(clock);
        setLayout(clockLayout);
        clockLayout.setHorizontalGroup(
            clockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 74, Short.MAX_VALUE)
        );
        clockLayout.setVerticalGroup(
            clockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 74, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cityLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 304, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dayLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(weatherPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(cityLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dayLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(2, 2, 2))
            .add(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(weatherPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TextLabel cityLabel;
    private AnalogClockDayNight clock;
    public TextLabel dayLabel;
    private WeatherPanel weatherPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent event)
    {
        if (event.getSource().equals(clock))
        {
            if (event.getPropertyName().equals("dayOffset"))
            {
                switch((Integer)event.getNewValue())
                {
                    case -1:
                        dayLabel.setText("yesterday");
                        break;
                    case 0:
                        dayLabel.setText("today");
                        break;
                    case 1:
                        dayLabel.setText("tomorrow");
                        break;
                    default:
                        dayLabel.setText("today");
                        break;
                }
            }

            if (event.getPropertyName().equals("timeOfDay"))
            {
                switch((Integer)event.getNewValue())
                {
                    case -2: // Moon                        
                        setTimeOfDay(TimeOfDay.NIGHT);
                        break;
                    case -1: // Sunrise                        
                        setTimeOfDay(TimeOfDay.DAY);
                        break;
                    case 0: // Sun                        
                        setTimeOfDay(TimeOfDay.DAY);
                        break;
                    case 1: // Sunset                        
                        setTimeOfDay(TimeOfDay.DAY);
                        break;
                    default:                        
                        break;
                }
            }
        }
    }

    @Override
    public void weatherServiceEventPerformed(WeatherServiceEvent event)
    {
        if (this.city.equals(event.getCity()))
        {
            System.out.println("check");
            if (!event.getCelsiusHigh().equals("") && !event.getFahrenheitHigh().equals(""))
            {

                if (celsius)
                {
                    setTemperature(event.getCelsiusHigh() + "°C / " + event.getCelsiusLow() + "°C");
                }
                else
                {
                    setTemperature(event.getFahrenheitHigh() + "°F / " + event.getFahrenheitLow() + "°F");
                }

                setCondition(conditionMap.get(event.getIcon()));
            }
            else
            {
                setTemperature("");
                setCondition(conditionMap.get("unknown"));
            }
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent event)
    {
        if (event.getSource().equals(weatherCheck))
        {
            try
            {
                if (WeatherService.INSTANCE.available)
                {
                    WeatherService.INSTANCE.fetchCondition(getCity());
                }
            }
            catch (java.io.UnsupportedEncodingException exception)
            {

            }
        }
    }
}
