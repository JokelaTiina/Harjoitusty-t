
/*
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
    }

}*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(taulukko));
        jarjesta(taulukko);        
        
        String[] merkkijonotaulukko = {"b", "d", "a", "e", "c", "h" };
        System.out.println(Arrays.toString(merkkijonotaulukko));
        jarjesta(merkkijonotaulukko);        
        
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(5);
        luvut.add(3);
        luvut.add(4);
        luvut.add(8);
        luvut.add(2);
        luvut.add(1);
        System.out.println(luvut);
        jarjestaLuvut(luvut);
                
        ArrayList<String> merkkijonot = new ArrayList<>();
        merkkijonot.add("5");
        merkkijonot.add("3");
        merkkijonot.add("4");
        merkkijonot.add("8");
        merkkijonot.add("2");
        merkkijonot.add("1");
        System.out.println(merkkijonot);
        jarjestaMerkkijonot(merkkijonot);        
    }
    
    //järjestää kokonaislukutaulukon
    public static void jarjesta(int[] taulukko){
        Arrays.sort(taulukko);
        System.out.println(Arrays.toString(taulukko));
        System.out.println("");
    }
    
    //järjestää merkkijonotaulukon
    public static void jarjesta(String[] taulukko){
        Arrays.sort(taulukko);
        System.out.println(Arrays.toString(taulukko));
        System.out.println("");
    }
    
    //järjestää lukuja sisältävän listan
    public static void jarjestaLuvut(ArrayList<Integer> luvut){
        Collections.sort(luvut);
        System.out.println(luvut);
        System.out.println("");
    }
    
    //järjestää merkkijonoja sisältävän listan
    public static void jarjestaMerkkijonot(ArrayList<String> luvut){
        Collections.sort(luvut);
        System.out.println(luvut);
        System.out.println("");
    }
}
