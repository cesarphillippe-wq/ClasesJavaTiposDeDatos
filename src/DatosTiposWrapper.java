public class DatosTiposWrapper {
    public static void main(String[] args) {
        byte edad = 25;
        System.out.println("edad=" + edad);
        System.out.println("Byte MAX_VALUE =" + Byte.MAX_VALUE + " "+Byte.MIN_VALUE);

        Short anio = 2025;
        System.out.println("anio=" + anio);
        System.out.println("Short MIN_VALUE =" + Short.MIN_VALUE);

        Long poblacioMuncial = 8_000_000_000L;
        System.out.println("poblacioMuncial=" + poblacioMuncial);
        System.out.println("Long compare (100L, 200L)= "+Long.compare(100L, 200L));

        Float precio=99.99f;
        System.out.println("precio="+precio);
        System.out.println("Float isNaN(0.0f / 0.0f) "+ Float.isNaN(0.0f / 0.0f));

        Double pi = 3.141590653589793;
        System.out.println("pi="+pi);
        System.out.println("Double calue0f(\"2.718\")=" + Double.valueOf("2.718"));

        Character inicial = 'C';
        System.out.println("inicial="+inicial);
        System.out.println("Character.isListter ('9')= "+ Character.isLetter('9'));
        System.out.println("Character.toLowerCase('A')= "+ Character.toLowerCase('A'));

        Boolean esJavaGenial = Boolean.TRUE;
        System.out.println("\nBoolean es java genial= "+ esJavaGenial);
        System.out.println("\nBoolean.parseboolean(\"false\")="+ Boolean.parseBoolean("false"));


        System.out.println("=== Operaciones con wrapper===");

        Integer x = 10;
        Integer y = 20;

        int suma = x + y;
        System.out.println("suma (x + y)"+suma);

        //comparaciones
        System.out.println("x.compareTo(y)"+x.compareTo(y));
        System.out.println("x.equals(y)"+x.equals(y));

        String str =x.toString();
        System.out.println("x.toString()="+str);

        int numero = Integer.parseInt("1234");
        System.out.println("Integer.parseint(\"1234\")="+numero);
        Integer poblacionCiuad = 1_500_000;

        System.out.println("poblacionCiuad=" + poblacionCiuad);
        System.out.println("Integer parseInt(\"123\")"+ Integer.parseInt("123"));
        System.out.println("Interger toHexString(255)= "+Integer.toHexString(255));
    }
}
