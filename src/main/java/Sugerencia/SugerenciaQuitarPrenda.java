package Sugerencia;

import Guardarropa.Guardarropa;
import Persona.Persona;
import Prenda.Prenda;

public class SugerenciaQuitarPrenda implements Sugerencia {
  private Prenda prenda;
  private Guardarropa guardarropa;

  public SugerenciaQuitarPrenda(Prenda prenda, Guardarropa guardarropa){
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void ejecutar(Persona persona){
    guardarropa.quitarPrenda(prenda);
  }

  @Override
  public void deshacer(Persona persona) {
    guardarropa.agregarPrenda(prenda);
  }
}
