import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        String nimi;
        int ika;
        int kpl = 0;

        while (true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            nimi = lukija.nextLine();
            
            if(nimi.equals("")){
                break;
            }else{
                System.out.print("Syötä kirjan pienin kohdeikä: ");
                ika = Integer.valueOf(lukija.nextLine());
                kirjat.add(new Kirja(nimi, ika));
                kpl++;
                System.out.println("");
            }            
        }
        System.out.println("");
        System.out.println("Yhteensä " + kpl + " kirjaa");
        System.out.println("");

        System.out.println("Kirjat:");
        
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getKohdeika)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, vertailija);
        
        for(Kirja kirja : kirjat){
            System.out.println(kirja);
        }

    }

}
