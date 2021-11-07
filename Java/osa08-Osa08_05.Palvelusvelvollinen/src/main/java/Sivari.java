
public class Sivari implements Palvelusvelvollinen{
    
    private int paivia;
    
    public Sivari(){
        this.paivia = 362;
    }
      
    @Override
    public void palvele(){
        this.paivia -= 1;
        
        if(this.paivia < 0){
            this.paivia = 0;
        }
    }
    
    @Override
    public int paiviaJaljella(){
        return this.paivia;
    }
}
