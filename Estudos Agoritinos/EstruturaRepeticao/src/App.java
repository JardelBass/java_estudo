public class App {
    public static void main(String[] args) throws Exception {
        //Variavel
        int numero = 0;

        System.out.println("---------------FOR----------------");
        for(int i = 0; i < 10; i++){
            numero = numero + 1;
            System.out.println("valou numero: "+ numero);
        }

        System.out.println("---------------WHILE----------------");

        while(numero > 0){
            numero = numero - 1;
            System.out.println("valou numero: "+ numero);
        }

        System.out.println("---------------DO WHILE----------------");

        do{
            numero = numero + 1;
            System.out.println("valou numero: "+ numero);
        }while(numero < 10);

    }
}
