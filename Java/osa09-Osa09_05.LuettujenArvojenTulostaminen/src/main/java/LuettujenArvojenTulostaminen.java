import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();
        String syote;
        
        System.out.println("Anna merkkijono, tyhjä merkkijono lopettaa");
                
        while(true){
            syote = lukija.nextLine();
            
            if(syote.equals("")){
                break;
            }else{
                syotteet.add(syote);
            }
        }
        
        String mjono = syotteet.stream()
                .reduce("", (edellinen, sana) -> (edellinen + sana +"\n"));
                
        System.out.println(mjono);
    }
}
