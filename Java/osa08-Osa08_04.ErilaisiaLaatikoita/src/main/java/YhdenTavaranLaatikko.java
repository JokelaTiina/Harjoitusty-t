
import java.util.ArrayList;


public class YhdenTavaranLaatikko extends Laatikko {
    
    private ArrayList<Tavara> yksiSisalto;
    
    public YhdenTavaranLaatikko(){
        this.yksiSisalto = new ArrayList<>();
    }
    
    public void lisaa(Tavara tavara){
        int listankoko = this.yksiSisalto.size();
        
        if(listankoko < 1){
            this.yksiSisalto.add(tavara);
        }
    }
    
    public boolean onkoLaatikossa(Tavara tavara){
        boolean onko = false;
        
        for (Tavara sisalto : this.yksiSisalto) {
            
            if(sisalto.equals(tavara)){
                onko = true;
            }
        }        
        return onko;
    }
    
}
