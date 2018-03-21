
package pl.edu.ur.polab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patryk
 */
public class Danewejściowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        NewMain Student1 = new NewMain("Patryk", "Michałów", 545454, "informatyka", 1);
        Student1.wyswietl();
        
         System.out.println("---------------------");
        NewMain Student2 = new NewMain("Filip", "Orzech", 484623, "matematyka", 1);
        Student2.wyswietl();
        
     
    }
    
}
