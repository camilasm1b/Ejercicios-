/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.de.periodo.pkg3;

import java.util.Scanner;

/**
 *
 * @author MINEDUCYT
 */
public class clase5p3 {
    
public static void main(String[] args) {
        Scanner Reader = new Scanner (System.in);
        int contador;
        int fin;
        System.out.println("Por favor ingrese el valor inicial (contador)");
        contador = Reader.nextInt();
        System.out.println("Por favor ahora ingrese el valor final");
        fin = Reader.nextInt();
        while (contador <= fin){
        System.out.println("Valor actual de la iteracion "+contador); 
        contador++;
        } 
    }   
}
