// 1- Ler um número inteiro e exibir se ele é positivo, negativo ou neutro (0).

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "ExercÃ­cio 1: Verificar se um nÃºmero Ã© positivo, negativo ou neutro");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um nÃºmero inteiro: "));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O nÃºmero Ã© positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O nÃºmero Ã© negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O nÃºmero Ã© neutro.");
        }
    }
}
