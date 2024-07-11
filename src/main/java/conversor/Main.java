package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        boolean running = true;

        while (running) {
            System.out.println("Selecione um opção:");
            System.out.println("1. Realizar conversão:");
            System.out.println("2. Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Digite a moeda de entrada: \n " +
                            "USD - Dólar Americano \n " +
                            "BRL - Real Brasileiro \n " +
                            "ARS - Peso Argentino \n " +
                            "BOB - Bolivian Boliviano \n " +
                            "CLP - Peso Chileno \n " +
                            "COP - Peso Colombiano");
                    String fromCurrency = scanner.nextLine().toUpperCase();

                    System.out.println("Digite a moeda de Saída: \n " +
                            "USD - Dólar Americano \n " +
                            "BRL - Real Brasileiro \n " +
                            "ARS - Peso Argentino \n " +
                            "BOB - Bolivian Boliviano \n " +
                            "CLP - Peso Chileno \n " +
                            "COP - Peso Colombiano");
                    String toCurrency = scanner.nextLine().toUpperCase();

                    System.out.println("Digite o valor a ser convertido: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    try {
                        ExchangeRateResponse rates = converter.getExchangeRates(fromCurrency);
                        double convertedAmount = converter.convertCurrency(fromCurrency, toCurrency, amount, rates);
                        System.out.println(amount + " " + fromCurrency + " é igual a " + convertedAmount + " " + toCurrency);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro na conversão: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Saindo do Programa.");
                    running = false;
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
