public class Jogo{
    public static void main(String[] args){
        Personagem cacador = new Personagem("Joao",10,0,0);
        cacador.cacar();
        cacador.comer();
        cacador.dormir();
        cacador.setNome("Maria");
        cacador.cacar();
    }
}