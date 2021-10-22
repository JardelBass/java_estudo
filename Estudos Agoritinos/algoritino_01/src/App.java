import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Variaves da intrada 
        int i = 0;
        double nota_1, nota_2, media = 0;
        Scanner scan = new Scanner(System.in);

        //Entrada de dados 
        System.out.println("Digite nota 1");
        nota_1 = scan.nextDouble();

        System.out.println("Digite nota 2");
        nota_2 = scan.nextDouble();

        media = (nota_1 + nota_2) /2;
        
        while(i <= 1){
             
            if (media >= 6){
                System.out.println("Aluno com media "+ media);
                i = 2;
            }else{
                if(nota_1 >= 6){
                    System.out.println("Digite nota");
                    nota_1 = scan.nextDouble();
                }else{
                    System.out.println("Digite nota");
                    nota_2 = scan.nextDouble();
                }    
            }
            media = (nota_1 + nota_2) /2;
        }  
    }
}
