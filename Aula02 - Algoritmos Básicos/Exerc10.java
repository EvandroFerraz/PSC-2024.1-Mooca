// 10. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
  
import javax.swing.JOptionPane;

public class Exerc10 {
    public static void main(String[] args) {
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do carro:"));

        double custoFinal = custoFabrica + custoFabrica*0.28 + custoFabrica*0.45;

        JOptionPane.showMessageDialog(null, "O custo final do carro ao consumidor é: " + custoFinal);
    }
}
