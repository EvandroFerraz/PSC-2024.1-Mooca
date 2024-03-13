/*
15. Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120.
*/

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: "));
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imposto (entre 0 e 1): "));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão: "));

        // Calculando o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Calculando o salário líquido
        double salarioLiquido;
        if (horasTrabalhadas >= 120) {
            salarioLiquido = salarioBruto - (salarioBruto * imposto) + comissao;
        } else {
            salarioLiquido = salarioBruto - (salarioBruto * imposto);
        }

        JOptionPane.showMessageDialog(null, "Salário bruto: " + salarioBruto +
                "\nSalário líquido: " + salarioLiquido);
    }
}
