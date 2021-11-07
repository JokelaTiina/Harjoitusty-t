
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {

    private Map<String, Ostos> ostokset;

    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (!(this.ostokset.get(tuote) == null)) {
            this.ostokset.get(tuote).kasvataMaaraa();
        } else {
            Ostos ostos = new Ostos(tuote, 1, hinta);
            this.ostokset.put(tuote, ostos);
        }
    }

    public int hinta() {
        int hinta = 0;

        for (Ostos korinsisalto : this.ostokset.values()) {
            hinta += korinsisalto.hinta();
        }
        return hinta;
    }

    public void tulosta() {
        for (Ostos korinsisalto : this.ostokset.values()) {
            System.out.println(korinsisalto.toString());;
        }
    }
}
