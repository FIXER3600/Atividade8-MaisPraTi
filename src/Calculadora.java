public class Calculadora {
    public double calcular(double firstNumber, double secondNumber, char operation) {
        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber != 0) {  // Verificação para evitar divisão por zero
                    return firstNumber / secondNumber;
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

