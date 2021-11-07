import java.util.ArrayList;

public class Muutoshistoria {
    
    private ArrayList<Double> muutokset;
    
    //luo tyhjän muutoshistoria-olion
    public Muutoshistoria(){
        this.muutokset = new ArrayList<>();        
    }
    
    //lisää muutoshistorian viimeisimmäksi muistettavaksi määräksi parametrina annetun tilanteen
    public void lisaa(double tilanne){
        this.muutokset.add(tilanne);
    }
    
    //tyhjää muistin
    public void nollaa(){
        this.muutokset.clear();
    }
    
    //ArrayList-luokan antama merkkijonoesitys sellaisenaan
    @Override
    public String toString(){
        return this.muutokset.toString();
    }
    
    //palauttaa muutoshistorian suurimman arvon tai nollan.
    public double maxArvo(){
        
        double arvo = 0;
        
        for(double muutos: this.muutokset){
            
            if(muutos > arvo){
                arvo = muutos;
            }            
        }
        
        //System.out.println("Listan suurin arvo on " +arvo);
        return arvo;
    }
    
    //palauttaa muutoshistorian pienimmän arvon tai nollan.
    public double minArvo(){
        
        int i = 1;
        double arvo = this.muutokset.get(i-1);
        
        while(i < this.muutokset.size()){
            System.out.println("Arvo " +i +": " +this.muutokset.get(i));
            if(this.muutokset.get(i) < this.muutokset.get(i-1) && this.muutokset.get(i) < arvo ){
                arvo = this.muutokset.get(i);
                System.out.println("Pienin on nyt " +arvo);
            }
            i++; 
        }
        return arvo;
    }
    
    //palauttaa muutoshistorian arvojen keskiarvon tai nollan
    public double keskiarvo(){
        
        int koko = this.muutokset.size();
        double summa = 0;
        int i = 0;
        double keskiarvo = 0;
        
        while(i < this.muutokset.size()){
            summa += this.muutokset.get(i);
            i++;
        }
        keskiarvo = summa/koko;
        
        return keskiarvo;
    }
}
