/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Patryk
 */
public class kwadrat {
    
int a;
public kwadrat (int a){
    this.a=a;
}
    int pole(int a){
    return (a*a);
}
int obwód(int a){
    return (4*a);
}
   public void pokazDane() {
        System.out.println("Kwadrat");
        System.out.println("bok kwadratu: " + this.a);
        System.out.println("pole: " + this.pole(a));
        System.out.println("obwód: " + this.obwód(a));
    }
}
