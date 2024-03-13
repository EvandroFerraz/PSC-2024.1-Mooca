import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que verifica se um número natural digitado pelo usuário é primo.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural:"));
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
    }
}
