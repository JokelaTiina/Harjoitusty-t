
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);               
        Kayttoliittyma kali = new Kayttoliittyma(lukija);
        kali.kaynnista();
    }

}
