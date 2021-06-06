package Persona;

import Guardarropa.Guardarropa;
import Prenda.Prenda;
import Uniforme.Uniforme;

import java.util.ArrayList;
import java.util.List;

public class Persona {
  List<Prenda> prendas = new ArrayList<>();
  List<Uniforme> uniformesSugeridos = new ArrayList<Uniforme>();

  public void sugerirUniforme(Persona persona, Uniforme uniforme){
    persona.uniformesSugeridos.add(uniforme);
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
