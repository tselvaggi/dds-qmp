import java.awt.Color;

public class Prenda {

  private TipoPrenda tipoPrenda;

  private Material tipoTela;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, String tipoTela,
                Color colorPrincipal, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.tipoTela = tipoTela;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public boolean esValida() {
    return this.tipoPrenda != null && this.tipoTela != null && this.colorPrincipal != null;
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public CategoriaPrenda getCategoriaPrenda() {
    return tipoPrenda.getCategoriaPrenda();
  }

  public String getTipoTela() {
    return tipoTela;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
}
