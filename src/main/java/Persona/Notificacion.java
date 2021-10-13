package Persona;

import Clima.InformeDelClima;

public class Notificacion implements MediosDeComunicacion{

  @Override
  public void notificarActualizacionRecibida(InformeDelClima informeDelClima, Persona persona) {

    if(informeDelClima.pronostico.contains("HAIL")){
      //persona.notify("Se le notifica que habra una posible caida de granizo, evite salir en auto");
    }
    if(informeDelClima.pronostico.contains("STORM")){
      //persona.notify("Se le notifica que habra posibles lluvias, use paraguas");
    }
  }

}
