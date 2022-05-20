```java

public enum TramaPrenda {
  LISA, RAYADA, CON_LUNARES, CUADROS, ESTAMPADO
}

public class PrendaBuilder {
  Prenda prenda = new Prenda();

  public PrendaBuilder() {
    prenda.setTramaPrenda(TramaPrenda.LISA);
  }
  Se inicializa por defecto en lisa

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    prenda.setTipoPrenda(tipoPrenda);
  }

  public void setTipoTela(Material material) {
    prenda.setTipoTela(material);
  }

  public void setColorPrincipal(Color colorPrincipal) {
    prenda.setColorPrincipal(colorPrincipal);
  }

  public void setColorSecundario(Color colorSecundario) {
    prenda.setColorSecundario(colorSecundario);
  }

  public void setTramaPrenda(TramaPrenda tramaPrenda) {
    prenda.setTramaPrenda(tramaPrenda);
  }

  public Prenda buildPrenda() {
    if (!prenda.esValida()) {
      throw new PrendaInvalidaException("Se intento construir una prenda con estado inválido");
    } else {
      return prenda;
    }
  }
}

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
  
```
