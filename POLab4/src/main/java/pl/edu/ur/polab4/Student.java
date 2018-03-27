package pl.edu.ur.polab4;

//public class Main {

import java.util.Scanner;


    /**
     */
   // public static void main(String[] args) {
        // TODO zad 4, 5

public class Student {

    public static void main(String[] args) {


        String[] imie = new String[100];
        String[] nazwisko = new String[100];
        int[] nr_indeksu = new int[100];
        String[] nazwa_specjalnosci = new String[100];
        int[] rok_studiow = new int[100];
        Student st = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        String p="  ";
        do{
            System.out.println("Czy chcesz wyzerowac wszystkie wartosci liczbowe i wstawic puste pola w zamiast tekstu?");
             p= s.nextLine();
            if (p.equalsIgnoreCase("tak")) {
                st.puste();
            }
            System.out.println("Czy chcesz uzupelnic dane wybranego studenta?");
            p = s.nextLine();
            if (p.equalsIgnoreCase("tak")) {
                do{
                System.out.println("Ktorego studenta?");
                int x = s2.nextInt();
                st.wybrany(x);
                System.out.println("Ktoregos jeszcze?");
                p = s.nextLine();
                }while (p.equalsIgnoreCase("tak"));
            }
            System.out.println("Czy chcesz usunac dane ktoregos studenta?");
            p = s.nextLine();
            if (p.equalsIgnoreCase("tak")) {
                do{
                System.out.println("Ktorego ?");
                int x = s2.nextInt();
                st.usuniecie(x);
                System.out.println("Ktoregos jeszcze?");
                p = s.nextLine();
                }while (p.equalsIgnoreCase("tak"));
            }
            System.out.println("Czy chcesz wyswietlic dane wybranego studenta?");
            p = s.nextLine();
            if (p.equalsIgnoreCase("tak")) {
                do{
                System.out.println("Ktorego ?");
                int x = s2.nextInt();
                st.daneWybrany(x);
                System.out.println("Ktoregos jeszcze?");
                p = s.nextLine();
                }while (p.equalsIgnoreCase("tak"));
            }
            System.out.println("Czy chcesz wyswietlic dane wszystkich studentow?");
            p = s.nextLine();
            if (p.equalsIgnoreCase("tak")) {
                st.dane();
            }
            System.out.println("Czy chcesz wyswietlic dane studentow z danego przedzialu (max od 1 do 100)");
            p = s.nextLine();
            if (p.equalsIgnoreCase("tak")) {
                System.out.println("Od ktorego");
                int x = s2.nextInt();
                System.out.println("Do ktorego?");
                int y = s2.nextInt();
                for (; x <= y; x++) {
                    st.daneWybrany(x);
                }
            }
        System.out.println("Czy chcesz powtorzyc caly proces?");
        p = s.nextLine()  ; 
        }while(p.equalsIgnoreCase("tak"));
    }

    private Student(String[] imie, String[] nazwisko, int[] nr_indeksu, String[] nazwa_specjalnosci, int[] rok_studiow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void puste() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void wybrany(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void usuniecie(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void daneWybrany(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }


