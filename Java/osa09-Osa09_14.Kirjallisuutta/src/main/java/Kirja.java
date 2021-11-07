
public class Kirja {
    
    private String nimi;
    private int kohdeika;
    
    public Kirja(String nimi, int kohdeika){
        this.nimi = nimi;
        this.kohdeika = kohdeika;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getKohdeika(){
        return this.kohdeika;
    }
    
    @Override
    public String toString(){
        return this.nimi +" (" +this.kohdeika +" vuotiaille ja vanhemmille)";
    }
}
