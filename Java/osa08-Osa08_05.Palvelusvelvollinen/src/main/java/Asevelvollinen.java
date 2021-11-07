
public class Asevelvollinen implements Palvelusvelvollinen {
    
    private int paivia;
    
    public Asevelvollinen(int paivia){
        this.paivia = paivia;
    }
    
    @Override
    public int paiviaJaljella(){
        return this.paivia;
    }
    
    @Override
    public void palvele(){
        this.paivia -= 1;
        
        if(this.paivia < 0){
            this.paivia = 0;
        }
    }
    
}
