public class ObjectString {
    public static void main(String[] args) {

        //=== Manejo de Object String en Java ===

        // String literal (usa el String Pool)

        String x1 = "Hola";
        String x2 = "Hola";
        System.out.println("s1 == s2 = "+x1 == x2); //true ambos apuntan al mismo objeto en el String Pool

        //String creado con new (nuevo objeto en memoria heap)

        String x3 = new String("hola");
        System.out.println("s1 = s3 = "+(x1 == x3));
        System.out.println("s1.equals(s3)"+x1.equals(x3));

        //Inmutabilidad de String
        String texto = "Java";
        texto.concat("es genial");
        System.out.println("\"Texto original(inmutable):" +texto);//Sigue siendo Java
        texto = texto.concat("es genial");
        texto+= " es genial +++";
        texto+= " en web";
        texto+= " y en aplicacion";
        texto += " de escritorio";
        texto = texto.replace("+++", "fff");
        System.out.println("Texto reasignado" + texto);

        //Problema de concatenacion en bucles

        String concatMal= "";
        for (int i = 0; i<5; i++) {
            concatMal +=i;

        }
        System.out.println("\"Concatenacion ineficientes:" +concatMal);


        //Uso correcto de concatenacion en bucles

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<5; i++) {
            sb.append(i).append(" ").append("hola").append("como esta?")
                    .append("c")
                    .append("v");
        }
        System.out.println("Concatenacion eficiente con StringBuider "+sb.toString());

        //Comparacion de rendimiento(ejemplo basico)

        long inicio1 = System.nanoTime();
        String test1= "";
        for (int i = 0; i<1000; i++) {
            test1+=i;//mala practica
        }
        long fin1 = System.nanoTime();

        long inicio2 = System.nanoTime();
        StringBuilder test2 = new StringBuilder();
        for (int i = 0; i<1000; i++) {
            test2.append(i);
        }
        long fin2 = System.nanoTime();

        System.out.println("\"Tiempo concatenacion conString (ns):"+(fin1 - inicio1));
        System.out.println("\"Tiempo concatenacion con StringBuider "+(fin2 - inicio2));

        //StringBuffer (similar a StringBuilder pero sincronizado = seguro en Hilos)
        StringBuffer sbf = new  StringBuffer("Thread-Safe ");
        sbf.append("pero mas lento");
        System.out.println("\"Uso de StringBuffer:" +sbf);

        //=== Ejercicio String Pool y Heap ===

        //Declaracion de String

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        String s5 = new String("Java").intern();

        // Comparacion con ==

        System.out.println("s1 == s2 = "+ (s1 == s2));//Pool
        System.out.println("s1 == s3 = "+ (s1 == s3));//heap vs Pool
        System.out.println("s1 == s4 = "+ (s1 == s4));//heap distintos
        System.out.println("s1 == s5 = "+ (s1 == s5));//Pool despues del intern()


        //Comparacion con equals()

        System.out.println("\"s1.equals(s2) = " +s1.equals(s2));
        System.out.println("\"s1.equals(s3) = " +s1.equals(s3));
        System.out.println("\"s1.equals(s4) = " +s1.equals(s4));
        System.out.println("\ns1.equals(s5) = " +s1.equals(s5));

        //Reasignacion y concatenacion

        s3 = s3 + "Programing"; // crea un nuevo objeto
        System.out.println("\nDespues de concatenar s3" +s3);
        System.out.println("s3 == s4 =" +(s3 == s4));//ahora son distintos

        //4. Internacion despues de concatenacion
        String s6 = s3.intern();
        System.out.println("s6 (intern de s3)"+s6);
        System.out.println("s6 == s1"+(s6 == s1));//false porque el contenido es diferente
    }
}
