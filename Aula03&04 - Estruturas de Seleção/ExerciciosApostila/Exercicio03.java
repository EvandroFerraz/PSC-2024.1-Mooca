//3 - Ler três valores reais e exibir o maior valor entre eles. Suponha que eles sejam diferentes.

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercício 3: Encontrar o maior valor entre três valores reais");
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        double maiorValor = Math.max(valor1, Math.max(valor2, valor3));
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maiorValor);
    }
}
