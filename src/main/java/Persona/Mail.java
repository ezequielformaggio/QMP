package Persona;

import Clima.InformeDelClima;

import java.util.List;

public class Mail implements MediosDeComunicacion{
  //Mailsender mailsender = new MailObsender;

  @Override
  public void notificarActualizacionRecibida(InformeDelClima informeDelClima, Persona persona) {
    // TODO
    // mailsender.send(persona.getMail(), "Se le informa que se genero el alerta meteorologico informeDelClima.get...");
  }
}
