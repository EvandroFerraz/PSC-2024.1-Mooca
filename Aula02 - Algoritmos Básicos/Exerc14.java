//14. Suponha que um aluno tem três notas: A, B e C. Para calcular a média final, seu professor aplica os pesos 2, 3 e 5, respectivamente. Escreva um programa que lê os valores A, B e C e seus 
// respectivos pesos. O programa deve produzir a média ponderada conforme descrito.
  
import javax.swing.JOptionPane;

public class Exerc14 {
    public static void main(String[] args) {
        double notaA = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A:"));
        double notaB = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota B:"));
        double notaC = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota C:"));

        double pesoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota A:"));
        double pesoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota B:"));
        double pesoC = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota C:"));

        double media = (notaA * pesoA + notaB * pesoB + notaC * pesoC) / (pesoA + pesoB + pesoC);

        JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);
    }
}
