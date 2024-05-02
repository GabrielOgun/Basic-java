package dio.sintaxe.variaveis;


public class TiposDeVariaveis {
    public static void main(String[] args) {
        //tipos primitos em java:
        // inteiros:
        byte num1 = 127; // 1 byte, -128 á 127  00000000 a 11111111
        short num2 = 32767; // 2 bytes de -32768 a 32767
        int num3 = 2147483647; // 4bytes de -2.147.483.648 a 2.147.483.647
        long num4 = 922337203;  //8 bytes de -9.223.372.036.854.775.808 á 9.223.372.036.854.775.807
        //ponto flutuante 
        float num5 = 38.50f ; //4 bytes  de -3,4028E + 38 a 3,4028E + 38 com precisao de 6 – 7 dígitos 
        double num6 = 85.6248448; // 8 bytes  precisao 15 dígitos 
        //declarar constante
        final int num7 = 25; //
        System.out.println( num1 + " "  + num2 + " " + num3 );
        //String contem uma coleção de caracteres em volta de aspas:
        //alguns metodos:  .length()  toUpperCase() and toLowerCase() indexOf() 
        String txt = "Hello, World";
        System.out.println(txt + " " + txt.length() );
        System.out.println(txt.toUpperCase());   
        System.out.println(txt.toLowerCase());

        





     }

    
    
}
