package repaso;

import static java.lang.System.exit;
import java.util.Scanner;
/**
 * 
 * @author DAW-JDMC
 * @version 8.2
 */
public class Calculadora {
    /**
     * @param args 
     * @param num recoge la accion de la calculadora
     * @param num1 recoge el primer numero
     * @param num2 recoge el segundo numero
     * @param suma la suma de los valores
     * @param resta la resta de los valores
     * @param multi la multiplicacion de los valores
     * @param dividir la division de los valores
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce que acion quieres realizar");
        System.out.println("1 - Sumar.");
        System.out.println("2 - Restar.");
        System.out.println("3 - Multiplicar.");
        System.out.println("4 - Dividir.");

        num = sc.nextInt();
        int num1;
        int num2;
        switch (num) {
            case 1:
                System.out.println("Introduce los valores que quieres sumar:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int suma = num1 + num2;

                System.out.println("El resultado es: " + suma);
                break;

            case 2:
                System.out.println("Introduce los valores que quieres restar:");
                 num1 = sc.nextInt();
                 num2 = sc.nextInt();
                int resta = num1 - num2;

                System.out.println("El resultado es: " + resta);
                break;

            case 3:
                System.out.println("Introduce los valores que quieres multiplicar:");
                 num1 = sc.nextInt();
                 num2 = sc.nextInt();
                int multi = num1 * num2;

                System.out.println("El resultado es: " + multi);
                break;

            case 4:
                System.out.println("Introduce el dividendo:");
                 num1 = sc.nextInt();
                System.out.println("Introduce el divisor:");
                 num2 = sc.nextInt();

                if(num2 > 0){
                    int dividir = num1/num2;
                    System.out.println("El resultado es: " +dividir);
                }else{
                    System.out.println("Error!!!, el divisor tiene que ser mayor que 0.");
                }
                break;
            
            default:
                System.out.println("Error, parametro no encontrador, se cerrara el programa");
                exit(0);
        }
    }
}