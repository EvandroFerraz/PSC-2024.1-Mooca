import javax.swing.JOptionPane;
public class Jogo {
    public static void main(String[] args) {
        // Construtor está criando já um objeto com o nome Joao
        // com 10 de energia, e 0 de fome e de sono.
        Personagem cacador = new Personagem("Joao",10,0,0);

        while(cacador.getEnergia() > 0 && cacador.getSono() < 10 && 
            cacador.getFome() < 10 && cacador.getExperiencia() < 10){

            int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("1- Caçar\n2- Comer\n" + 
                "3- Dormir")
            );
            if(opcao == 1){
                cacador.cacar();
            }else if(opcao == 2){
                cacador.comer();
            }else if(opcao == 3){
                cacador.dormir();
            }else{ // se opcao != 1, 2 e 3
                System.out.println("Digite uma opção válida.");
            }
        }
        if(cacador.getExperiencia() == 10){
            System.out.println("Parabéns, você venceu!!");
        }else{ //experiencia != 10
            System.out.println("Você Perdeu!!");
        }
    }
}
