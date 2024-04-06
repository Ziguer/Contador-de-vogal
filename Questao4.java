import java.util.Scanner;
public class Questao4
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        System.out.println("Escreva uma palavra ou frase");
        String palavra = ler.nextLine();
        int i = palavra.length();
        while(i>0){
            i--;
            char vogal = palavra.charAt(i);
            if(vogal=='a'){
                contador++;
            }
            else if(vogal=='e'){
                contador++;
            }
            else if(vogal=='i'){
                contador++;
            }
            else if(vogal=='o'){
                contador++;
            }
            else if(vogal=='u'){
                contador++;
            }
        
        }
        System.out.println("Sua palavra/frase tem "+contador+" vogais");
    }
}
