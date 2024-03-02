// 1. Ler a cotacao do dolar e a quantidade de dolares. Converter para real e mostrar o resultado.

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args) {
        // Ler a cotacao do dolar
        double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotacao do dolar:"));
        
        // Ler a quantidade de dÃ³lares
        double quantidadeDolares = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dolares:"));
        
        // Calcular o valor em reais
        double valorEmReais = quantidadeDolares * cotacaoDolar;
        
        // Mostrar o resultado
        JOptionPane.showMessageDialog(null, "O valor em reais e: R$" + valorEmReais);
    }
}
