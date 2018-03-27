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
public class Prostopadłościan {
    int app,bpp,cpp;
public Prostopadłościan (int app, int bpp, int cpp){
    this.app=app;
    this.bpp=bpp;
    this.cpp=cpp;
}

    Prostopadłościan(int ap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int pole(int app,int bpp, int cpp){
    return (2*(app*bpp)+2*(app*cpp)+2*(bpp*cpp));
}
int objętość(int app, int bpp, int cpp){
    return (app*bpp*cpp);
}
   public void pokazDane() {
        System.out.println("Prostopadłościan");
        System.out.println("boki prostopadłościanu: " + this.app +this.bpp +this.cpp);
        System.out.println("pole: " + this.pole(app, bpp, cpp));
        System.out.println("objętość: " + this.objętość(app,bpp,cpp));
    }
}
    

