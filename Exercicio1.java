/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Root
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 3;
        
    
        
        System.out.println("A "+(b=a*(a++)));
        System.out.println("B "+(b = a * (--a)));
        System.out.println("C "+(b = a * ++a));
        System.out.println("D "+(b = a * a--));
        System.out.println("E "+(a += b++));
        System.out.println("F "+(a += --b));
        System.out.println("G "+(a = b++ * ++a));
        System.out.println("H "+(a = (b++ % 2 ) * (++a *3)));
        System.out.println("I "+(a = (--b % 2 ) * (++a /3 * b++)));
        System.out.println("J "+(b = (a * ++a) / (a * ++a)));
        
    }
    
}
