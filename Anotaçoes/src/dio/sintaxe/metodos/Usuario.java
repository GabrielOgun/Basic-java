package dio.sintaxe.metodos;

public class Usuario {
    //cuidado com varias mains
    public static void main(String[] args) throws Exception {

        SmartTv  smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligada);

        
    }

    
}
