
import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {
    
    private int maksimipaino;
    private ArrayList<Tavara> laatikonsisalto;
    
    public MaksimipainollinenLaatikko(int maksimipaino){
       this.maksimipaino = maksimipaino; 
       this.laatikonsisalto = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara){
        int kokonaispaino = 0;
        this.laatikonsisalto.add(tavara);
                
        for (Tavara sisalto : this.laatikonsisalto) {            
            kokonaispaino += sisalto.getPaino();                            
        }  
        
        if(kokonaispaino > this.maksimipaino){                
                this.laatikonsisalto.remove(this.laatikonsisalto.size()-1);
        } 
    }    
      
    @Override
    public boolean onkoLaatikossa(Tavara tavara){
        
        boolean onko = false;
        
        for (Tavara sisalto : this.laatikonsisalto) {
            
            if(sisalto.equals(tavara)){
                onko = true;
            }
        }        
        return onko;
    }
}
