import java.util.ArrayList;

public class Laatikko implements Talletettava{
    
    private double maksimipaino;
    private ArrayList<Talletettava> laatikossa;
    
    public Laatikko(double maksimipaino){
        this.maksimipaino = maksimipaino;
        this.laatikossa = new ArrayList<>();
    }
    
    // Laatikkoon ei saa lisätä enempää tavaraa kuin sen maksimikapasiteetti määrää. 
    public void lisaa(Talletettava talletettava){
        
        double tavaroidenpaino = 0.0;
        this.laatikossa.add(talletettava);
        
        tavaroidenpaino = paino();
        
        if(tavaroidenpaino > this.maksimipaino){
            
            this.laatikossa.remove(this.laatikossa.size()-1);
        }
    }
    
    public double paino(){
        
        double yhteispaino = 0.0; 
        
        for(Talletettava sisalto : this.laatikossa){
            yhteispaino += sisalto.paino();
        }        
        return yhteispaino;
    }
    
    @Override
    public String toString(){
        return "Laatikko: " +this.laatikossa.size() +" esinettä, paino yhteensä " +this.paino() +" kiloa";
    }
}
