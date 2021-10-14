package persona;

import clima.InformeDelClima;

public interface MediosDeComunicacion {
  void notificarActualizacionRecibida(InformeDelClima informeDelClima, Persona persona);
}
