
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {       
        
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mistä luetaan? "); 
        String tiedosto = lukija.nextLine();
        
        System.out.println("\n" +"Komennot:" +"\n" +"listaa - listaa reseptit" +"\n" 
                +"lopeta - lopettaa ohjelman" +"\n" +"hae nimi - hakee reseptiä nimen perusteella" 
                +"\n" +"hae keittoaika - hakee reseptiä keittoajan perusteella" +"\n"
                +"hae aine - hakee reseptiä raaka-aineen perusteella" +"\n");
        
        while(true){
            
            System.out.println("");
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();            
        
                if(komento.equals("lopeta")){
                    break;
                }
                else if(komento.equals("listaa")){
                    listaus(tiedosto);
                }else if(komento.equals("hae nimi")){
                    System.out.print("Mitä haetaan? ");
                    String haettava = lukija.nextLine();
                    haeNimella(tiedosto, haettava);
                }else if(komento.equals("hae keittoaika")){
                    System.out.print("Keittoaika korkeintaan: ");
                    int aika = Integer.valueOf(lukija.nextLine());
                    hakuKeittoajalla(tiedosto, aika);
                }else if(komento.equals("hae aine")){
                    System.out.print("Mitä raaka-ainetta haetaan: ");
                    String haettavaAine = lukija.nextLine();
                    haeAine(tiedosto, haettavaAine);
                }
        }        
    }
    
    static void listaus(String tiedosto){
        ArrayList<String> rivit = new ArrayList<>();
        int i = 0;
         
        try(Scanner tiedostonlukija = new Scanner(new File(tiedosto))){
            while(tiedostonlukija.hasNextLine()){
                String rivi = tiedostonlukija.nextLine();
                rivit.add(rivi);
            }
        }catch(Exception e){
            System.out.println("Virhe: " +e.getMessage());
        }
        
        System.out.println("");
        System.out.println("Reseptit:");              
        System.out.print(rivit.get(i) +", keittoaika: "); //
        System.out.println(rivit.get(i+1));
               
        while(i < rivit.size()){
            if(rivit.get(i).equals("")){
                System.out.print(rivit.get(i+1) +", keittoaika: "); //
                System.out.println(rivit.get(i+2));                   
            }               
            i++;
        }       
    }
        
    static void haeNimella(String tiedosto, String haettava){ 
        
        ArrayList<String> rivit = new ArrayList<>();
        
        try(Scanner tiedostonlukija = new Scanner(new File(tiedosto))){
            while(tiedostonlukija.hasNextLine()){
                String rivi = tiedostonlukija.nextLine();
                rivit.add(rivi);
            }
        }catch(Exception e){
            System.out.println("Virhe: " +e.getMessage());
        }           
        
        int i = 0;            
        System.out.println("");
        System.out.println("Reseptit:");
        
        if(rivit.get(0).contains(haettava)){
            System.out.print(rivit.get(0));
            System.out.println(", keittoaika: " +rivit.get(1));
        }
            
        while(i < rivit.size()){      
                
            if(rivit.get(i).equals("")){
                if(rivit.get(i+1).contains(haettava)){
                   System.out.print(rivit.get(i+1));
                   System.out.println(", keittoaika: " +rivit.get(i+2));
                }
            }           
            i++;
        }        
    }
        
    static void hakuKeittoajalla(String tiedosto, int aika){
       
        ArrayList<String> rivit = new ArrayList<>();
        int i = 0;
            
        try(Scanner tiedostonlukija = new Scanner(new File(tiedosto))){
            while(tiedostonlukija.hasNextLine()){
                String rivi = tiedostonlukija.nextLine();
                rivit.add(rivi);
            }
        }catch(Exception e){
            System.out.println("Virhe: " +e.getMessage());
        }       
        
        System.out.println("");
        System.out.println("Reseptit:");   
        int MuunnosKokonaisluvuksi = Integer.valueOf(rivit.get(1));
        
        if(MuunnosKokonaisluvuksi <= aika){ 
            System.out.print(rivit.get(0));
            System.out.println(", keittoaika: " +rivit.get(1));
        }
        
        while(i < rivit.size()){ 
            
            if(rivit.get(i).equals("")){
                int MuunnosKokonaisluvuksi2 = Integer.valueOf(rivit.get(i+2));
                
                if(MuunnosKokonaisluvuksi2 <= aika){ 
                   System.out.print(rivit.get(i+1));
                   System.out.println(", keittoaika: " +rivit.get(i+2));
                }
            }
            i++;
        }        
    }

    static void haeAine(String tiedosto, String haettavaAine){
        ArrayList<String> rivit = new ArrayList<>();
        
        System.out.println("");
        System.out.println("Reseptit:");
            
        try(Scanner tiedostonlukija = new Scanner(new File(tiedosto))){
            while(tiedostonlukija.hasNextLine()){
                String rivi = tiedostonlukija.nextLine(); 
                 
                if(rivi.trim().length() == 0 || !tiedostonlukija.hasNextLine() ){        // rivi.equals("") || !tiedostonlukija.hasNextLine() //kumpikin käy
                    for(String tulostus : rivit){                        
                        if(tulostus.equals(haettavaAine)){
                            //System.out.println("löytyi");
                            System.out.print(rivit.get(0));
                            System.out.println(", keittoaika: " +rivit.get(1));
                        }                    
                    }
                    //System.out.println("tyhjennetään taulukko");
                    rivit.removeAll(rivit);                
                }else if(!(rivi.equals(""))){
                    //System.out.println("lisätään " +rivi);
                    rivit.add(rivi);                     
                }     
            }
        }catch(Exception e){
            System.out.println("Virhe: " +e.getMessage());
        }      
    }
}


