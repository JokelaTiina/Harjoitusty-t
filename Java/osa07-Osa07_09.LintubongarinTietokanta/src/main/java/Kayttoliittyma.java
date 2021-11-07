
import java.util.ArrayList;
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private ArrayList<Lintu> bongatut;
    
    public Kayttoliittyma(Scanner lukija){
       this.lukija = lukija;
       this.bongatut = new ArrayList<>();
    }
    
    public void kaynnista(){
        lueBongaukset();
    }
    
    public void lueBongaukset(){
        while(true){
            System.out.print("? ");
            String syote = lukija.nextLine();
            
            if(syote.equals("Lopeta")){
                //System.out.println("Kiitos ja näkemiin");
                break;
            }else if(syote.equals("Lisaa")){                    
                //Luodaan uusi lintu-olio, ja liitetään se ArrayListaan
                System.out.print("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Latinankielinen nimi: ");
                String latinaNimi = lukija.nextLine();
                bongatut.add(new Lintu(nimi, latinaNimi));
                    
            }else if(syote.equals("Havainto")){
                System.out.print("Mikä havaittu? ");
                String havaittu = lukija.nextLine();
                Bongaukset.lisaaHavainto(this.bongatut, havaittu);                
                
            }else if(syote.equals("Nayta")){
                System.out.print("Mikä? ");
                String nayta = lukija.nextLine();
                Bongaukset.naytaLintu(this.bongatut,nayta);
                
            }else if(syote.equals("Tilasto")){                
                Bongaukset.tilasto(this.bongatut);                
            }          
        }
    }
    
}
