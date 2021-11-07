
public class MuistavaTuotevarasto extends Tuotevarasto{
    
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo){
        super(tuotenimi, tilavuus);
        //Aseta alkusaldo sekä varaston alkusaldoksi että muutoshistorian ensimmäiseksi arvoksi
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
    }
    
    //palauttaa tuotehistorian
    public String historia(){
        return muutoshistoria.toString();        
    }
   
   //historiaan tulee kirjata lisäyksen jälkeinen varastosaldo, ei lisättävää määrää!
    public void lisaaVarastoon(double maara){
        double varastoSaldo = super.getSaldo() + maara;
        super.lisaaVarastoon(maara);        
        this.muutoshistoria.lisaa(varastoSaldo);
    }
    
    //historiaan tulee kirjata poiston jälkeinen varastosaldo, ei poistettavaa määrää!
    public double otaVarastosta(double maara){
        double varastoSaldo = super.getSaldo() - maara;
        this.muutoshistoria.lisaa(varastoSaldo);
        return super.otaVarastosta(maara);        
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: " +super.getNimi() +"\n" +"Historia: " +this.historia() 
            +"\n" +"Suurin tuotemäärä: " +this.muutoshistoria.maxArvo() +"\n"   +"Pienin tuotemäärä: " 
            +this.muutoshistoria.minArvo() +"\n" +"Keskiarvo: " +this.muutoshistoria.keskiarvo());        
    }
}
