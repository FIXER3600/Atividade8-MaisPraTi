package Exercicio4;

import java.util.Scanner;

public class NumeroInvertido {
    public void invertion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja inverter: ");
        String num = scanner.next();
        String numInvertido = new StringBuilder(num).reverse().toString();
        System.out.println("O número invertido fica: " + numInvertido);
    }
}
