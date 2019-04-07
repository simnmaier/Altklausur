public class Becher {
    private int maxAugenzahl;
    private Wuerfel [] wuerfel;

    public Becher (Wuerfel [] wuerfel) {
        if (wuerfel == null) {
            throw new IllegalArgumentException("Der Wert darf nicht null sein");
        }
      for (Wuerfel w : this.wuerfel){
         maxAugenzahl = this.wuerfel.length * 6;
      }

      this.maxAugenzahl = maxAugenzahl;
      this.wuerfel = wuerfel;
    }

    public int [] wurf (){
        for (Wuerfel w : this.wuerfel){
        }
    }
}
