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
public class clase2p3 {
    
 public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        String quieroJugar = "si";
        while(quieroJugar.equals("si")){
        System.out.println("¿Quieres seguir jugando?");
        quieroJugar = Reader.next();
        }  
    }
}