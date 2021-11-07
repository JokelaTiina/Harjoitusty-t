
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä 
        List<Kirja> luetut = lueKirjat("kirjat.txt");
        
        luetut.stream()
                //.forEach(rivi -> System.out.println(rivi)); 
                //Yritä tulostaa vielä get.nimi jne
                //.map(nimi -> nimi.getNimi())
                .forEach(n -> System.out.println(n.getNimi() +", " +n.getJulkaisuvuosi()));
    }
    
    public static List<Kirja> lueKirjat(String tiedosto){
        
        List<Kirja> luetutKirjat = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(tiedosto))    // luetaan tiedosto riveittäin
                    .map(rivi -> rivi.split(","))   // pilkotaan rivi osiin ","-merkin kohdalta
                    .filter(palat -> palat.length >= 4)    // poistetaan ne pilkotut rivit, joissa alle 2 osaa     
                    .map(palat -> new Kirja(palat[0], Integer.valueOf(palat[1]), Integer.valueOf(palat[2]), palat[3]))  // luodaan palojen perusteella kirjoja
                    .forEach(kirja -> luetutKirjat.add(kirja));     // ja lisätään kirjat lopulta listalle
        }catch(Exception e){
            System.out.println("Virhe: " +e.getMessage());
        }
        
        
        return luetutKirjat;
    }

}
