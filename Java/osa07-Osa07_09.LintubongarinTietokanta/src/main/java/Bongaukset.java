
import java.util.ArrayList;

public class Bongaukset {    
    
    public static void lisaaHavainto(ArrayList<Lintu> bongattu, String havaittu){
        boolean sisaltyykoListaan = false;
        
        for(Lintu lintu : bongattu){
            if(lintu.getNimi().equals(havaittu)){
                sisaltyykoListaan = true;
                lintu.lisaaHavainto();                
            }
        }
        
        if(sisaltyykoListaan == false){
            System.out.println("Ei ole lintu!");
        }
    }
    
    public static void naytaLintu(ArrayList<Lintu> bongattu, String naytettava){
        for(Lintu lintu : bongattu){
            if(lintu.getNimi().equals(naytettava)){
                System.out.println(lintu.getNimi() +" (" +lintu.getLatinaNimi() +"): " +lintu.getHavainnot() +" havaintoa");
            }
        }        
    }    
    
    public static void tilasto(ArrayList<Lintu> bongattu){ 
        String linnutMerkkijonona = "";
        
        for(Lintu lintu : bongattu){
            linnutMerkkijonona = linnutMerkkijonona +lintu.getNimi() +" (" +lintu.getLatinaNimi() +"): " +lintu.getHavainnot() +" havaintoa" +"\n";
        }
        System.out.println(linnutMerkkijonona);
    }
}
