/*
Exercício 4: Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário
e então imprime o maior número seguido pelas palavras “é o maior”.
Se os números forem iguais, imprime a mensagem “Estes números são iguais”.
*/

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1 + " é o maior.");
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, numero2 + " é o maior.");
        } else {
            JOptionPane.showMessageDialog(null, "Estes números são iguais.");
        }
    }
}
