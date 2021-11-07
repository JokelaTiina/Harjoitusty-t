
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        /*List<Kortti> kortit = new ArrayList<>();

        Kortti eka = new Kortti(14, Maa.RUUTU);
        Kortti toka = new Kortti(14, Maa.PATA);
        Kortti kolmas = new Kortti(14, Maa.HERTTA);
        Kortti neljas = new Kortti(14, Maa.RISTI);
        Kortti viides = new Kortti(12, Maa.RISTI);
        Kortti kuudes = new Kortti(4, Maa.PATA);
        Kortti seiska = new Kortti(10, Maa.HERTTA);

        System.out.println(eka);
        System.out.println(toka);
        System.out.println(kolmas);
        System.out.println(neljas);
        System.out.println(viides);
        System.out.println(kuudes);
        System.out.println(seiska);

        kortit.add(eka);
        kortit.add(toka);
        kortit.add(kolmas);
        kortit.add(neljas);
        kortit.add(viides);
        kortit.add(kuudes);
        kortit.add(seiska);

        Collections.sort(kortit);
        System.out.println(kortit);*/

 /*Kasi kasi = new Kasi();

        kasi.lisaa(new Kortti(2, Maa.RUUTU));
        kasi.lisaa(new Kortti(14, Maa.PATA));
        kasi.lisaa(new Kortti(12, Maa.HERTTA));
        kasi.lisaa(new Kortti(2, Maa.PATA));

        kasi.jarjesta();

        kasi.tulosta();*/
 /*Kasi kasi1 = new Kasi();

        kasi1.lisaa(new Kortti(2, Maa.RUUTU));
        kasi1.lisaa(new Kortti(14, Maa.PATA));
        kasi1.lisaa(new Kortti(12, Maa.HERTTA));
        kasi1.lisaa(new Kortti(2, Maa.PATA));

        Kasi kasi2 = new Kasi();

        kasi2.lisaa(new Kortti(11, Maa.RUUTU));
        kasi2.lisaa(new Kortti(11, Maa.PATA));
        kasi2.lisaa(new Kortti(11, Maa.HERTTA));

        int vertailu = kasi1.compareTo(kasi2);

        if (vertailu < 0) {
            System.out.println("arvokkaampi käsi sisältää kortit");
            kasi2.tulosta();
        } else if (vertailu > 0) {
            System.out.println("arvokkaampi käsi sisältää kortit");
            kasi1.tulosta();
        } else {
            System.out.println("kädet yhtä arvokkaat");
        }*/
 /* ArrayList<Kortti> kortit = new ArrayList<>();

        kortit.add(new Kortti(3, Maa.PATA));
        kortit.add(new Kortti(2, Maa.RUUTU));
        kortit.add(new Kortti(14, Maa.PATA));
        kortit.add(new Kortti(12, Maa.HERTTA));
        kortit.add(new Kortti(2, Maa.PATA));

        SamatMaatVierekkain samatMaatVierekkainJarjestaja = new SamatMaatVierekkain();
        Collections.sort(kortit, samatMaatVierekkainJarjestaja);

        kortit.stream().forEach(k -> System.out.println(k));*/
        Kasi kasi = new Kasi();

        kasi.lisaa(new Kortti(12, Maa.HERTTA));
        kasi.lisaa(new Kortti(4, Maa.PATA));
        kasi.lisaa(new Kortti(2, Maa.RUUTU));
        kasi.lisaa(new Kortti(14, Maa.PATA));
        kasi.lisaa(new Kortti(7, Maa.HERTTA));
        kasi.lisaa(new Kortti(2, Maa.PATA));

        kasi.jarjestaMaittain();

        kasi.tulosta();
    }
}
