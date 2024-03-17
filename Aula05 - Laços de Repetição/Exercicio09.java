import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que verifica se um número inteiro digitado pelo usuário é primo (divisível apenas por 1 e por ele mesmo).
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se é primo:"));
        boolean ehPrimo = true;
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        if (ehPrimo) {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
    }
}