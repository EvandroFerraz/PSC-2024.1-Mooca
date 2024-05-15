public class TesteImpressora {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        
        // Chamando cada um dos métodos exibir
        impressora.exibir(3.14f);
        impressora.exibir(2.5f, 5.6f);
        impressora.exibir(4.2f, "Hello");
        impressora.exibir("World", 7.8f);
        impressora.exibir("Java", "is", "awesome");
        impressora.exibir(10, 20, "times");
    }
}