import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> syotteet = new ArrayList<>();
        int syote;
        
        System.out.println("Syötä lukuja, negatiivinen lopettaa");
        
        while(true){
            syote = Integer.valueOf(lukija.nextLine());
            
            if(syote < 0){
                break;
            }else{
                syotteet.add(syote);
            }
        }
        
        syotteet.stream()
                .filter(luku -> luku > 0 && luku < 6)
                .forEach(luku -> System.out.println(luku));                
    }
}
