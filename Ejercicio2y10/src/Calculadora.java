import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //-------------------------Calculadora------------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.println("\nElige una Opcion");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. SALIR");

        int op,n1,n2;
        double r=0 ,sum=0,res=0,mul=0,div=0;
        do {
            switch (op = sc.nextInt()) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("ingresa el primer numero");
                    n1 = sc.nextInt();
                    System.out.println("ingresa el segundo numero");
                    n2 = sc.nextInt();
                    sum = n1 + n2;
                    System.out.println("La suma es: " + sum);
                    System.out.println("2. resta");
                    System.out.println("3. multiplicacion");
                    System.out.println("4. division");
                    System.out.println("5. SALIR");
                    break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("ingresa el primer numero");
                    n1 = sc.nextInt();
                    System.out.println("ingresa el segundo numero");
                    n2 = sc.nextInt();
                    res = n1 - n2;
                    System.out.println("La resta es: " + res);
                    System.out.println("1. suma");
                    System.out.println("3. multiplicacion");
                    System.out.println("4. division");
                    System.out.println("5. SALIR");
                    break;
                case 3:
                    System.out.println("MULTIPLICACION");
                    System.out.println("ingresa el primer numero");
                    n1 = sc.nextInt();
                    System.out.println("ingresa el segundo numero");
                    n2 = sc.nextInt();
                    mul = n1 * n2;
                    System.out.println("La multiplicacion es: " + mul);
                    System.out.println("1. suma");
                    System.out.println("2. resta");
                    System.out.println("4. division");
                    System.out.println("5. SALIR");
                    break;
                case 4:
                    System.out.println("DIVISION");
                    System.out.println("ingresa el primer numero");
                    n1 = sc.nextInt();
                    System.out.println("ingresa el segundo numero");
                    n2 = sc.nextInt();
                    div = n1 / n2;
                    if (n1 == 0 || n2 == 0) {
                        System.out.println("No se puede dividir por zero");
                    } else {
                        System.out.println("La division es: " + div);
                    }
                    System.out.println("1. suma");
                    System.out.println("2. resta");
                    System.out.println("3.  multiplicacion");
                    System.out.println("5. SALIR");
                    break;
                default:
                    System.out.println("Salir");
            }
        }
        while (op != 5) ;
    }
}
