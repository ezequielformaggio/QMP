package persona;

import clima.InformeDelClima;
import guardarropa.Guardarropa;

public class Recalculo implements MediosDeComunicacion {

  @Override
  public void notificarActualizacionRecibida(InformeDelClima informeDelClima, Persona persona) {
    persona.getGuardarropas().forEach(Guardarropa::sugerenciaDiaria);
  }

}
