import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kasi implements Comparable<Kasi>{
    
    private List<Kortti> kortit;
    
    public Kasi(){
        this.kortit = new ArrayList<>();
    }
    //lisää käteen kortin
    public void lisaa(Kortti kortti){
        this.kortit.add(kortti);
    }
    
    public void tulosta(){
        for(Kortti kortti : this.kortit){
            System.out.println(kortti);
        }
    }
    
    public void jarjesta(){
        Collections.sort(kortit);
    }
    
    @Override
    public int compareTo(Kasi kasi){
        
        int summa1 = 0;
        int summa2 = 0;

        for(Kortti kortti : this.kortit){
            summa1 = summa1 + kortti.getArvo();
        }
        
        for(Kortti kortti : kasi.kortit){
            summa2 = summa2 + kortti.getArvo();
        }
        
        if(summa1 == summa2){
            return 0;
        }else if(summa1 > summa2){
            return 1;
        }else {
            return -1;
        }        
    }
    
    public void jarjestaMaittain(){
        SamatMaatVierekkainArvojarjestykseen jarjestaminen = new SamatMaatVierekkainArvojarjestykseen();
        
        Collections.sort(kortit, jarjestaminen);
    }
}
