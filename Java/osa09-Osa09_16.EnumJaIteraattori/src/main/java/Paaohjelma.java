
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        /*Tyontekijat yliopisto = new Tyontekijat();
        yliopisto.lisaa(new Henkilo("Petrus", Koulutus.FT));
        yliopisto.lisaa(new Henkilo("Arto", Koulutus.FilYO));
        yliopisto.lisaa(new Henkilo("Elina", Koulutus.FT));

        yliopisto.tulosta();

        yliopisto.irtisano(Koulutus.FilYO);

        System.out.println("==");

        yliopisto.tulosta();*/

        Tyontekijat t = new Tyontekijat();
        t.lisaa(new Henkilo("Arto", Koulutus.FilYO));
        t.lisaa(new Henkilo("Petrus", Koulutus.FT));
        t.lisaa(new Henkilo("Elina", Koulutus.FT));
        t.lisaa(new Henkilo("Sebastian", Koulutus.LuK));
        t.tulosta(Koulutus.LuK);
    }
}
