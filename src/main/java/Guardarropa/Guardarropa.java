package Guardarropa;

import Atuendo.GeneradorDeAtuendo;
import Persona.Persona;
import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  CriterioSeparacion criterio;
  // List<Persona> personas = new ArrayList<>();
  List<Prenda> prendas = new ArrayList<>();

  public Guardarropa(CriterioSeparacion criterio) {
    this.criterio = criterio;
  }

  /* public void compartirCon(Persona persona) {
    personas.add(persona);
  }
  */

  public void sugerirAtuendo(Persona persona, GeneradorDeAtuendo atuendoGenerado){
    persona.getAtuendosSugeridos().add(atuendoGenerado.crearAtuendo(this.prendas));
  }

  public List<Prenda> getPrendas(){
    return  this.prendas;
  }
}
