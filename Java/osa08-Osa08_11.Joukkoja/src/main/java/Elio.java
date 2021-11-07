
public class Elio implements Siirrettava {
    
    private int x;
    private int y;
    
    public Elio(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "x: " +this.x +"; y: " +this.y;
    }
            
    //Esimerkiksi jos muuttujan dx arvo on 5, tulee oliomuuttujan x arvoa kasvattaa viidellä
    @Override
    public void siirra(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
}
