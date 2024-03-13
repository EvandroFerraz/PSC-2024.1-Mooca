import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que exibe os primeiros 100 números naturais. Faça versões usando for, while e do/while.
        String output = "Primeiros 100 números naturais:\n";

        // Usando for
        for (int i = 0; i < 100; i++) {
            output += i + " ";
        }

        // Usando while
        /*int i = 0;
        while(i < 100){
          output += i + " ";
          i++;
        }*/

        // Usando do while
        /*int i = 0;
        do{
          output += i + " ";
          i++;
        }(while i < 100)*/
        
        JOptionPane.showMessageDialog(null, output);
    }
}

