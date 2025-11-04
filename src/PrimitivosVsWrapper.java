public class PrimitivosVsWrapper {
   public static void main(String[] args) {

       //== Tipos de Datos Primitivos vs Wrapper en Java==

       //Declaracion basica

       int primitivoInt = 10;       // tipo Primitivo
       Integer wrapperInt = 10;     // tipoWRAPPER (autoboxing)

       System.out.println("primitivoInt=" + primitivoInt);
       System.out.println("Integer wrapperInt=" + wrapperInt);

       //Autoboxing u unboxing
       Integer autoBox = primitivoInt; //autoboxing (int == Integer)
       int unBox = wrapperInt;         //unboxing (Integer = int)
       System.out.println("\"Autoboxing int= Integer= "+autoBox);
       System.out.println("Unboxing Integer= int "+unBox);

       //Comparaciones
       int a=100;
       int b=100;
       Integer x=100;
       Integer y=100;
       Integer z=200;

       System.out.println("\"Comparaciones:");
       System.out.println("a == b" +(a==b));        //true (primitivos comparan valor)
       System.out.println("x == y" +(x==y));        //true (cache valor contenido)
       System.out.println("x == z" +(x==z));        //false
       System.out.println("x.equals(y)" +(x.equals(y))); //true (Compara valor contenido)
       System.out.println("x.equals(z)" +(x.equals(z))); //false

       //Operaciones aritmeticas

       int sumaPrimitivos = a+b;
       Integer sumaWrapper = x+y;
       System.out.println("sumaPrimitivos (a+b)"+sumaPrimitivos);
       System.out.println("sumaWrapper (x+y)"+sumaWrapper);

       //Conversion de String a numero
       String numeroTexto = "123";
       int numPrimitivo = Integer.parseInt(numeroTexto);
       Integer numWrapper = Integer.valueOf(numeroTexto);
       System.out.println("\"Conversion de String:");
       System.out.println("Interger.parseInt (\"123\")= "+numPrimitivo);
       System.out.println("Integer.valueOf(\"123\")= "+numWrapper);

       //Uso en Colecciones (Solo Wrapper funcion en los colecciones genericas)

       java.util.List<Integer> lista = new java.util.ArrayList<>();
       lista.add(10);
       lista.add(20);
       lista.add(30);

       System.out.println("\"Lista con Wrapper:");
       for (Integer n : lista) {
           System.out.println("Elemento: " +n);
       }

       //Nullability (solo los wrapper pueden ser null)
       Integer puedesSerNull = null;
       System.out.println("\"Wrapper con null permitido:");
       System.out.println("Integer puedesSerNull = " + puedesSerNull);

       //Si descomentas esta linea, dara NullPointException
       //int primitivoNull = puedeSerNull;

   }
}
