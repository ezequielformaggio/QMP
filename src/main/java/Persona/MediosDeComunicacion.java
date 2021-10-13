package Persona;

import Clima.InformeDelClima;

public interface MediosDeComunicacion {
  void notificarActualizacionRecibida(InformeDelClima informeDelClima, Persona persona);
}
