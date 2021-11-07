import java.util.ArrayList;

public class Lastiruuma {
    
    private int maksimipaino;
    private ArrayList<Matkalaukku> lastiruuma;
        
    public Lastiruuma(int maksimipaino){
        this.maksimipaino = maksimipaino; 
        this.lastiruuma = new ArrayList<>();
    }
    
    //lisää parametrina annetun matkalaukun lastiruumaan. Tulee valvoa, että sen 
    //sisältämien matkalaukkujen yhteispaino ei ylitä maksimipainoa. Jos maksimipaino 
    //ylittyisi uuden matkalaukun vuoksi, metodi lisaaMatkalaukku ei saa lisätä uutta matkalaukkua.
    public void lisaaMatkalaukku(Matkalaukku laukku){         
        int ruumanPaino = 0;
        this.lastiruuma.add(laukku);
        
        for(Matkalaukku laukunSisalto : this.lastiruuma){
            ruumanPaino += laukunSisalto.yhteispaino();            
        }
        
        if(this.maksimipaino < ruumanPaino){
            this.lastiruuma.remove(laukku);
        }
        
    }
    
    //tulostaa kaikki lastiruuman matkalaukuissa olevat tavarat.
    public void tulostaTavarat(){
        for(Matkalaukku laukku : this.lastiruuma){   
            laukku.tulostaTavarat();                           
        }
    }
    
    //palauttaa merkkijonon muotoa "x matkalaukkua (y kg)"
    public String toString(){
        int laukunPaino = 0;
        
        for(Matkalaukku laukku : this.lastiruuma){
            laukunPaino += laukku.yhteispaino();
        }
        return this.lastiruuma.size() +" matkalaukkua (" +laukunPaino +"kg)";
    }
}
