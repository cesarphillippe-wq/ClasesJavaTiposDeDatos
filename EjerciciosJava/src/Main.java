import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Crea un programa que pida tu nombre y edad por consola, y luego imprima un mensaje como
        "Hola, Carlos. Tienes 25 años. ¡Bienvenido a Java!*/

        String nombre;
        int edad, fechaNac;
        int anio = LocalDate.now().getYear();

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre? ");
        nombre = sc.nextLine();
        System.out.println("Que edad tienes edad? ");
        edad = sc.nextInt();

        fechaNac = anio - edad;

        System.out.println("Hola "+nombre+" tienes "+edad+" años. Bienvenido a Java y naciste en  "+fechaNac);

        //-------------------------Calculadora------------------------------------

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

            //--------------Numero Par o Impar----------------------------
            int n=0;

        System.out.println("\nEscribe un numero entero");

            if (n % n ==0){
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

//--------------------Mayor numero-------------------------
        int a,b,c, ma;
        System.out.println("\nIngres 3 Numeros");
        System.out.println("primer numero");
        a = sc.nextInt();
        System.out.println("segundo numero");
        b = sc.nextInt();
        System.out.println("cero numero");
        c = sc.nextInt();

        if(a > b && a > c){
            ma = a;
        }
        else if(b > a && b > c){
            ma = b;
        }
        else if(c > a && c > b){
            ma = c;
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
        //----------------------------Contador---------------------
        int n3=0;
        System.out.println("\nHasta que numero quieres ver: ");
        n3 = sc.nextInt();

        for (int i=1;i<=n3;i++){
            System.out.println("numero: "+i);
            sum+=i;
        }

        /// ///////////TABLA DE MULTIPLICAR/////////////////////////
        int ta=0,nu=0;
        System.out.println("¿Que tabla quiere ver?");
        ta = sc.nextInt();
        System.out.println("¿Hasta que numero quiere multiplicar?");
        nu = sc.nextInt();
        for (int i=1;i<=nu;i++){
            res= ta* i;
            System.out.println("La tabla de multiplicar del "+i+" es: "+res);
        }

        /// ///////NUMEROS PARES ENTRE 1 Y 100/////////

        for (int i=1;i<=100;i++){
            if (i % i ==0){
                System.out.println("El numero "+i+" es par entre el 1 y 100: ");
                sum+=i;
            }
            System.out.println("La suma de todos las pares es: "+sum);
        }
        /// /////////SUMAR HASTA DECIR NO//////////////
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

        Random azar = new Random();
        int numA= azar.nextInt(50)+1;
        int ti=0, tiTotal=0;

        System.out.println(" Adivina el numero ¡SUERTE !");
        while(ti !=numA){
            System.out.println("Intenta de nuevo");
            ti = sc.nextInt();
            tiTotal ++;

            if(ti == numA){
                System.out.println("GANASTE BIEN ECHO");
                break;
            } else if (ti < numA) {
                System.out.println("Intenta de nuevo el numero es bajo");
            } else if (ti > numA) {
                System.out.println("Intenta de nuevo el numero es alto");
            }
        }

    }
}
