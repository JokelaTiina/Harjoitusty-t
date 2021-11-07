import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tyontekijat {
    
    List<Henkilo> henkilot;
    
    public Tyontekijat(){
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava){
        this.henkilot.add(lisattava);
    }
    
    //lisää parametrina olevan listan henkilöitä työntekijöiksi
    public void lisaa(List<Henkilo> lisattavat){
        
        for(Henkilo lisattava : lisattavat){
            this.henkilot.add(lisattava);
        }        
    }
    
    //tulostaa kaikki työntekijät iteraattoria käyttäen
    public void tulosta(){
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        
        while(iteraattori.hasNext()){
            System.out.println(iteraattori.next());
        }
    }
    
    // tulostaa työntekijät joiden koulutus on sama kuin parametrissa määritelty koulutus
    public void tulosta(Koulutus koulutus){
        
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        
        while(iteraattori.hasNext()){
            
            Henkilo seuraavanaVuorossa = iteraattori.next();
                       
            if(seuraavanaVuorossa.getKoulutus() == koulutus){
                System.out.println(seuraavanaVuorossa);;
            }
        }
    }
    
    //poistaa Työntekijöiden joukosta kaikki henkilöt joiden koulutus on sama kuin 
    //metodin parametrina annettu
    public void irtisano(Koulutus koulutus){
        
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        
        while(iteraattori.hasNext()){
            if(iteraattori.next().getKoulutus() == koulutus){
                iteraattori.remove();;
            }            
        }
    }
}
