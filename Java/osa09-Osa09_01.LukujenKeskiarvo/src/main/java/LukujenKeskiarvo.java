
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        String syote;
        
        while (true) {
            syote = lukija.nextLine();

            if(syote.equals("loppu")){
                break;
            }
            
            syotteet.add(syote);
        }
        
        double keskiarvo = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("Lukujen keskiarvo: " +keskiarvo);
    }
}
