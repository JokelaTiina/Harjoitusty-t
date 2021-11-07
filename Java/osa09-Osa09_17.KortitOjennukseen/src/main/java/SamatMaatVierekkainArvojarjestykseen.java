
import java.util.Comparator;

public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {
    
    //saman maan kortit vierekkäin vievän järjestyksen määrittelevä luokka,
    //sekä saman maan kortit järjestyvät arvon mukaisesti.
    @Override
    public int compare(Kortti k1, Kortti k2) {        
        
        if(k1.getMaa().ordinal() == k2.getMaa().ordinal()){
            return k1.getArvo() - k2.getArvo();
        }else{
            return k1.getMaa().ordinal() - k2.getMaa().ordinal();
        }  
    }
}
