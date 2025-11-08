import java.util.Scanner;

public class NumeroParIpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //--------------Numero Par o Impar----------------------------
        int n=0;

        System.out.println("\nEscribe un numero entero");
        n=sc.nextInt();

        if (n % 2 ==0){
            System.out.println("El numero es par ");
        }
        else {
            System.out.println("El numero no es par ");
        }

        if (n <= 0){
            System.out.println("El numero no es positivo ");
        }
        else {
            System.out.println("El numero es positivo ");
        }
    }
}
