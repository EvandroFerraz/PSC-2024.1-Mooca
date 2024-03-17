import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário (Ex: 4! = 4*3*2*1 = 24).
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}