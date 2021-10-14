package uniforme;


import prenda.Categoria;
import prenda.Color;
import prenda.Material;
import prenda.Prenda;
import prenda.TipoPrenda;
import prenda.Trama;


public class UniformeEmaus implements CreadorUniformes {

  @Override
  public Prenda fabricarParteSuperior() {
    TipoPrenda chomba = new TipoPrenda(Categoria.PARTE_SUPERIOR, 29.0);
    Color celeste = new Color(0,0,100);
    return new Prenda(chomba, Material.ALGODON, celeste,null, Trama.LISA);
  }

  @Override
  public Prenda fabricarParteInferior() {
    TipoPrenda pantalon = new TipoPrenda(Categoria.PARTE_INFERIOR, 29.0);
    Color gris = new Color(100,100,100);
    return new Prenda(pantalon, Material.JEAN, gris,null, Trama.LISA);
  }

  @Override
  public Prenda fabricarCalzado() {
    TipoPrenda zapatos = new TipoPrenda(Categoria.CALZADO, 29.0);
    Color marron = new Color(100,30,100);
    return new Prenda(zapatos, Material.ALGODON, marron,null, Trama.LISA);
  }

  public Uniforme fabricarUniforme() {
    return new Uniforme(this.fabricarParteSuperior(),
        this.fabricarParteInferior(), this.fabricarCalzado());
  }

}