import java.util.ArrayList;

public class Matkalaukku {
    private int paino;
    private ArrayList<Tavara> tavarat;         
    
    public Matkalaukku(int maksimipaino){
        this.paino = maksimipaino; 
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara){  
        int indeksi = 0;
        this.tavarat.add(tavara);
        
        while(indeksi < tavarat.size()){       
            int kokonaisPaino = this.yhteispaino();
                        
            if(kokonaisPaino > this.paino){
                this.tavarat.remove(tavara);               
            }
            indeksi++;
        }        
    }
    
    //tulostaa kaikki matkalaukussa olevat tavarat
    public void tulostaTavarat(){
        for(Tavara tavara : this.tavarat){
            System.out.println(tavara.getNimi() +" (" +tavara.getPaino()+"kg)");
        }        
    }
    
    //palauttaa tavaroiden yhteispainon
    public int yhteispaino(){
        int painoYhteensa = 0;
        
        for(Tavara tavara : this.tavarat){       
            painoYhteensa = painoYhteensa + tavara.getPaino();            
        } 
        return painoYhteensa;
    }
    
    public Tavara raskainTavara(){        
        if(this.tavarat.isEmpty()){
            return null;
        }
        
        Tavara painavinTavara = this.tavarat.get(0);
        int indeksi = 0;
        
        while(indeksi < this.tavarat.size()){
            if(painavinTavara.getPaino() < this.tavarat.get(indeksi).getPaino()){
                painavinTavara = this.tavarat.get(indeksi);                
            }
            indeksi++;
        }        
        return painavinTavara;
    }
    
    @Override
    public String toString(){
        int painoYhteensa;
                
        //for(Tavara tavara : this.tavarat){       
            //painoYhteensa = painoYhteensa + tavara.getPaino();            
        //} 
        
        painoYhteensa = this.yhteispaino();
        
        if(this.tavarat.isEmpty()){
            return "ei tavaroita (" +painoYhteensa +"kg)";
        }else if(this.tavarat.size() == 1){
            return this.tavarat.size() +" tavara (" +painoYhteensa +"kg)";
        }else{
            return this.tavarat.size() +" tavaraa (" +painoYhteensa +"kg)";
        }
        
    }
}
