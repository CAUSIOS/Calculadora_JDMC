package repaso;

import static java.lang.System.exit;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce que acion quieres realizar");
        System.out.println("1 - Sumar.");
        System.out.println("2 - Restar.");
        System.out.println("3 - Multiplicar.");
        System.out.println("4 - Dividir.");

        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Introduce los valores que quieres sumar:");
                int Sum1 = sc.nextInt();
                int Sum2 = sc.nextInt();
                int suma = Sum1 + Sum2;

                System.out.println("El resultado es: " + suma);
                break;

            case 2:
                System.out.println("Introduce los valores que quieres restar:");
                int res1 = sc.nextInt();
                int res2 = sc.nextInt();
                int resta = res1 - res2;

                System.out.println("El resultado es: " + resta);
                break;

            case 3:
                System.out.println("Introduce los valores que quieres multiplicar:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int multi = num1 * num2;

                System.out.println("El resultado es: " + multi);
                break;

            case 4:
                System.out.println("Introduce el dividendo:");
                int div1 = sc.nextInt();
                System.out.println("Introduce el divisor:");
                int div2 = sc.nextInt();

                if(div2 > 0){
                    int dividir = div1/div2;
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