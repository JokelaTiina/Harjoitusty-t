
public class Kissa extends Elain implements Aanteleva{
    
    public Kissa(String nimi){
        super(nimi);
    }
    
    public Kissa(){
        this("Kissa");
    }
    
    @Override
    public void aantele(){
        this.mourua();
    }
    
    public void mourua(){
        System.out.println(this.getNimi() +" mouruaa");
    }  
    
}
