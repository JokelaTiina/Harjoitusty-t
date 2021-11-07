import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {
    
    private Map<String, Integer> tuotteet;
    private Map<String, Integer> varastosaldot;
    
    public Varasto(){
        this.tuotteet = new HashMap<>();
        this.varastosaldot = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        this.tuotteet.put(tuote, hinta);
        this.varastosaldot.put(tuote, saldo);
    }
    
    //palauttaa parametrina olevan tuotteen hinnan, jos tuotetta ei ole varastossa, palauttaa metodi arvon -99
    public int hinta(String tuote){
        
        int hinta = 0;
        
        if(this.tuotteet.get(tuote) == null){
            hinta = -99;
        }else{
            hinta = this.tuotteet.get(tuote);
        }
        
        return hinta;
    }
    
    //palauttaa parametrina olevan tuotteen varastosaldon. Jos tuotetta ei ole varastossa lainkaan, tulee palauttaa 0.
    public int saldo(String tuote){
        int saldo;
                
        if(this.varastosaldot.get(tuote) == null){
            saldo = 0;
        } else {
            saldo = this.varastosaldot.get(tuote);
        }        
        return saldo;
    }
    
    //vähentää parametrina olevan tuotteen saldoa yhdellä ja palauttaa true jos tuotetta oli varastossa. 
    //Jos tuotetta ei ole varastossa, palauttaa metodi false, tuotteen saldo ei saa laskea alle nollan.
    public boolean ota(String tuote){
        
        if(  this.varastosaldot.get(tuote) == null || this.varastosaldot.get(tuote) == 0){
            return false;
        }else{
            int saldo = this.varastosaldot.get(tuote);
            this.varastosaldot.put(tuote, saldo-1);
            return true;
        }        
    }
    
    
    public Set<String> tuotteet(){
        return this.tuotteet.keySet();
    }
    
}
