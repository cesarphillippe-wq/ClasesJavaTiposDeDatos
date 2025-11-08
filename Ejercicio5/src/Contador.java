import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        //----------------------------Contador---------------------
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n3=0;
        System.out.println("\nHasta que numero quieres ver: ");
        n3 = sc.nextInt();

        for (int i=1;i<=n3;i++){
            System.out.println("numero: "+i);
            sum+=i;
        }
    }
}
