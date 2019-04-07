public abstract class Wuerfel {
    private int augenzahl;

    public Wuerfel (int augenzahl){
        if (augenzahl < 2){
            throw new IllegalArgumentException("Augenzahl darf nicht kleiner als 2 sein");
        }
        this.augenzahl = augenzahl;
    }

    public Wuerfel (){
        this.augenzahl = 6;
    }

    public int getAugenzahl(){
        return this.augenzahl;
    }

    public int wurf () {
        int geworfen = (int) Math.random() * 6 + 1;
        return geworfen;
    }
}
