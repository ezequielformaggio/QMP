package Clima;

import java.util.*;

public final class AccuWeatherAPI extends Clima {

  public final List<Map<String, Object>> getWeather(String ciudad) {
    return Arrays.asList(new HashMap<String, Object>(){{
      put("DateTime", "2019-05-03T01:00:00-03:00");
      put("EpochDateTime", 1556856000);
      put("WeatherIcon", 33);
      put("IconPhrase", "Clear");
      put("IsDaylight", false);
      put("PrecipitationProbability", 0);
      put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
      put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
      put("Temperature", new HashMap<String, Object>(){{
        put("Value", 57);
        put("Unit", "F");
        put("UnitType", 18);
      }});
    }});
  }



  AccuWeatherAPI apiClima = new AccuWeatherAPI();

  public Double getTemperatura(String ciudad){
    List<Map<String, Object>> temperatura = apiClima.getWeather(ciudad);
    Double temperaturaFarenheit = (Double) temperatura.get(0).get("Value");
    return conversionACelcius(temperaturaFarenheit);
  }

  public Double conversionACelcius(Double temperaturaFarenheit){
    return (temperaturaFarenheit  - 32)*5/9;
  }

}