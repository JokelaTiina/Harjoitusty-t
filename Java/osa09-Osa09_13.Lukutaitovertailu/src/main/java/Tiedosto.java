
public class Tiedosto {
    //sukupuoli, maa, vuosi, lukutaitoprosentti
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private String lukutaitoprosentti;
    
    public Tiedosto(String maa, int vuosi, String sukupuoli, String lukutaitoprosentti){
        this.maa = maa;
        this.vuosi = vuosi;
        this.sukupuoli = sukupuoli.substring(0, sukupuoli.length()-3).trim();
        this.lukutaitoprosentti = lukutaitoprosentti;
    }
    
    public String getLukutaitoprosentti(){
        return this.lukutaitoprosentti;
    }
    
    @Override
    public String toString(){
        return this.maa +" (" +this.vuosi +"), " +this.sukupuoli +", " +this.lukutaitoprosentti;
    }
}
