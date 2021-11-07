
import java.util.ArrayList;


public class HukkaavaLaatikko extends Laatikko {
    
    private ArrayList<Tavara> hukkunutSisalto;
    
    public HukkaavaLaatikko(){
        this.hukkunutSisalto = new ArrayList<>();
    }
    
    public void lisaa(Tavara tavara){
        this.hukkunutSisalto.add(tavara);
        hukataan();
    }
    
    public void hukataan(){
        this.hukkunutSisalto.clear();
    }
    
    public boolean onkoLaatikossa(Tavara tavara){
        boolean onko = false;
        
        for (Tavara sisalto : this.hukkunutSisalto) {
            
            if(sisalto.equals(tavara)){
                onko = true;
            }
        }        
        return onko;
    }
}
