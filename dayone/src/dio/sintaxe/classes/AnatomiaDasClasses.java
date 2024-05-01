package dio.sintaxe.classes;
//arquivo java precisa estar na pasta src
// Public class [ Nome do arquivo / classe ]{ codigo dentro } 99% dos codigos vao começar assim
// Usar nome de classe em maisculo 
// se a classe for executavel, metodo main -> por padrao -> public static void main(String[] args)

public class AnatomiaDasClasses {
    public static void main(String[] args) {
        //System.out.printIn() -> System é uma classe do java -> out o que ele vai fazer 
        System.out.println("Hello, World!");
        System.out.println("Fazendo Hello world e subindo para github");
        //Conveção sobre nome de variaval: letra minuscula se for composta a segunda maiscula
        // só é permitido simbolos _ e $ para declarar variavel 
        int myNumber = 8;
        int myNumber2 = 7;
        //chamando metodo
        
        System.out.println(somar(myNumber, myNumber2));
        //Convenção 2: se a variavel for com duas letras maisculas ela nao deve ser alterada porem há como usar uma palvra reservada para obrigar isso "final"
        final String BR = "Brasil";
    }
    //declarar metodos, em java chama-se metodos e não função mas me parece ser a mesma coisa
    public static int somar (int a, int b){
        int c;
        return c = a + b; 

    }

}

//sobre Java Beans, convenções, uma escrita universal, para nossas classes, atributos, métodos e pacotes.
//sugestões de nomenclatura:
//Uma variável deve ser clara, sem abreviações ou definição sem sentido;
//Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
//Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.
//Métodos
//Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. 
//Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.

