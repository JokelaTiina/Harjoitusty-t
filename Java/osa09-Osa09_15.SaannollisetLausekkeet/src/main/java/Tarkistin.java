

public class Tarkistin {
    
    //palauttaa true jos sen parametrina saama merkkijono on viikonpäivän lyhenne (ma, ti, ke, to, pe, la tai su).
    public boolean onViikonpaiva(String merkkijono){
        
        if(merkkijono.matches("ma|ti|ke|to|pe|la|su")){
            System.out.println("Muoto on oikea.");
            return true;
        }
        else{
            System.out.println("Muoto ei ole oikea.");
            return false;
        }      
    }
    
    //ovatko parametrina olevan merkkijonon kaikki merkit vokaaleja.
    public boolean kaikkiVokaaleja(String merkkijono){
        
        if(merkkijono.matches("[aeiouäö]*")){
            System.out.println("Muoto on oikea.");
            return true;
        }
        else{
            System.out.println("Muoto ei ole oikea.");
            return false;
        }    
    }
    
    //Onko merkkijono muotoa tt:mm:ss
    public boolean kellonaika(String merkkijono){
        if(merkkijono.matches("(24:00:00)||([2][0-3]|[0-1][0-9])(:[0-5][0-9]:[0-5][0-9])")){
            System.out.println("Muoto on oikea.");
            return true;
        }
        else{
            System.out.println("Muoto ei ole oikea.");
            return false;
        }    
    }
}
