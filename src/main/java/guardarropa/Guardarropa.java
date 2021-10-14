package guardarropa;

import atuendo.Atuendo;
import atuendo.GeneradorDeAtuendo;
import clima.AccuWeatherApi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.Timer;
import prenda.Prenda;

public class Guardarropa {
  private AccuWeatherApi clima;
  private GeneradorDeAtuendo generadorDeAtuendo;
  private List<Prenda> prendas = new ArrayList<>();
  private Atuendo sugerenciaDiaria;

  public Guardarropa(AccuWeatherApi clima, GeneradorDeAtuendo generadorDeAtuendo,
                     List<Prenda> prendas, Atuendo sugerenciaDiaria) {
    this.clima = clima;
    this.generadorDeAtuendo = generadorDeAtuendo;
    this.prendas = prendas;
    this.sugerenciaDiaria = sugerenciaDiaria;
  }

  public Atuendo sugerirAtuendo() {
    return generadorDeAtuendo.crearAtuendo(obtenerPrendasSegunClima());
  }

  public void sugerenciaDiaria() {
    sugerenciaDiaria = generadorDeAtuendo.crearAtuendo(obtenerPrendasSegunClima());
  }

  Timer timer = new Timer(86400000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      sugerenciaDiaria();
      timer.restart();
    }
  });

  public List<Prenda> obtenerPrendasSegunClima() {
    Double temperatura = clima.getTemperatura("Buenos Aires, Argentina");
    return this.prendas
        .stream()
        .filter(prenda -> prenda.validarTemperatura(temperatura))
        .collect(Collectors.toList());
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public Atuendo getSugerenciaDiaria() {
    return sugerenciaDiaria;
  }
}
