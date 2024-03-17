import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que receba um número e, usando laços de repetição, calcule e mostre a tabuada desse número.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular a tabuada:"));
        String tabuada = "";
        for (int i = 1; i <= 10; i++) {
            tabuada += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Tabuada de " + numero + ":\n" + tabuada);
    }
} 
