
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David Vicari
 */
public class CompararStrings {

    public static void main(String[] args) {
        System.out.print("Adivina el nombre a comparar: ");
        String nombreDePersona = new Scanner(System.in).nextLine();
        String nombreEsperado = "Juan";

        if (nombreDePersona.equalsIgnoreCase(nombreEsperado)) {
            System.out.println("FELICIDADES. Ha adivinado el nombre!");
            System.out.println();
        } else {
            System.out.println("Mala Suerte, el nombre era Juan. Mejor suerte la proxima.");
            System.out.println();
        }
    }
}
