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
public class Stożek {
    
int rs,h,l;

    /**
     *
     */
    public Stożek (int rs,int h){
    this.rs=rs;
    this.h=h;
}

    Stożek(int rs, int h, int l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    double pole(int rs, int l){
    return (3.14*(rs*rs)+3.14*rs*l);
}
double objętość(int rs,int h){
    return ((rs*h*3.14)/3);
}
   public void pokazDane() {
        System.out.println("Stożek");
        System.out.println("promień, tworząca, wysokość: " + this.rs  +this.l +this.h);
        System.out.println("pole: " + this.pole(rs,l));
        System.out.println("objętość: " + this.objętość(rs,h));
    }
}
