import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
     int alfa = 150;
     int beta = 350;
     int maisAlfa = 70;
     int totalAlfa = alfa + maisAlfa;
     int faltaAlfa;
     int convidados = 0;
   
     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite o número de convidados: ");
     convidados = entrada.nextInt();
     faltaAlfa =  convidados - alfa;
     if(convidados > beta || convidados < 0){
         System.out.println("Números de convidados inválido.");
     }
     else{
         if(convidados <= alfa || convidados == totalAlfa){
             System.out.println("Use o auditório Alfa");
         }
         else if(convidados <= totalAlfa){
             System.out.println("Use o auditório Alfa");
             System.out.println("Inclua mais: "+faltaAlfa+" cadeiras.");
         }
         else{
             System.out.println("Use o auditório Beta");
         }
        
         
     }
    }
}
   
    

