package Persona;

import Atuendo.Atuendo;
import Atuendo.GeneradorDeAtuendo;
import Guardarropa.Guardarropa;

import java.util.ArrayList;
import java.util.List;

public class Persona {
  Guardarropa guardarropa;
  List<Atuendo> atuendosSugeridos = new ArrayList<>();

  public void sugerirAtuendo(Persona persona, Atuendo atuendo){
    persona.atuendosSugeridos.add(atuendo);
  }

  public List<Atuendo> getAtuendosSugeridos() {
    return atuendosSugeridos;
  }

  /*

  QMP5
  List<Guardarropa> guardarropas = new ArrayList<>();
  List<Prenda> sugerenciasParaAgregar = new ArrayList<>();
  List<Prenda> sugerenciasParaQuitar = new ArrayList<>();

  public void compartirGuardarropaCon(Persona persona,Guardarropa guardarropa) {
    persona.guardarropas.add(guardarropa);
  }

  public void sugerirAgregarPrenda(Persona persona,Prenda prenda){
    persona.sugerenciasParaAgregar.add(prenda);
  }

  public void sugerirQuitarPrenda(Persona persona,Prenda prenda){
    persona.sugerenciasParaQuitar.add(prenda);
  }

  public void aceptarSugerenciaAgregar(Prenda prendaSugerida){
    this.prendas.add(prendaSugerida);
  }

  public void aceptarSugerenciaQuitar(Prenda prendaSugerida){
    this.prendas.remove(prendaSugerida);
  }

  public List<Prenda> verSugerenciasAAgregar(){
    return sugerenciasParaAgregar;
  }

  public List<Prenda> verSugerenciasAQuitar(){
    return sugerenciasParaQuitar;
  }

  public void deshacerSugerencia(Prenda prenda){
    this.prendas.remove(prenda);
  }
*/
}
