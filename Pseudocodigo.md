```java

public class Atuendo {
  private final Map<CategoriaPrenda, Prenda> atuendo;

  Atuendo() {
    this.atuendo = new HashMap<>();
    this.atuendo.put(CategoriaPrenda.SUPERIOR, null);
    INFERIOR
      ...
  }
  utilizo la interfaz Map para setear en el constructor por cada tipo de categoría una prenda
  
  
  public void setPrenda(CategoriaPrenda categoriaPrenda, Prenda prenda) {
      this.atuendo.replace(categoriaPrenda, prenda);
  }

  public boolean esValida(){
    this.atuendo.ningunCampoEnNULL()
  }

LA PARTE DE TESTEO DE ATUENDO ESTA EN SegundaIteracionTest.java

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

  private BigDecimal calcularCelsius(Map<String, Object> temperatura) {
    if temperatura.unit == 'F'
      return temperatura.pasajeFarenheitCelsius()
      
     return temperatura.value
  }
}

Utilizo una singleton para tratar la API. En la prenda se genera el siguiente método:

public class Prenda{
  public boolean esAdecuadaTemperaturaActual(BigDecimal temperaturaActual){
    return this.temperaturaMaximaAdecuada.compareTo(temperaturaActual) >= 0;
  }
}

En caso de testeo recibiría valores fijos para evitar gastos de utilización de API

En el programa un llamado podría ser:

prenda.esAdecuadaTemperaturaActual(Clima.getInstance().getClimaBuenosAiresCelsius);

Otra forma para evitar gastos, como en la documentación se nombra que el clima es para las siguientes 12hs, 
como mucho el sistema debería hacer dos consultas diarias. Eso quizas con un hilo que cada 12hs ejecute la api podría ser posible.

```
