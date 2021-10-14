package sugerencia;

import persona.Persona;

public interface Sugerencia {
  void ejecutar(Persona persona);

  void deshacer(Persona persona);
}
