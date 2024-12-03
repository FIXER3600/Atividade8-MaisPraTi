package Exercicio1;

import java.util.Scanner;

public class Calculadora {
    public double calcular( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Digite a operação: ");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber != 0) {  // Verificação para evitar divisão por zero
                    return (double) firstNumber / secondNumber;
                } else {
                    System.out.println("Erro: divisão por zero");
                    return 0;
                }
            default:
                System.out.println("Operação inválida");
                return 0;
        }
    }
}

