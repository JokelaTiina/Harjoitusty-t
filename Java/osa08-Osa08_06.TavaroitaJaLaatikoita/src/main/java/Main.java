
public class Main {

    public static void main(String[] args) {
        Laatikko laatikko = new Laatikko(10);

        laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2));
        laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));

        laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));
        laatikko.lisaa(new CDLevy("Dingo", "Nimeni on Dingo", 1987));

        System.out.println(laatikko);
      
        Laatikko laakotti = new Laatikko(5);
        
        laakotti.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        laakotti.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));
        laakotti.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        laakotti.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        
        System.out.println(laakotti);
        
        laatikko.lisaa(laakotti);
        System.out.println(laatikko);
        
        Kirja kirja = new Kirja("Camilla", "Pahanilmanlintu", 1);
        System.out.println(kirja);
        
        Talletettava kirja2 = kirja;
        System.out.println(kirja2);
    }

}
