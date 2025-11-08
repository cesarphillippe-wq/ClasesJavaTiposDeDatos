import java.util.Scanner;

public class sumarHastaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();

        String op2="no";
        do {
            System.out.println("Quieres introducir otro numero: si/no");
            op2 = sc.next();
            if (op2 == "si") {
                System.out.println("Introduce el numero: ");
                int num2 = sc.nextInt();
                sum += num1;
            }
        }while (op2 == "no");
        System.out.println("La suma es: "+sum);
    }
}
