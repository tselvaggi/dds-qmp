import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SegundaIteracionTest {

  @Test
  public void prendaDefault() {
    Prenda prendaDefault = prendaLisaDefault();
    assertEquals(prendaDefault.getTramaPrenda().toString(), "LISA");
  }

  @Test
  public void prendaInvalidaNoPuedeCrearse() {
    assertThrows(PrendaInvalidaException.class, () -> prendaInvalida().buildPrenda());
  }

  public PrendaBuilder prendaInvalida() {
    return new PrendaBuilder();
  }
  public Prenda prendaLisaDefault() {
    PrendaBuilder prendaBuilder = new PrendaBuilder();
    prendaBuilder.setTipoPrenda(TipoPrenda.PANTALON);
    prendaBuilder.setColorPrincipal(Color.BLACK);
    prendaBuilder.setTipoTela("JEAN");
    return prendaBuilder.buildPrenda();
  }
}
