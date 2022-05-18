import java.awt.Color;

public class Prenda {

  private TipoPrenda tipoPrenda;
  private TramaPrenda tramaPrenda;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material,
                Color colorPrincipal, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public Prenda() {

  }

  public CategoriaPrenda getCategoriaPrenda() {
    return this.tipoPrenda.getCategoriaPrenda();
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setTipoTela(Material material) {
    this.material = material;
  }

  public void setColorPrincipal(Color colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Color getColorPrincipal() {
    return this.colorPrincipal;
  }

  public Color getColorSecundario() {
    return this.colorSecundario;
  }

  public void setTramaPrenda(TramaPrenda tramaPrenda) {
    this.tramaPrenda = tramaPrenda;
  }

  public TramaPrenda getTramaPrenda() {
    return this.tramaPrenda;
  }

  public boolean esValida() {
    return this.tipoPrenda != null && this.material != null && this.colorPrincipal != null;
  }
}
