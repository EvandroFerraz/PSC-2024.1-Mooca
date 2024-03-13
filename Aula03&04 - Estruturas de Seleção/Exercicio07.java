import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {
        /*
        7. Faça um programa que lê um valor real, representando o valor de uma peça de roupa.
        A seguir, o programa deve ler um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
        0 – Compra à vista
        1 – Compra parcelada no cartão
        2 – Crediário

        Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
        Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
        Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
        desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
        Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e terminar.
        */

        double valorRoupa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça de roupa: "));
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a opção desejada:\n" +
                        "0 – Compra à vista\n" +
                        "1 – Compra parcelada no cartão\n" +
                        "2 – Crediário"));

        switch (opcao) {
            case 0:
                double valorDesconto = valorRoupa * 0.1;
                double valorComDesconto = valorRoupa - valorDesconto;
                JOptionPane.showMessageDialog(null, "Valor da peça com 10% de desconto: " + valorComDesconto);
                break;
            case 1:
                int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas desejado: "));
                if (parcelas <= 0) {
                    JOptionPane.showMessageDialog(null, "Número de parcelas inválido.");
                } else {
                    double valorParcela = valorRoupa / parcelas;
                    JOptionPane.showMessageDialog(null, "Valor de cada parcela: " + valorParcela);
                }
                break;
            case 2:
                int parcelasCrediario = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas desejado: "));
                if (parcelasCrediario <= 0) {
                    JOptionPane.showMessageDialog(null, "Número de parcelas inválido.");
                } else {
                    double valorComJuros = valorRoupa * 1.1; // Adicionando 10% de juros
                    double valorParcelaCrediario = valorComJuros / parcelasCrediario;
                    JOptionPane.showMessageDialog(null, "Valor de cada parcela no crediário: " + valorParcelaCrediario);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }
}
