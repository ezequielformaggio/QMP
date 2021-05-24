package PrendaTest;

import static java.util.Objects.requireNonNull;

public class Prenda {

  private final TipoPrenda tipoPrenda;
  private final Material material;
  private final Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda,Material material,Color colorPrincipal,Color colorSecundario) {
    this.material = requireNonNull(material, "material es obligatorio");
    this.colorPrincipal = requireNonNull(colorPrincipal, "color principal es obligatorio");
    this.tipoPrenda = requireNonNull(tipoPrenda, "tipo de prenda es obligatorio");
    this.colorSecundario = colorSecundario;
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }
}

