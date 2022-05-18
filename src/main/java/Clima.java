import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clima {
  private static final Clima INSTANCE = new Clima();

  private Clima(){

  }
  public static Clima getInstance() {
    return INSTANCE;
  }

  private List<Map<String, Object>> getClimaBuenosAires() {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    return apiClima.getWeather("Buenos Aires, Argentina");
  }

  public BigDecimal getTemperaturaBuenosAiresCelcius() {
    Map<String, Object> temperatura = (HashMap<String, Object>) getClimaBuenosAires().get(0).get("Temperature");
    return calcularCelcius(temperatura);
  }

  private BigDecimal calcularCelcius(Map<String, Object> temperatura) {
    if (temperatura.get("Unit").equals("F")) {
      double formulaCelsius = ((Double) temperatura.get("Value") - 32) / 1.8;
      return BigDecimal.valueOf(formulaCelsius);
    } else if (temperatura.get("Unit").equals("C")) {
      return BigDecimal.valueOf((Double) temperatura.get("Value"));
    }
    throw new UnidadDesconocidaException("No existe la unidad o no está implementada la fórmula");
  }
}
