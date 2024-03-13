/*
Exercício 3: Escreva um programa que faz a leitura de 2 números inteiros.
Caso o primeiro seja maior do que o segundo, o programa imprime “primeiro maior do que o segundo”.
Caso contrário, o programa imprime “segundo maior do que o primeiro”.
*/

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        
        if (num3 > num4) {
            JOptionPane.showMessageDialog(null, "Primeiro é maior do que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "Segundo é maior do que o primeiro.");
        }
    }
}
