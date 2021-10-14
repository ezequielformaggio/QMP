package clima;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import persona.Persona;

public class Clima {

  AccuWeatherApi apiClima = new AccuWeatherApi();
  List<Persona> personas = new ArrayList<>(); // horrible

  public List<InformeDelClima> informesDelClima = new ArrayList<>();

  public List<String> getPronostico(String ciudad) {
    Map<String, Object> alertas = apiClima.getAlerts(ciudad);
    List<String> alertasObtenidas = (List<String>) alertas.get("CurrentAlerts");
    return alertasObtenidas;
  }

  public Double getTemperatura(String ciudad) {
    List<Map<String, Object>> temperatura = apiClima.getWeather(ciudad);
    Double temperaturaFarenheit = (Double) temperatura.get(0).get("Value");
    return conversionACelcius(temperaturaFarenheit);
  }

  public Double conversionACelcius(Double temperaturaFarenheit) {
    return (temperaturaFarenheit - 32) * 5 / 9;
  }

  public void agregarInforme(InformeDelClima informeDelClima) {
    if (informesDelClima.size() >= 10) {
      informesDelClima.remove(0);
    }
    informesDelClima.add(informeDelClima);
  }

  public InformeDelClima getInforme(String ciudad) {
    InformeDelClima informeDelClima = new InformeDelClima(
        getTemperatura(ciudad),
        getPronostico(ciudad));
    agregarInforme(informeDelClima);
    return informeDelClima;
  }

  public List<InformeDelClima> getInformesDelClima() {
    return informesDelClima;
  }

  public void actualizcionDelClima(InformeDelClima informeDelClima) {
    notificarPersonas(this.personas, informeDelClima);
    agregarInforme(informeDelClima);
  }

  public void notificarPersonas(List<Persona> personas, InformeDelClima informeDelClima) {
    personas.forEach(persona -> persona.getMediosDeComunicacion()
        .forEach(medio -> medio.notificarActualizacionRecibida(informeDelClima, persona)));
  }
}