import java.awt.Color;

public class PrendaBuilder {
  Prenda prenda = new Prenda();

  public PrendaBuilder() {
    prenda.setTramaPrenda(TramaPrenda.LISA);
  }

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
