import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int res=0;
        int ta=0,nu=0;
        System.out.println("¿Que tabla quiere ver?");
        ta = sc.nextInt();
        System.out.println("¿Hasta que numero quiere multiplicar?");
        nu = sc.nextInt();
        for (int i=1;i<=nu;i++){
            res= ta* i;
            System.out.println("La tabla de multiplicar del "+i+" es: "+res);
        }
    }
}
