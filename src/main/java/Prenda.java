import java.awt.Color;

public class Prenda {

  private TipoPrenda tipoPrenda;
  private TramaPrenda tramaPrenda;
  private String tipoTela;
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
}
