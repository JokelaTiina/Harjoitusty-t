import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paaohjelma {

    public static void main(String[] args) {
        List<Opiskelija> opiskelijat = new ArrayList<>(); 
        
        Opiskelija eka = new Opiskelija("Seba");
        Opiskelija toka = new Opiskelija("Tiina");
        Opiskelija kolmas = new Opiskelija("Mikko");
        Opiskelija neljas = new Opiskelija("Äiti");
        Opiskelija viides = new Opiskelija("Pappa");
        
        opiskelijat.add(eka);
        opiskelijat.add(toka);
        opiskelijat.add(kolmas);
        opiskelijat.add(neljas);
        opiskelijat.add(viides);
        
        //Tulostuu vain vertailun antama numeraalinen tulos, jonka mukaan järjestely tapahtuu. Ei vaikuta järjestämiseen.
        System.out.println(eka.compareTo(toka));
        System.out.println(kolmas.compareTo(neljas));
        System.out.println(neljas.compareTo(viides));
        
        Collections.sort(opiskelijat);
        opiskelijat.stream().forEach(o -> System.out.println(o));
    }
}
