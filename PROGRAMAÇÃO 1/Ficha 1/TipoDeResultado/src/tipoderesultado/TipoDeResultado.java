/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipoderesultado;

/**
 *
 * @author mauro
 */
public class TipoDeResultado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b1 = 10, b2 = 20;
        short p = 200;
        int n = 500;
        long q = 100;
        float x = 2.5f;
        double y = 5.25;
        //a) b1+b2
        System.out.println("a)"+b1+b2);
        //b) p + b1;
        System.out.println("b)"+p + b1);
        //c) b1*b2;
        System.out.println("c)"+b1+b2);
        //d) q + p * (b1+b2);
        System.out.println("d)"+q + p * (b1+b2));
        //e) x + q * n
        System.out.println("e)"+x + q * n);
        //f) b1*q/x
        System.out.println("f)"+b1*q/x);
        //g) b1*q*2./x
        System.out.println("g)"+b1*q*2./x);
        //h) b1*q*2.f / x
        System.out.println("h)"+b1*q*2.f / x);
        
                
                

    }

}
