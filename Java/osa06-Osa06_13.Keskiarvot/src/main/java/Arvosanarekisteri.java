
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
