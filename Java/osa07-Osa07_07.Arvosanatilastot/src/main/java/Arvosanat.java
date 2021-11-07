
public class Arvosanat {
    
    private int hylatty;
    private int ykkonen;
    private int kakkonen;
    private int kolmonen;
    private int nelonen;
    private int vitonen;
    
    public Arvosanat(){
        this.hylatty = 0;
        this.ykkonen = 0;
        this.kakkonen = 0;
        this.kolmonen = 0;
        this.nelonen = 0;
        this.vitonen = 0;
    }
    
    public void pisteetTahdiksi(Pisteet tulokset){         
        //System.out.println(tulokset.tulostaLista());
       
        for(Integer piste : tulokset.tulostaLista()){
            //System.out.println(piste);
            if(piste > 0 && piste < 50){
                this.hylatty++;
            }else if(piste >= 50 && piste < 60){
                this.ykkonen++;
            }else if(piste >= 60 && piste < 70){
                this.kakkonen++;
            }else if(piste >= 70 && piste < 80){
                this.kolmonen++;
            }else if(piste >= 80 && piste < 90){
                this.nelonen++;
            }else if(piste >= 90 && piste < 100){
                this.vitonen++;
            }
        }        
    }
    
    public void arvosanajakauma(){
        System.out.print("5: "); 
        tulostaTahdet(this.vitonen);
        System.out.print("4: ");
        tulostaTahdet(this.nelonen);
        System.out.print("3: ");
        tulostaTahdet(this.kolmonen);
        System.out.print("2: ");
        tulostaTahdet(this.kakkonen);
        System.out.print("1: ");
        tulostaTahdet(this.ykkonen);
        System.out.print("0: "); 
        tulostaTahdet(this.hylatty);
    }
    
    public void tulostaTahdet(int arvosana){
        //System.out.println("Tähtien tulostuksessa ollaan... ja aevosana on " +arvosana);
        int i = 0;
        
        while(i < arvosana){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    
}
