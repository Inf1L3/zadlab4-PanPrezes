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
public class Sześcian {
  int ass;
public Sześcian (int ass){
    this.ass=ass;
   
}

    int pole(int ass){
    return (6*ass*ass);
}
int objętość(int ass){
    return (ass*ass*ass);
}
   public void pokazDane() {
        System.out.println("Sześcian");
        System.out.println("boki prostopadłościanu: " + this.ass);
        System.out.println("pole: " + this.pole(ass));
        System.out.println("objętość: " + this.objętość(ass));
    }
    
}
