// 15. Escreva um programa que lê dois valores inteiros A e B e exibe o texto “Soma: “ seguido da soma de A e B. Se A = 2 e B = 3, por exemplo, o programa deve exibir Soma: 5.
import javax.swing.JOptionPane;

public class Exerc15 {
    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));

        int soma = A + B;

        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
