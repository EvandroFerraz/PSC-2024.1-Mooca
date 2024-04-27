import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args){
        List <Musica> musicas = new ArrayList <> ();
        int opcao;
        do{
            opcao = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "0 - Sair\n 1- Inserir \n" +
                    "2 - Avaliar\n 3- Visualizar"
                )
            );
            switch(opcao){
                case 1:
                    // inserir nova musica na lista
                    String musicaInserir = 
                        JOptionPane.showInputDialog(
                            "Digite o título da música:"
                        );
                    musicas.add(new Musica(musicaInserir));
                    JOptionPane.showMessageDialog(null,
                    "Música inserida com sucesso!!");
                    break;
                case 2:
                    // avaliar uma musica ja na lista
                    String musicaAvaliar = 
                        JOptionPane.showInputDialog(
                            "Digite o título da música que " +
                            " que deseja avaliar:"
                        );
                    int nota = Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Digite uma nota para a música:"
                        )
                    );
                    for(int i = 0; i < musicas.size(); i++){
                        if(musicas.get(i).getTitulo()
                        .equals(musicaAvaliar)){
                            musicas.get(i).setAvaliacao(nota);
                            break;
                        }
                    }

                    break;
                case 3:
                    // order e mostrar a lista
                    Collections.sort(musicas, 
                        Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,
                    "Até mais!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                    "Opção digitada inválida!!");
                    break;
            }
        }while(opcao != 0);
    }
}
