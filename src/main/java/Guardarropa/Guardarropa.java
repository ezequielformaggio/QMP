package Guardarropa;

import Atuendo.Atuendo;
import Atuendo.GeneradorDeAtuendo;
import Clima.AccuWeatherAPI;
import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
  private AccuWeatherAPI clima;
  private CriterioSeparacion criterio;
  private GeneradorDeAtuendo generadorDeAtuendo;
  private List<Prenda> prendas = new ArrayList<>();

  public Guardarropa(CriterioSeparacion criterio) {
    this.criterio = criterio;
  }

  public Atuendo sugerirAtuendo(){
    return generadorDeAtuendo.crearAtuendo(obtenerPrendasSegunClima());
  }

  public List<Prenda> obtenerPrendasSegunClima(){
    Double temperatura = clima.getTemperatura("Buenos Aires, Argentina");
    return this.prendas
        .stream()
        .filter(prenda -> prenda.validarTemperatura(temperatura))
        .collect(Collectors.toList());
  }

  public void agregarPrenda(Prenda prenda){
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    this.prendas.remove(prenda);
  }

}
