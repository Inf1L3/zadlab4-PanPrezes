/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Patryk
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
      /**
     *
     */
        public String imie;       
       public String nazwisko;  
        public int nr_indeksu;         

    /**
     *
     */
    public String nazwa_specjalności;
    public int rok_studiów;
    public static void main(String[] args) {
        // TODO code application logic here
    
  }
   
    /**
     *
     * @param imie
     * @param nazwisko
     * @param nr_indeksu
     * @param nazwa_specjalności
     * @param rok_studiów
     */
    public NewMain(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalności, int rok_studiów) {
        this.imie = imie;
        this.nazwisko = nazwisko;
             this.nr_indeksu = nr_indeksu;
             this.nazwa_specjalności = nazwa_specjalności;
             this.rok_studiów = rok_studiów;
    }

    public NewMain() {
    }
    
    

    NewMain(String jan, String kowalski, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void wyswietl() {
        System.out.println("Student");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("nr indeksu: " + this.nr_indeksu);
        System.out.println("nazwa specjalności" +this.nazwa_specjalności);
        System.out.println("rok studiów" +this.rok_studiów);
    }
} 
    
    

