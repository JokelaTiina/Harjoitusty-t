
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pisteet koetulokset = new Pisteet();
        
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        
        while(true){
            int syote = Integer.valueOf(lukija.nextLine());
            
            if(syote == -1){                 
                break;
            }else if((syote < 0 || syote >100)){
                System.out.println("Luvut väliltä [0-100] ovat hyväksyttäviä.");                
            }else{
                koetulokset.lisaaPisteet(syote);                
            }
        }
        
        koetulokset.laskeKeskiarvot();
        koetulokset.hyvaksyttyjenKeskiarvot();
        System.out.println(koetulokset);
           
        Arvosanat arvosanat = new Arvosanat();
        arvosanat.pisteetTahdiksi(koetulokset);
        System.out.println();
        arvosanat.arvosanajakauma();             
    }
}
