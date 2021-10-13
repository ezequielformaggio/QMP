package Prenda;

import static java.util.Objects.requireNonNull;

public class Prenda {

  private final TipoPrenda tipoPrenda;
  private final Material material;
  private final Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(TipoPrenda tipoPrenda,Material material,Color colorPrincipal,Color colorSecundario,Trama trama) {
    this.material = requireNonNull(material, "material es obligatorio");
    this.colorPrincipal = requireNonNull(colorPrincipal, "color principal es obligatorio");
    this.tipoPrenda = requireNonNull(tipoPrenda, "tipo de prenda es obligatorio");
    this.colorSecundario = colorSecundario;
    this.trama = trama;

  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public Boolean validarTemperatura(Double temperaturaActual){
    return tipoPrenda.getTemperaturaMaxima() <= temperaturaActual;
  }

}

