// 16. Faça um programa que lê um número inteiro e calcula o menor número de notas suficiente para representar tal valor. Considere a existência de notas de valores 200, 100, 50, 20, 10, 5, 
// 2 e 1. Por exemplo, se o valor lido for 643, esse valor pode ser representado por:
// - 3 notas de 200
// - 2 notas de 20
// - 1 nota de 2
// - 1 nota de 1
// Assim, seu programa deve exibir o texto “7 notas”. Dica: Use os operadores / e %.

import javax.swing.JOptionPane;

public class Exerc16 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));

        int notas200 = valor / 200;
        valor %= 200; // código equivalente à valor = valor % 200

        int notas100 = valor / 100;
        valor %= 100;

        int notas50 = valor / 50;
        valor %= 50;

        int notas20 = valor / 20;
        valor %= 20;

        int notas10 = valor / 10;
        valor %= 10;

        int notas5 = valor / 5;
        valor %= 5;

        int notas2 = valor / 2;
        valor %= 2;

        int notas1 = valor;

        int totalNotas = notas200 + notas100 + notas50 + notas20 + notas10 + notas5 + notas2 + notas1;

        JOptionPane.showMessageDialog(null, "O menor número de notas é: " + totalNotas);
    }
}
