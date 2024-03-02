// 9. Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do novo salário.
import javax.swing.JOptionPane;

public class Exerc9 {
    public static void main(String[] args) {
        double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual:"));
        double percentualReajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste:"));

        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        JOptionPane.showMessageDialog(null, "O novo salário é: " + novoSalario);
    }
}
