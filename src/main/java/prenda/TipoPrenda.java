package prenda;

public class TipoPrenda {
  private Categoria categoria;
  private Double temperaturaMaxima;

  public TipoPrenda(Categoria categoria, Double temperaturaMaxima) {
    this.categoria = categoria;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Double getTemperaturaMaxima() {
    return temperaturaMaxima;
  }
}