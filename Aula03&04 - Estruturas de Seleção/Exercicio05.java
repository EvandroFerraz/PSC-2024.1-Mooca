/*
Exercício 5: Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o maior desses números.
*/

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro: "));
        
        // Calculando a soma
        int soma = a + b + c;
        
        // Calculando a média
        double media = soma / 3.0;
        
        // Calculando o produto
        int produto = a * b * c;
        
        // Encontrando o menor número
        int menor = a;
        int maior = a;

        // Encontrando o menor número
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        
        // Encontrando o maior número
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        
        // Exibindo os resultados
        JOptionPane.showMessageDialog(null, "Soma: " + soma + "\nMédia: " + media + "\nProduto: " + produto +
                                      "\nMenor: " + menor + "\nMaior: " + maior);
    }
}
