package Guardarropa;

import Persona.Persona;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  CriterioSeparacion criterio;
  List<Persona> personas = new ArrayList<>();

  public Guardarropa(CriterioSeparacion criterio) {
    this.criterio = criterio;
  }

  public void compartirCon(Persona persona) {
    personas.add(persona);
  }

}
