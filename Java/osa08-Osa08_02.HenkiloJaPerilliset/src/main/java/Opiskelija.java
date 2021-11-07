
public class Opiskelija extends Henkilo{
    
    private int opintopisteet;
    
    public Opiskelija(String nimi, String osoite){
        super(nimi, osoite);
        this.opintopisteet = 0;
    }
    
    public int opintopisteita(){
        return this.opintopisteet;
    }
    
    public void opiskele(){
        this.opintopisteet += 1;
    }
    
    @Override
    public String toString(){
        return super.toString() +"\n" +"  " +"opintopisteitä " +this.opintopisteet;
    }
}
