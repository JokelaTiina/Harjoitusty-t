
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        // indeksit:   0  1  2  3  4  5  6
        //int[] luvut = {-1, 6, 9, 8, 12};
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(luvut));
        Paaohjelma.jarjesta(luvut);
                        
        System.out.println("Pienin: " + Paaohjelma.pienin(luvut));
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(luvut));        
        
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 0));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 1));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 5));        

        /*System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 1, 0);
        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 0, 3);
        System.out.println(Arrays.toString(luvut));*/
    }
    
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        int i = 1;
                
        while(i < taulukko.length){
            if(pienin > taulukko[i]){
                pienin = taulukko[i];
            }
            i++;           
        }
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pieninIndeksi = 0;
        int pienin = taulukko[0];
        int i = 1;
                
        while(i < taulukko.length){
            if(pienin > taulukko[i]){
                pienin = taulukko[i];
                pieninIndeksi = i;
            }
            i++;           
        }
        return pieninIndeksi;
    }
    
    //Metodille annetaan parametrina taulukon lisäksi aloitusindeksi, josta lähtien pienintä lukua etsitään.
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pieninIndeksi = aloitusIndeksi;
        int i = aloitusIndeksi;
        int pienin = taulukko[i];
                
        while(i < taulukko.length){
            if(pienin > taulukko[i]){
                pienin = taulukko[i];
                pieninIndeksi = i;
            }
            i++;           
        }
        return pieninIndeksi;
    }
    
    //annetaan taulukko ja kaksi sen indeksiä. Metodi vaihtaa indekseissä olevat luvut keskenään.
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int sailo = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = sailo;
    }
    
    public static void jarjesta(int[] taulukko) {
        int indeksi = 0;
        
        while(indeksi < taulukko.length){
            int pieninIndeksi = pienimmanIndeksiAlkaen(taulukko, indeksi);             
            if(taulukko[pieninIndeksi] < taulukko[indeksi]){
                vaihda(taulukko, indeksi, pieninIndeksi);
                System.out.println(Arrays.toString(taulukko));
            }             
            indeksi++;
        }
        
    }

}
