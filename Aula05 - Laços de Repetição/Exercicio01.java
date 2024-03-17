import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que exibe os primeiros 10 números naturais. Faça versões usando for, while e do/while.
        String resultado = "";
        
        for(int i = 0; i <= 9; i++){
            resultado += i + "\n";
        }
        
        /*int i = 0;
        while (i <= 9) {
            resultado += i + "\n";
            i++;
        }*/

        /*int i = 0;
        do{
            resultado += i + "\n";
            i++; 
        }while(i <= 9);*/

        JOptionPane.showMessageDialog(null, "Os primeiros 10 números naturais são:\n" + resultado);
    }
}