package Persona;

import Atuendo.Atuendo;
import Guardarropa.Guardarropa;
import Sugerencia.*;

import java.util.ArrayList;
import java.util.List;

public class Persona {
  private List<Guardarropa> guardarropas;
  private List<Atuendo> atuendosSugeridos = new ArrayList<>();
  private List<Sugerencia> sugerencias = new ArrayList<>();
  private List<Sugerencia> sugerenciasEjecutadas = new ArrayList<>();

  public List<Atuendo> getAtuendosSugeridos() {
    return atuendosSugeridos;
  }

  public void compartirGuardarropa(Persona persona, Guardarropa guardarropa) {
    persona.guardarropas.add(guardarropa);
  }

  public void sugerirPrenda(Sugerencia sugerencia){
    sugerencias.add(sugerencia);
  }

  public void aceptarSugerencia(Sugerencia sugerencia) {
    sugerencia.ejecutarSugerencia(this);
    sugerenciasEjecutadas.add(sugerencia);
    sugerencias.remove(sugerencia);
  }

  public void rechazarSugerencia(Sugerencia sugerencia) {
    sugerencias.remove(sugerencia);
  }

  public void deshacerSugerenciaEjecutada(Sugerencia sugerencia) {
    sugerencia.deshacerSugerencia(this);
  }

  public List<Sugerencia> getSugerencias() {
    return sugerencias;
  }

}
