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
public class Kula {
   int r;

    /**
     *
     */
    public Kula (int r){
    this.r=r;
    this.r=r;
}

  
    double pole(int r){
    return (4*3.14*(r*r));
}
double objętość(int r){
    return (4/3*3.14*(r*r*r));
}
   public void pokazDane() {
        System.out.println("Kula");
        System.out.println("promień kuli: " + this.r);
        System.out.println("pole: " + this.pole(r));
        System.out.println("objętość: " + this.objętość(r));
    }
    
}
