public class Pares1Al100 {
    public static void main(String[] args) {
       int sum=0;

        for (int i=1;i<=100;i++){
            if (i % 2 ==0){
                System.out.println("El numero "+i+" es par entre el 1 y 100: ");
                sum+=i;
            }

        }
        System.out.println("La suma de todos las pares es: "+sum);
    }
}
