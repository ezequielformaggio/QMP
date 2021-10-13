package Persona;

import Clima.InformeDelClima;
import Guardarropa.Guardarropa;

import java.util.List;

public class Recalculo implements MediosDeComunicacion{

  List<Persona> personas;

  @Override
  public void notificarActualizacionRecibida(InformeDelClima informeDelClima, Persona persona) {
    persona.getGuardarropas().forEach(Guardarropa::sugerenciaDiaria);
  }

}
