/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Lex
 */

import java.util.*;
public class Ejercicio5 {

    public static void main(String[] args) {
       
        int kilometros;
        double exce=0;
        double tot=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el Numero de Kilometros Recocorridos");
        kilometros=teclado.nextInt();
        if(kilometros>=300 && kilometros<=1000){
            exce =(kilometros-300)*0.15;
            tot =exce+30;
        }
        if(kilometros>1000){
            exce= (kilometros-1000)*0.10;
            tot= exce+30;
        }
        System.out.println("Total a pagar: "+tot+" Dolares");
        
        
    }
    
}
