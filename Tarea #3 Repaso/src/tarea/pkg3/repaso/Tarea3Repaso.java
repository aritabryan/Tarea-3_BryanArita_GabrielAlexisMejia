/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg3.repaso;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BJAL
 */
public class Tarea3Repaso {

    static Scanner duki = new Scanner(System.in);
    static Random rndm = new Random();

    public static void main(String[] args) {
        System.out.println("***MENU***\n[1]Veamos si podemos formar la palabra\n[2]Números primero\n[3]Ordenar alfabéticamente\n[4]Codificar cadenas\n[5]Jugando con arreglos\n[6]Salir");
        int opcion = duki.nextInt();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
        System.out.println("Saliendo del programa");

    }

}
