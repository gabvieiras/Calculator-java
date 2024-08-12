import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Operators operator = new Operators();
    Tabuada tabuada = new Tabuada();

    boolean continuar = true;

    while (continuar) {
      int option = 0;
      while (option < 1 || option > 4) {
        System.out.println("____________________________________________________________________________________");
        System.out.println("|================= Faça a escolha de um comando para ser executado ================|");
        System.out.println("| 1 - Calcular o fatorial de um valor digitado:                                    |");
        System.out.println("| 2 - Calcular a raiz quadrada de um valor digitado:                               |");
        System.out.println("| 3 - Imprimir a tabuada completa de 1 ao 10:                                      |");
        System.out.println("| 4 - Sair do programa.                                                            |");
        System.out.println("|__________________________________________________________________________________|");
        System.out.println("Escolha (1, 2, 3, 4):");

        if (s.hasNextInt()) {
          option = s.nextInt();
          if (option < 1 || option > 4) {
            System.out.println("Opção inválida. Por favor, escolha um número inteiro entre 1 e 4. \n");
          }
        } else {
          System.out.println("Opção inválida. Por favor, escolha um número inteiro entre 1 e 4. \n");
          s.next();
        }
      }

      switch (option) {
        case
            1:
          int numFatorial = -1;
          while (numFatorial < 0 || numFatorial > 100) {
            System.out.print(
                "Digite um número inteiro positivo para calcular o fatorial (limite máximo: 100): ");
            if (s.hasNextInt()) {
              numFatorial = s.nextInt();
              if (numFatorial < 0 || numFatorial > 100) {
                System.out.println(
                    "Número inválido. Por favor, digite um número inteiro positivo até 100.");
              }
            } else {
              System.out.println(
                  "Entrada inválida. Por favor, digite um número inteiro positivo até 100.");
              s.next();
            }
          }
          if (numFatorial <= 100) {
            BigInteger resultadoFatorial = operator.getFatorial(numFatorial);
            System.out.println(numFatorial +
                "! = " +
                resultadoFatorial);
          } else {
            System.out.println(
                "Número excede o limite máximo de 100.");
          }
          break;
        case 2:
          double numSqrt = -1;
          while (numSqrt < 0) {
            System.out.print("Digite um número real positivo para calcular a raiz quadrada: ");
            String input = s.next();
            input = input.replace(",",".");
            double inputDouble = Double.parseDouble(input);
            numSqrt = inputDouble;
              if (numSqrt < 0) {
                System.out.println("Número inválido. Por favor, digite um número real positivo.");
              }
            } 
          
          double resultadoSqrt = operator.getSqrt((int) numSqrt);
          System.out.println("Raiz quadrada de "+numSqrt + " = " + resultadoSqrt);
          break;
        case 3:
          tabuada.getTabuada();
          break;
        case 4:
          continuar = false;
          System.out.println("Programa encerrado!");
          break;
      }

      if (continuar) {
        s.nextLine();
        System.out.println("\nDigite 's' para continuar ou qualquer outro caracter para encerrar: ");
        String resposta = s.nextLine();
        if (resposta.isEmpty() || !resposta.equalsIgnoreCase("s")) {
          continuar = false;
          System.out.println("Programa encerrado!");
        }
      }
    }

    s.close();
  }
}
