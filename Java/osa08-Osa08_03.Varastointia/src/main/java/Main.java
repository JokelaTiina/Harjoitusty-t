

public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia
        /*MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
        mehu.otaVarastosta(11.3);
        mehu.lisaaVarastoon(1.0);
        //System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]

        mehu.tulostaAnalyysi();*/
        
        Muutoshistoria m = new Muutoshistoria(); 
        m.lisaa(14.0); 
        m.lisaa(11.0);
        m.lisaa(8.0); 
        m.lisaa(9.0); 
        m.lisaa(19.0); 
        m.lisaa(-3.0); 
        m.lisaa(16.0); 
        m.lisaa(1.0); 
        m.lisaa(-9.0); 
        m.lisaa(8.0); 
        m.lisaa(1.0); 
        m.lisaa(1.0); 
        m.lisaa(4.0); 
        System.out.println(m);;
        
        double pienin = m.minArvo();
        System.out.println("Pienin " +pienin);
    }
}
