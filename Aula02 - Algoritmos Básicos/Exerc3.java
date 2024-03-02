// 3. Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e quantidade vendida.

import javax.swing.JOptionPane;

public class Exerc3{
  public static void main(String[] args){
        // Ler o preço unitario das peças e a quantidade de peças vendidas
        double precoUnitario =  Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitario: "));
        double quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida: "));
    
        // Calcula a comissão, calculanto 5% do total de vendas
        // Assim como na matemática, os cálculos escritos entre parenteses serão realizados primeiro
        double comissao = (precoUnitario*quantidadeVendida)*0.05;

        // Imprime a comissão do vendedor
        JOptionPane.showMessageDialog(null, "A comissão do vendedor foi de " + comissao);
  }
}


