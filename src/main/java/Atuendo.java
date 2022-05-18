import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Atuendo {
  private final Map<CategoriaPrenda, Prenda> atuendo;

  Atuendo() {
    this.atuendo = new HashMap<>();
    this.atuendo.put(CategoriaPrenda.SUPERIOR, null);
    this.atuendo.put(CategoriaPrenda.INFERIOR, null);
    this.atuendo.put(CategoriaPrenda.CALZADO, null);
  }

  public void setPrenda(CategoriaPrenda categoriaPrenda, Prenda prenda) {
    if (!prenda.esValida()) {
      throw new PrendaInvalidaException("No se puede colocar una prenda inválida en el atuendo");
    } else {
      this.atuendo.replace(categoriaPrenda, prenda);
    }
  }

  public Prenda getPrenda(CategoriaPrenda categoriaPrenda) {
    return this.atuendo.get(categoriaPrenda);
  }

  public List<Prenda> getPrendas() {
    return new ArrayList<>(this.atuendo.values());
  }

  public boolean esValida() {
    return this.getPrendas().stream().allMatch(Objects::nonNull);
  }
}
