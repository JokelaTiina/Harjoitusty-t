
public class Koira extends Elain implements Aanteleva {
    
    //private String nimi;
    
    public Koira(String nimi){
        super(nimi);
    }
    
    public Koira(){
        this("Koira");
    }
    
    @Override
    public void aantele(){
        this.hauku();
    }
    
    public void hauku(){
        System.out.println(this.getNimi() +" haukkuu");
    }
    
    @Override
    public void syo(){
        super.syo();
        System.out.println(" ja maiskuttaa");
    }
    
}
