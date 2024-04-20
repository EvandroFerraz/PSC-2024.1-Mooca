import java.util.*;

import javax.swing.JOptionPane;

public class ListaDeMusicas{
    public static void main(String[] args){
        List <Musica> musicas = new ArrayList<>();
        int opcao;
        do{
            opcao = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "0-Sair\n1-Inserir uma música\n" +
                    "2-Avaliar uma musica\n" +
                    "3-Ver a lista de musicas ordenada."
                )
            );

            switch(opcao){
                case 1:
                    String musicaNova = 
                        JOptionPane.showInputDialog(
                            "Digite a musica nova!!"
                        );
                    musicas.add(new Musica(musicaNova));
                    JOptionPane.showMessageDialog(null,
                    "Música inserida com sucesso");
                    break;
                case 2:
                    // avaliar uma música na lista
                    break;
                case 3:
                    // mostrar a lista ordenada
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,
                    "Até mais");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                    "Opção Inválida!!");
            }
        }while(opcao != 0);
    }
}