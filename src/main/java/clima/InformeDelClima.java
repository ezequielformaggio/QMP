package clima;

import java.util.List;

public class InformeDelClima {
  public final Double temperatura;
  public final List<String> pronostico;

  public InformeDelClima(Double temperatura, List<String> pronostico) {
    this.temperatura = temperatura;
    this.pronostico = pronostico;
  }
}
