import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
        ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaHenkilot(henkilot);   
        
        System.out.println("");
        System.out.println("Uudet tyypit lisätään:" +"\n"); //Opettajan ja oppilaan omia metodeja ei voi käyttää, ainoastaan henkilön.
        
        Henkilo ope = new Opettaja("Leo", "Korsontie 1 03100 Tampere", 5400); 
        Henkilo opiskelija = new Opiskelija("Kaisa", "Ida Albergintie 1 00400 Ivalo");
        henkilot.add(ope);
        henkilot.add(opiskelija);
        
        tulostaHenkilot(henkilot); 
    }
    
    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot){
        for(Henkilo henkilo : henkilot){
            System.out.println(henkilo);
        }
    }  
}
