
public class Lintu {
    
    private String nimi;
    private String latinaNimi;
    private int havainto;
    
    public Lintu(String nimi, String latina){
        this.nimi = nimi;
        this.latinaNimi = latina;
        this.havainto = 0;
    }
    
    public void lisaaHavainto(){
        this.havainto += 1;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public String getLatinaNimi(){
        return this.latinaNimi;
    }
    
    public int getHavainnot(){
        return this.havainto;
    }
}
