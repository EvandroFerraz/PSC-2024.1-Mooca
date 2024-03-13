/*
13. Escreva um programa que lê três números inteiros diferentes e os exibe em ordem crescente.
Se o usuário digitar números iguais, seu programa deve exibir uma mensagem de erro e terminar.
*/

import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro: "));

        // Verificando se os números são diferentes
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            JOptionPane.showMessageDialog(null, "Erro: Os números digitados não são diferentes.");
        } else {
            // Ordenando os números
            int menor, meio, maior;
            if (num1 < num2 && num1 < num3) {
                menor = num1;
                if (num2 < num3) {
                    meio = num2;
                    maior = num3;
                } else {
                    meio = num3;
                    maior = num2;
                }
            } else if (num2 < num1 && num2 < num3) {
                menor = num2;
                if (num1 < num3) {
                    meio = num1;
                    maior = num3;
                } else {
                    meio = num3;
                    maior = num1;
                }
            } else {
                menor = num3;
                if (num1 < num2) {
                    meio = num1;
                    maior = num2;
                } else {
                    meio = num2;
                    maior = num1;
                }
            }

            // Exibindo os números em ordem crescente
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + menor + ", " + meio + ", " + maior);
        }
    }
}
