import java.util.ArrayList;


public class Pisteet {
    
    private ArrayList<Integer> tulokset;
    private int hyvaksytytMaara;
    private int hyvaksytytSumma;
    private int lukumaara;
    private int summa;
    
    public Pisteet(){
        this.tulokset = new ArrayList<>();
        this.hyvaksytytMaara = 0;
        this.hyvaksytytSumma = 0;
        this.lukumaara = 0;
        this.summa = 0;
    } 
    
    public ArrayList<Integer> tulostaLista(){
        return this.tulokset;
    }
    
    public void lisaaPisteet(int piste){
        this.tulokset.add(piste);
        this.summa += piste;
        this.lukumaara++;
             
        if(piste >= 50){
            this.hyvaksytytMaara++;
            this.hyvaksytytSumma += piste;
        }
    }
    
    public double laskeKeskiarvot(){ 
        double keskiarvo = 1.0 * this.summa/this.lukumaara;
        return keskiarvo;
    }
    
    public double hyvaksyttyjenKeskiarvot(){
        double hyvaksytytKeskiarvo = 1.0 * this.hyvaksytytSumma/this.hyvaksytytMaara;
        return hyvaksytytKeskiarvo;
    }
    
    public double hyvaksyttyjenProsenttiosuus(){
        if(this.hyvaksytytMaara == 0){
            return 0.0;
        }
        System.out.println("hyväksyttyjen määrä " +this.hyvaksytytMaara);
        System.out.println("lukumaara " +this.lukumaara);
        double hyvaksymisProsentti = 1.0 * (100 * this.hyvaksytytMaara)/this.lukumaara;
        return hyvaksymisProsentti;
    }  
    
    public String toString(){
        return "Pisteiden keskiarvo (kaikki): " +this.laskeKeskiarvot()+"\n" +
               "Pisteiden keskiarvo (hyväksytyt): " +hyvaksytytMaara() +"\n" +
               "Hyväksymisprosentti: " +this.hyvaksyttyjenProsenttiosuus();
    }
    
    public String hyvaksytytMaara(){
        String ka = "";
        
        if(this.hyvaksytytMaara == 0){
            return "-";
        }
        
        ka = "" +this.hyvaksyttyjenKeskiarvot();
        return ka;
        
    }
    
}
