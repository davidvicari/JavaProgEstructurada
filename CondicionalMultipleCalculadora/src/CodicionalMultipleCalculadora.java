
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TODOPODEROSO
 */
public class CodicionalMultipleCalculadora {

    public static void main(String[] args) {
        int num1, num2;

        System.out.print(
                "Ingresá numero 1: ");
        num1 = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print(
                "Ingresa numero 2: ");
        num2 = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print(
                "Seleccioná la operación ( + , - , x , / ): ");
        switch (new Scanner(System.in).nextLine().charAt(0)) {

            case '+':
                System.out.println("La SUMA es: " + (num1 + num2));
                break;

            case '-':
                System.out.println("La RESTA es: " + (num1 - num2));
                break;

            case 'x':
                System.out.println("El PRODUCTO es: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("La DIVISION es: " + (num1 / num2));
                } else {
                    System.out.println("ERROR. No se puede dividir por 0");
                }
                break;

            default:
                System.out.println("OPCION INCORRECTA. Solo puede ingresar + , - , x , /");
                break;
        }
    }
}
