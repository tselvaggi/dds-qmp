public enum TipoPrenda {
  ZAPATO(CategoriaPrenda.CALZADO),
  CAMISA(CategoriaPrenda.SUPERIOR),
  CHOMBA(CategoriaPrenda.SUPERIOR),
  PANTALON(CategoriaPrenda.INFERIOR);


  private final CategoriaPrenda categoriaPrenda;

  public CategoriaPrenda getCategoriaPrenda() {
    return this.categoriaPrenda;
  }

  TipoPrenda(CategoriaPrenda categoriaPrenda) {
    this.categoriaPrenda = categoriaPrenda;
  }
}
