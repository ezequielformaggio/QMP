package Guardarropa;

import Atuendo.Atuendo;
import Atuendo.GeneradorDeAtuendo;
import Clima.AccuWeatherAPI;
import Prenda.Prenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
  private AccuWeatherAPI clima;
  private GeneradorDeAtuendo generadorDeAtuendo;
  private List<Prenda> prendas = new ArrayList<>();
  private Atuendo sugerenciaDiaria;
  private String ciudad;

  public Atuendo sugerirAtuendo(){
    return generadorDeAtuendo.crearAtuendo(obtenerPrendasSegunClima());
  }

  public void sugerenciaDiaria(){ // hacer un disparador que a tal hora ejecute este metodo
    sugerenciaDiaria = generadorDeAtuendo.crearAtuendo(obtenerPrendasSegunClima());
  }

  Timer timer = new Timer(86400000, new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
      sugerenciaDiaria();
      timer.restart();
    }
  });

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

  public Atuendo getSugerenciaDiaria() {
    return sugerenciaDiaria;
  }

}
