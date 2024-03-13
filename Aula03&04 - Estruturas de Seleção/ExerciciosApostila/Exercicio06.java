// 6 - Ler um número inteiro e responder se ele é bissexto ou não. Um ano bissexto tem as seguintes características: 1- é múltiplo de quatro e não é múltiplo de 100 OU é múltiplo de 400.

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercício 6: Verificar se um ano é bissexto");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " não é bissexto.");
        }
    }
}
