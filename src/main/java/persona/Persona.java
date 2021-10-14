package persona;

import atuendo.Atuendo;
import guardarropa.Guardarropa;
import java.util.ArrayList;
import java.util.List;
import sugerencia.Sugerencia;

public class Persona {
  private List<Guardarropa> guardarropas;
  private List<Atuendo> atuendosSugeridos = new ArrayList<>();
  private List<Sugerencia> sugerencias = new ArrayList<>();
  private List<Sugerencia> sugerenciasEjecutadas = new ArrayList<>();
  private List<MediosDeComunicacion> mediosDeComunicacion;
  private String mail;

  public Persona(List<Guardarropa> guardarropas, List<Atuendo> atuendosSugeridos,
                 List<Sugerencia> sugerencias, List<Sugerencia> sugerenciasEjecutadas,
                 List<MediosDeComunicacion> mediosDeComunicacion, String mail) {
    this.guardarropas = guardarropas;
    this.atuendosSugeridos = atuendosSugeridos;
    this.sugerencias = sugerencias;
    this.sugerenciasEjecutadas = sugerenciasEjecutadas;
    this.mediosDeComunicacion = mediosDeComunicacion;
    this.mail = mail;
  }

  public List<Atuendo> getAtuendosSugeridos() {
    return atuendosSugeridos;
  }

  public void compartirGuardarropa(Persona persona, Guardarropa guardarropa) {
    persona.getGuardarropas().add(guardarropa);
  }

  public void sugerirPrenda(Sugerencia sugerencia) {
    sugerencias.add(sugerencia);
  }

  public void aceptarSugerencia(Sugerencia sugerencia) {
    sugerencia.ejecutar(this);
    sugerenciasEjecutadas.add(sugerencia);
    sugerencias.remove(sugerencia);
  }

  public void rechazarSugerencia(Sugerencia sugerencia) {
    sugerencias.remove(sugerencia);
  }

  public void deshacerSugerenciaEjecutada(Sugerencia sugerencia) {
    sugerencia.deshacer(this);
  }

  public List<Sugerencia> getSugerencias() {
    return sugerencias;
  }

  public String getMail() {
    return mail;
  }

  public List<Guardarropa> getGuardarropas() {
    return guardarropas;
  }

  public List<MediosDeComunicacion> getMediosDeComunicacion() {
    return mediosDeComunicacion;
  }

}
