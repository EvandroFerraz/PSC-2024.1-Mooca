// 5. Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.

import javax.swing.JOptionPane;

public class Exerc5{
  public static void main(String[] args){
        // Ler a base e a altura
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        // Calcular a área (área = base * altura)
        double area = base * altura;
        
        // Imprimir o resultado
        JOptionPane.showMessageDialog(null, "A área do retângulo é " + area);
  }
}
