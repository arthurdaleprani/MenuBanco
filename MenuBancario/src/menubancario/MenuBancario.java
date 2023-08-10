/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menubancario;

import java.util.Scanner;

public class MenuBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1) Ver saldo");
            System.out.println("2) Sacar dinheiro");
            System.out.println("3) Fazer transferência");
            System.out.println("4) Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: R$");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Opção de transferência ainda não implementada.");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        System.out.println("Obrigado por utilizar nosso serviço!");
        scanner.close();
    }
}
