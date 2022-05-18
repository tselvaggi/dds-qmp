import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  public void atuendoUnicamenteInstanciadoEsInvalido() {
    Atuendo atuendo = atuendoInvalido();
    assertFalse(atuendo.esValida());
  }

  @Test
  public void uniformeColegioSanJuan() {
    Atuendo atuendo = new Atuendo();
    ArrayList<Prenda> prendas = buildUniformeColegioSanJuan();
    prendas.forEach(prenda -> atuendo.setPrenda(prenda.getCategoriaPrenda(), prenda));

    assertTrue(atuendo.esValida());
  }

  public void puedoObtenerPrendaPorCategoria() {
    Atuendo atuendo = new Atuendo();
    ArrayList<Prenda> prendas = buildUniformeColegioSanJuan();
    prendas.forEach(prenda -> atuendo.setPrenda(prenda.getCategoriaPrenda(), prenda));

    Prenda prendaSuperiorSanJuan = atuendo.getPrenda(CategoriaPrenda.SUPERIOR);

    assertEquals(CategoriaPrenda.SUPERIOR, prendaSuperiorSanJuan.getCategoriaPrenda());
    assertEquals(TipoPrenda.CHOMBA, prendaSuperiorSanJuan.getTipoPrenda());
    assertEquals(prendaSuperiorSanJuan.getColorPrincipal(), Color.green);
    assertEquals(Material.PIQUE, prendaSuperiorSanJuan.getMaterial());
  }

  public PrendaBuilder prendaInvalida() {
    return new PrendaBuilder();
  }

  public Prenda prendaLisaDefault() {
    PrendaBuilder prendaBuilder = new PrendaBuilder();
    prendaBuilder.setTipoPrenda(TipoPrenda.PANTALON);
    prendaBuilder.setColorPrincipal(Color.BLACK);
    prendaBuilder.setTipoTela(Material.JEAN);
    return prendaBuilder.buildPrenda();
  }

  public Atuendo atuendoInvalido() {
    return new Atuendo();
  }

  public ArrayList<Prenda> buildUniformeColegioSanJuan() {
    ArrayList<Prenda> prendas = new ArrayList<>();

    PrendaBuilder prendaSuperior = new PrendaBuilder();
    prendaSuperior.setTipoPrenda(TipoPrenda.CHOMBA);
    prendaSuperior.setColorPrincipal(Color.green);
    prendaSuperior.setTipoTela(Material.PIQUE);
    prendas.add(prendaSuperior.buildPrenda());


    PrendaBuilder prendaInferior = new PrendaBuilder();
    prendaInferior.setTipoPrenda(TipoPrenda.PANTALON);
    prendaInferior.setColorPrincipal(Color.gray);
    prendaInferior.setTipoTela(Material.ACETATO);
    prendas.add(prendaInferior.buildPrenda());

    PrendaBuilder prendaCalzado = new PrendaBuilder();
    prendaCalzado.setTipoPrenda(TipoPrenda.ZAPATO);
    prendaCalzado.setColorPrincipal(Color.white);
    prendaCalzado.setTipoTela(Material.CUERO);
    prendas.add(prendaCalzado.buildPrenda());

    return prendas;
  }
}
