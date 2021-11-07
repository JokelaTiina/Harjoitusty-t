import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja  
        Scanner lukija = new Scanner(System.in);
        
        /*
        Tarkistin viikonpaiva = new Tarkistin();
        System.out.print("Anna merkkijono: ");
        String syote = lukija.nextLine();
        viikonpaiva.onViikonpaiva(syote);          
        
        Tarkistin tarkistettava = new Tarkistin();        
        System.out.print("Anna tarkistettava merkkijono: ");
        String syote2 = lukija.nextLine();
        tarkistettava.kaikkiVokaaleja(syote2);*/
        
        Tarkistin kellonaika = new Tarkistin();
        System.out.print("Anna tarkistettava kellonaika: ");
        String syote3 = lukija.nextLine();
        kellonaika.kellonaika(syote3);
    }
}
