# Diagrama de clases

![POz1oeCm44RtSufP_l_26nHHh1IXLh7IhQHr464q9J4hwTqRsuvOkWfyx_6IH7PIPd830vI6nbPX48IOQDRcTu0RAslnlS-0IFQYk6_LtpyyXBxK6Gorq1cY4QxiQC4qkW5pDP7f5SzGPsNHv76TLbbyN7dTtxNq5-FSb5LwsiUhaFX0ftr2hCGd3eMFR5LvUhW9WjoDkm0_ar3vvdSS029_k](https://user-images.githubusercontent.com/63843225/169454062-07da920b-d319-41c5-b40c-0fb7a990c23f.png)


# Pseudocódigo

```java

public class Prenda {

  private TipoPrenda tipoPrenda;

  private Material tipoTela;
  private Color colorPrincipal;
  private Color colorSecundario;
  
   public boolean esValida() {
    return this.tipoPrenda != null && this.tipoTela != null && this.colorPrincipal != null;
  }
}


public enum TipoPrenda {
  ZAPATO(CategoriaPrenda.CALZADO),
  CAMISA(CategoriaPrenda.SUPERIOR),
  PANTALON(CategoriaPrenda.INFERIOR);
}

public enum CategoriaPrenda {
  SUPERIOR, INFERIOR, CALZADO, ACCESORIO
}

```
