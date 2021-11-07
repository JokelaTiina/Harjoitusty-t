import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        
        ArrayList<Tiedosto> lukutaitoSorttaus = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length >= 6)            
                    .map(palat -> new Tiedosto(palat[3].trim(), Integer.valueOf(palat[4].trim()), palat[2].trim(), palat[5].trim()))
                    .forEach(tiedosto -> lukutaitoSorttaus.add(tiedosto));
                    
            //lukutaitoSorttaus.stream().forEach(h -> System.out.println(h.getLukutaitoprosentti()));
            lukutaitoSorttaus.stream()
                   .sorted((t1, t2) -> {
                        return t1.getLukutaitoprosentti().compareTo(t2.getLukutaitoprosentti());    
                    })
                    .forEach(rivi -> System.out.println(rivi));
                    
                    
                //    .sorted((rivit, rivit) -> {
               // return rivit.get(3).compareTo(rivit.get(3));});
            //Collections.sort(rivit);
            //System.out.println("Kolmos-palasen sisältö " +rivit.get(3));  
            
                //.sorted((rivit1, rivit2) -> {
                //return rivit.get(3).compareTo(rivit.get(3));})
                //.forEach(rivi -> System.out.println(rivi));
                    //
        }catch(Exception e){
            System.out.println("Virhe " +e.getMessage());
        }

    }
}
