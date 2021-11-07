import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava{
    
    private List<Siirrettava> siirrettavat;
    
    public Lauma(){
        this.siirrettavat = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava){
        this.siirrettavat.add(siirrettava);
    }
    
    //Siirtää laumaa parametrina saatujen arvojen verran. Huomaa että tässä sinun 
    //tulee siirtää jokaista lauman jäsentä.
    @Override
    public void siirra(int dx, int dy){
        for(Siirrettava elukka : this.siirrettavat){
            elukka.siirra(dx, dy);
        }
    }
    
    //Palauttaa merkkijonoesityksen lauman jäsenten sijainnista rivin vaihdolla erotettuna
    @Override
    public String toString(){
                
        String tulostus = "";
        
        for(Siirrettava elukka : this.siirrettavat){
            tulostus += elukka.toString() +"\n";
        }
        return tulostus;
    }
    
}
