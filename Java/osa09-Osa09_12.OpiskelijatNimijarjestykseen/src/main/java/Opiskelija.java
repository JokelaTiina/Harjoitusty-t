

public class Opiskelija implements Comparable<Opiskelija> {

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }
    
    public int compareTo(Opiskelija opiskelija){
        
        int tulos = this.nimi.compareToIgnoreCase(opiskelija.nimi);
        
        return tulos;
    }

}
