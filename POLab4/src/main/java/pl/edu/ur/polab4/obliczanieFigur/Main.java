/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;
import java.util.Scanner;

/**
 *
 * @author Patryk
 */
public class Main {
   

    public static void main(String[] args) {
     int s;
     System.out.println("Witaj! Co chciałbyś obliczyć?");
     System.out.println("1 - Pole i Obwód kwadratu "
             + "2 - Pole i Obwód prostokąta "
             + "3 - Pole i Objętość prostopadłościanu "
             + "4 - Pole i Objętość sześcianu "
             + "5 - Pole i Objętość kuli "
             + "6 - Pole i Objętość stożka ");
     
     Scanner wybór = new Scanner (System.in);
      s= wybór.nextInt();
      switch(s){
        
        case 1:    
        Scanner f = new Scanner (System.in);
        int a = f.nextInt();
        kwadrat x=new kwadrat(a);
        x.pokazDane();
        break;
            
        case 2:
            Scanner f1 = new Scanner (System.in);
        int ap = f1.nextInt();
         int bp = f1.nextInt();
        Prostokąt xp=new Prostokąt(ap, bp);
        xp.pokazDane();
        break;
    
        case 3:
          Scanner f2 = new Scanner (System.in);
        int app = f2.nextInt();
           int bpp = f2.nextInt();
              int cpp = f2.nextInt();
        Prostopadłościan xpp=new Prostopadłościan(app,bpp,cpp);
        xpp.pokazDane();
        break;  
        
        case 4:
           Scanner f3 = new Scanner (System.in);
        int ass = f3.nextInt();          
        Sześcian xss=new Sześcian(ass);
        xss.pokazDane();
        break;   
        
        case 5:
         Scanner f4 = new Scanner (System.in);
        int r = f4.nextInt();          
        Kula xr=new Kula(r);
        xr.pokazDane();
        break;   
        
        case 6:
          Scanner f5 = new Scanner (System.in);
        int rs = f5.nextInt();
        int h = f5.nextInt();
        int l = f5.nextInt();
        Stożek xst=new Stożek(rs,h,l);
        xst.pokazDane();
        break;   
          
      }
}
}
   
