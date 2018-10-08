/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Lex
 */

import java.io.*;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
       int a=0;
       int de;
       int ob=0;
       double precio;
       double totc;
       double descuento;
       double s;
       
       Scanner teclado =new Scanner(System.in);
       for(int i=1;i<=10;i++){
       System.out.println("Cliente Numero: "+i);
       System.out.println("Ingrese la Cantidad de Docenas:");
       de=teclado.nextInt();
       System.out.println("Ingrese el Precio:");
       precio=teclado.nextDouble();
       if(de==3){
            s=de*precio;
            descuento=s*0.15;
            totc =s-descuento;
            
        }
        else{
            s=de*precio;
            descuento=s*0.10;
            totc =s-descuento;
            for(int z=4;z<=de;z++){
            if(de>3){
                ++ob;
            }
            }
            a=de+ob;
        }
        System.out.println("total de compra es: "+totc);
        System.out.println("descuento: "+descuento);
        System.out.println("unidades de regalo: "+ob);
    }
       System.out.println("Final del dia");
    }
    
}
