// 11. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele 
// efetuadas. Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o salário final do vendedor.

import javax.swing.JOptionPane;

public class Exerc11 {
    public static void main(String[] args) {
        int carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de carros vendidos:"));
        double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas:"));
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo do vendedor:"));
        double valorPorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que o vendedor recebe por carro vendido:"));

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (valorVendas * 0.05);

        JOptionPane.showMessageDialog(null, "O salário final do vendedor é: " + salarioFinal);
    }
}
