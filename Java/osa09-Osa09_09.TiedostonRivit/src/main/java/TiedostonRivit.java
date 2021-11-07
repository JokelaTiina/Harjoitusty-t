
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TiedostonRivit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        
        List<String> tiedostonrivit = lue("reseptit.txt");
        
        for(String rivi : tiedostonrivit){
            System.out.println(rivi);
        }
    }
    
    public static List<String> lue(String tiedosto){
        
        List<String> luettu = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(tiedosto)).forEach(rivi -> luettu.add(rivi));            
        }catch(Exception e){
            System.out.println("Virhe: " +e.getMessage());
        }
        
        return luettu;
    }

}
