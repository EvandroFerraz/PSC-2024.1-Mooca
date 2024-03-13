import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        // Enunciado: Reimplemente o exercício 1, fazendo com que os valores sejam exibidos em ordem reversa.
        String output = "Primeiros 100 números naturais em ordem decrescente:\n";

        // Usando for
        for (int i = 99; i >= 0; i--) {
            output += i + " ";
        }

        // Usando while
        /*int i = 99;
        while(i >= 0){
          output += i + " ";
          i--;
        }*/

        // Usando do while
        /*int i = 99;
        do{
          output += i + " ";
          i--;
        }(while i >= 0)*/

        JOptionPane.showMessageDialog(null, output);
    }
}
