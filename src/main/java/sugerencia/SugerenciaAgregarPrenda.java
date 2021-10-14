package sugerencia;

import guardarropa.Guardarropa;
import persona.Persona;
import prenda.Prenda;

public class SugerenciaAgregarPrenda implements Sugerencia {
  private Prenda prenda;
  private Guardarropa guardarropa;

  public SugerenciaAgregarPrenda(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void ejecutar(Persona persona) {
    guardarropa.agregarPrenda(prenda);
  }

  @Override
  public void deshacer(Persona persona) {
    guardarropa.quitarPrenda(prenda);
  }
}
