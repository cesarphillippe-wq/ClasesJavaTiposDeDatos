import java.util.Scanner;

public class MayorOMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //--------------------Mayor numero-------------------------
        int a,b,c, ma;
        System.out.println("\nIngres 3 Numeros");
        System.out.println("primer numero: ");
        a = sc.nextInt();
        System.out.println("segundo numero: ");
        b = sc.nextInt();
        System.out.println("cero numero: ");
        c = sc.nextInt();

        if(a > b && a > c){
            ma = a;
            System.out.println(ma + " es a Mayor");
        }
        else if(b > a && b > c){
            ma = b;
            System.out.println(ma + " es a Mayor");
        }
        else if(c > a && c > b){
            ma = c;
            System.out.println(ma + " es a Mayor");
        }
        else if(a == b){
            System.out.println("Dos numero son iguales");
        }
        else if(a == c){
            System.out.println("Dos numero son iguales");
        }
        else if (b==a){
            System.out.println("Dos numero son iguales");
        }
        else if (b==c){
            System.out.println("Dos numero son iguales");
        }
        else if (c==a){
            System.out.println("Dos numero son iguales");
        }
        else if(c==b){
            System.out.println("Dos numero son iguales");
        }
    }
}
