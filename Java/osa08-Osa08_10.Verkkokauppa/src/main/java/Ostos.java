import java.util.Objects;

public class Ostos {
    private String tuote;
    private int kpl;
    private int yksikkohinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta){
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }
    
    //Hinta saadaan kertomalla kappalemäärä yksikköhinnalla
    public int hinta(){
        int hinta = this.kpl * this.yksikkohinta;
        return hinta;
    }
    
    //kasvattaa ostoksen kappalemäärää yhdellä
    public void kasvataMaaraa(){
        this.kpl += 1;
    }
    
    public String toString(){
        return this.tuote +": " +this.kpl;
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.tuote);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ostos other = (Ostos) obj;
        if (!Objects.equals(this.tuote, other.tuote)) {
            return false;
        }
        return true;
    }
    
}
