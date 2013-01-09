package staywell.ui.user.weatherforecast;

public interface WeatherServiceEventListener extends java.util.EventListener
{
    public void weatherServiceEventPerformed (WeatherServiceEvent event);
}