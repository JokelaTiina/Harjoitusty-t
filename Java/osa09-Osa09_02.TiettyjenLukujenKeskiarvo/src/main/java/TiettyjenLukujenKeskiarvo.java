
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        String syote;
        double keskiarvo;
        
        while (true) {
            syote = lukija.nextLine();

            if(syote.equals("loppu")){
                break;
            }
            
            syotteet.add(syote);
        }
        
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String vastaus = lukija.nextLine();
        
        if(vastaus.equals("n")){
            keskiarvo = syotteet.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku < 0)
                    .average()
                    .getAsDouble();
        
            System.out.println("Negatiivisten lukujen keskiarvo: " +keskiarvo);
        }else{
            keskiarvo = syotteet.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku >= 0)
                    .average()
                    .getAsDouble();
        
            System.out.println("Positiivisten lukujen keskiarvo: " +keskiarvo);
        }     
        
    }
}
