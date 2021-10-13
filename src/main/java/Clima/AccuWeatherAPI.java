package Clima;

import java.util.*;

public final class AccuWeatherAPI extends Clima {

  // metodo de prueba
  public final List<Map<String, Object>> getWeather(String ciudad) {
    return Arrays.asList(new HashMap<String, Object>() {{
      put("DateTime", "2019-05-03T01:00:00-03:00");
      put("EpochDateTime", 1556856000);
      put("WeatherIcon", 33);
      put("IconPhrase", "Clear");
      put("IsDaylight", false);
      put("PrecipitationProbability", 0);
      put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
      put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
      put("Temperature", new HashMap<String, Object>() {{
        put("Value", 57);
        put("Unit", "F");
        put("UnitType", 18);
      }});
    }});
  }

  public final Map<String, Object> getAlerts(String ciudad){
    String[] pronosticos = {"SUNNY", "STORM", "HAIL"};
    return Arrays.asList(new HashMap<String, Object>() {{
      put("CurrentAlerts", Arrays.asList(pronosticos));
    }}).get(0);
  }

}