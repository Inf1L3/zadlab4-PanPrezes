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
public class Prostokąt {
 int ap,bp;

    /**
     *
     */
    public Prostokąt (int ap,int bp){
    this.ap=ap;
    this.bp=bp;
}

    Prostokąt(int ap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int pole(int ap, int bp){
    return (ap*bp);
}
int obwód(int ap,int bp){
    return (2*ap + 2*bp);
}
   public void pokazDane() {
        System.out.println("Prostokąt");
        System.out.println("boki prostokąta: " + this.ap  +this.bp);
        System.out.println("pole: " + this.pole(ap,bp));
        System.out.println("obwód: " + this.obwód(ap,bp));
    }
}
    

