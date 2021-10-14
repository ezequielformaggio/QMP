package uniforme;

import prenda.Prenda;

public interface CreadorUniformes {
  Prenda fabricarParteSuperior();

  Prenda fabricarParteInferior();

  Prenda fabricarCalzado();

  default Uniforme fabricarUniforme() {
    return new Uniforme(this.fabricarParteSuperior(),
        this.fabricarParteInferior(), this.fabricarCalzado());
  }

}
