// 4. Leia um número e imprima seu antecessor

import javax.swing.JOptionPane;

public class Exerc4{
  public static void main(String[] args){
        // Ler o numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        // Imprimir o antecessor
        int antecessor = numero - 1;
        JOptionPane.showMessageDialog(null, "O antecessor é " + antecessor);
  }
}
