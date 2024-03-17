import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        // Enunciado: Reimplemente o exercício 1, fazendo com que os valores sejam exibidos em ordem reversa.
        
        String resultado = "";
        
        for(int i = 9; i >= 0; i--){ //i = i - 1
            resultado += i + "\n";
        }
        
        /*int i = 9;
        while (i >= 0) {
            resultado += i + "\n";
            i--;
        }*/

        /*int i = 9;
        do{
            resultado += i + "\n";
            i--; 
        }while(i >= 0);*/

        JOptionPane.showMessageDialog(null, "Os primeiros 10 números naturais são:\n" + resultado);
    }
}
