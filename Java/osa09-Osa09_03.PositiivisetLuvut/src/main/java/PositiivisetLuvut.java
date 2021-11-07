
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        List<Integer> syotteet = new ArrayList<>();        
        
        System.out.println("Anna lukuja");
        int syote;
        int i = 0;
        
        while (i < 5) {
            syote = Integer.valueOf(lukija.nextLine());           
            syotteet.add(syote);
            i++;           
        }
        
        List<Integer> positiivisetLuvut = new ArrayList<>();
        positiivisetLuvut = positiiviset(syotteet);
        
        System.out.println("\n Antamistasi luvuista positiivisia olivat:");
        
        /*for(int luku : positiivisetLuvut){
            System.out.println(luku);
        }*/
        
        System.out.println(positiivisetLuvut);
    }
    
    public static List<Integer> positiiviset(List<Integer> luvut){
        
        /*ArrayList<Integer> positiiviset = luvut.stream()
                .filter(luku -> luku >= 0)
                .collect(Collectors.toCollection(ArrayList::new));*/
        
        List<Integer> positiiviset = luvut.stream()
                .filter(luku -> luku >= 0)
                .collect(Collectors.toList());
                
        return positiiviset;
    }
}
