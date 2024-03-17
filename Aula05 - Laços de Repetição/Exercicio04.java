import javax.swing.JOptionPane;

public class Exercicio04{
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que exibe a tabuada de todos os números entre 1 e 3.
        String resultado = "";
        for (int i = 1; i <= 3; i++) {
            resultado += "Tabuada do " + i + ":\n";
            for (int j = 1; j <= 10; j++) {
                resultado += i + " x " + j + " = " + (i * j) + "\n";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}