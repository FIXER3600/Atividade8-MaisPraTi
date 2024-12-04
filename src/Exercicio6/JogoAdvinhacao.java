package Exercicio6;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int tentativas=0;
        Random random = new Random();
        // Gerando um número aleatório entre 1 e 50
        int numeroAleatorio = random.nextInt(50) + 1;
        while (true){
            System.out.println("Advinhe o número de 1 a 50 : ");
            n=scanner.nextInt();
           if (n != numeroAleatorio){
               System.out.println("O número digitado não é o número sorteado, tente novamente!");
           }else{
               System.out.println("Parabéns! O número digitado é o correto!");
               break;
           }
            tentativas++;
        }
        System.out.println("Número de tentativas: " + tentativas);
    }
}
