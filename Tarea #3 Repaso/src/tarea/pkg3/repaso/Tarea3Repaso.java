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


    public static boolean contieneLetras(String corta, String larga) {
        for (int i = 0; i < corta.length(); i++) {
            char c = corta.charAt(i);
            if (larga.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void LetrasyNumeros(String cadena) {
        String orden = "";
        for (char ca = 'a'; ca <= 'z'; ca++) {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i)==ca){
                    orden+=ca;
                }
            }
        }
    System.out.println (orden);
}
 
    public static void main(String[] args) {

        System.out.println("***MENU***\n[1]Veamos si podemos formar la palabra\n[2]Números primero\n[3]Ordenar alfabéticamente\n[4]Codificar cadenas\n[5]Jugando con arreglos\n[6]Salir");
        int opcion = duki.nextInt();

        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    xchar resp = 's';
                    while (resp == 's' || resp == 'S') {
                        duki.nextLine();
                        String mayor = "";
                        String menor = "";
                        System.out.print("Ingrese la primera cadena: ");
                        String cad1 = duki.nextLine();
                        System.out.print("Ingrese la segunda cadena: ");
                        String cad2 = duki.nextLine();

                        if (cad1.length() > cad2.length()) {
                            mayor = cad1;
                            menor = cad2;
                        } else {
                            mayor = cad2;
                            menor = cad1;
                        }
                        if (contieneLetras(menor, mayor)) {
                            System.out.println("Si se puede armar " + menor);
                        } else {
                            System.out.println("No se puede armar " + menor);
                        }x
x
                        resp = duki.next().charAt(0);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese una cadena que contenga letras y palabras:");
                    duki.nextLine();
                    String cadena = duki.nextLine();
                    String cadenaOrdena = NumerosPrimero(cadena);
                    System.out.println("La cadena ordena es: " + cadenaOrdena + "\n");

                    break;
                case 3:
                    char resp2 = 's';
                    while (resp2 == 's' || resp2 == 'S') {
                        duki.nextLine();
                        System.out.println("Ingrese cadena: ");
                        String cadena = duki.nextLine().toLowerCase();
                        LetrasyNumeros(cadena);
                        System.out.println("Desea continuar[S/N]?");
                        resp2 = duki.next().charAt(0);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese una cadena para codificar: ");
                    duki.nextLine();
                    String Codificar = duki.nextLine();
                    String cadenaCodificada = codificarCadena(Codificar.toLowerCase());
                    System.out.println("La cadena codificada es: " + cadenaCodificada);

                    break;
                case 5:
                    int tam = 10;
                    int[] cad = new int[tam];
                    cad = llenarArreglo(tam);
                    imprimirArreglo(cad);

                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
            System.out.println("***MENU***\n[1]Veamos si podemos formar la palabra\n[2]Números primero\n[3]Ordenar alfabéticamente\n[4]Codificar cadenas\n[5]Jugando con arreglos\n[6]Salir");
            opcion = duki.nextInt();
        }

        System.out.println("Saliendo del programa");
    }

    public static String NumerosPrimero(String cadena) {
        String numeros = "";
        String letras = "";

        for (int i = 0; i < cadena.length(); i++) {
            char carac = cadena.charAt(i);
            if (Character.isDigit(carac)) {
                numeros += carac;
            } else {
                letras += carac;
            }
        }

        String resultado = numeros + letras;

        return resultado;
    }

    public static String codificarCadena(String codificar) {
        String cadenaCodificada = "";
        boolean huboEspacio = false;
        for (int i = 0; i < codificar.length(); i++) {
            char carac = codificar.charAt(i);
            if (Character.isDigit(carac)) {
                int valor = Character.getNumericValue(carac) + 64;
                char letra = (char) (valor);
                cadenaCodificada += (huboEspacio || i == 0 ? "" : "-") + letra;
                huboEspacio = false;
            } else if (Character.isLetter(carac)) {
                int valor = carac - 96;
                cadenaCodificada += (huboEspacio || i == 0 ? "" : "-") + valor;
                huboEspacio = false;
            } else if (carac == ' ') {
                cadenaCodificada += carac;
                huboEspacio = true;
            }
        }

        return cadenaCodificada;
    }

    public static int[] llenarArreglo(int tam) {

        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el valor para la posicion " + i + ":");
            arreglo[i] = duki.nextInt();
        }
        return arreglo;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posicion " + i + ": " + arreglo[i]);
        }
    }

}
