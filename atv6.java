
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira as horas:");
        int horas=entrada.nextInt();
        System.out.println("Insira os minutos:");
        int minutos=entrada.nextInt();
        String opcao="s";
        imprimeHora(horas,minutos,opcao);
        entrada.close();}

    

    static void imprimeHora(int horas,int minutos,String opcao){
        do{
         if(horas>12) {
            horas=horas-12;
            System.out.println(horas+":"+minutos+" P.M.");

         } else if(horas==12){
            System.out.println(horas+":"+minutos+" P.M.");
        }else if (horas==24){
            System.out.println(horas+":"+minutos+" A.M.");
        }else{System.out.println(horas+":"+minutos+" A.M.");}

        

    
        System.out.println("Deseja converter mais horários?!?");
        Scanner entrada = new Scanner(System.in);
        opcao = entrada.next();
        entrada.close();
        }
        while(opcao !="n");

    }}
    
        
    