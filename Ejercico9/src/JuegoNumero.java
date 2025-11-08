import java.util.Random;
import java.util.Scanner;

public class JuegoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        Random azar = new Random();
        int numA= azar.nextInt(50)+1;
        int ti=0, tiTotal=0;

        System.out.println(" Adivina el numero ¡SUERTE !");
        while(ti !=numA){

            ti = sc.nextInt();
            tiTotal ++;

            if(ti == numA){
                System.out.println("GANASTE BIEN ECHO tiros realizados: "+tiTotal);
                break;
            } else if (ti < numA) {
                System.out.println("Intenta de nuevo el numero es bajo");
            } else if (ti > numA) {
                System.out.println("Intenta de nuevo el numero es alto");
            }
        }
    }
}
