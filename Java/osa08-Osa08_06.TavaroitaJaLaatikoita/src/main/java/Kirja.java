
public class Kirja implements Talletettava{
    
    private String kirjoittaja;
    private String nimi;
    private double paino;
    
    public Kirja(String kirjoittaja, String nimi, double paino){
        this.kirjoittaja = kirjoittaja;
        this.nimi = nimi;
        this.paino = paino;
    } 
    
    public String getNimi(){
        return this.nimi;
    }
     
    @Override
    public double paino(){
        return this.paino;
    }
    
    @Override
    public String toString(){
        return this.kirjoittaja +": " + this.nimi +", ja nimi uudestaan: " +this.getNimi();
    }
}
