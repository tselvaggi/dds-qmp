import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeraIteracionTest {

  @Test
  public void tipoPrendaPANTALONyEsParteINFERIOR() {
    Prenda pantalon = pantalon();
    assertEquals(pantalon.getTipoPrenda().toString(), "PANTALON");
    assertEquals(pantalon.getCategoriaPrenda().toString(), "INFERIOR");
  }

  @Test
  public void camisaConTipoTela() {
    assertEquals(camisaDeLana().getMaterial().toString(), "LANA");
  }

  @Test
  public void prendaInvalida() {
    assertFalse(pantalon().esValida());
    assertFalse(camisaDeLana().esValida());
  }

  private Prenda pantalon() {
    return new Prenda(TipoPrenda.PANTALON, null, null, null);
  }

  private Prenda camisaDeLana() {
    return new Prenda(TipoPrenda.CAMISA, Material.LANA, null, null);
  }
}
