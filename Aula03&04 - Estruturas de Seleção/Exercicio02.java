/*
Exercício 2: Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais.
Se forem, o programa deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.
*/

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        }
    }
}
