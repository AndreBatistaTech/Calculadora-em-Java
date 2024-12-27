import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double primeiroNumero = 0.0, segundoNumero = 0.0, resultado = 0.0;
        char operacao = ' ', escolhaSaida = ' ';
        boolean sair = false;

        do{ 
            System.out.println("Digite o primeiro numero: ");
            primeiroNumero = scn.nextDouble();

            System.out.println("Digite o segundo numero: ");
            segundoNumero = scn.nextDouble();

            System.out.println("Selecione uma operacao: ");
            System.out.println("+ : soma");
            System.out.println("- : subtracao");
            System.out.println("* : multiplicacao");
            System.out.println("/ : divisao");
            operacao = scn.next().charAt(0);

            switch (operacao) {
                case '+':
                    resultado = primeiroNumero + segundoNumero;
                    break;

                case '-':
                    resultado = primeiroNumero - segundoNumero;
                    break;

                case '*':
                    resultado = primeiroNumero * segundoNumero;
                    break;

                case '/':
                    resultado = primeiroNumero / segundoNumero;
                    break;
                case 's':
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Operacao invalida");
                    break;

            }

            System.out.println("O resultado eh: " + resultado);

            System.out.println("");

            System.out.println("Deseja realizar outra operacao? s - sim, digite qualquer coisa para sair");
            escolhaSaida = scn.next().charAt(0);
        

        }while(escolhaSaida == 's');
    }
}
