public class Personagem {
    // atributos
    private String nome;
    private int energia, fome, sono;
    
    // métodos
    // Construtor server construir um objeto de uma classe já com
    // valores iniciais em seus atributos
    public Personagem(String nomeInicial, int energiaInicial,
    int fomeInicial, int sonoInicial){
        nome = nomeInicial;
        if(energiaInicial >= 0 && energiaInicial <= 10){
            energia = energiaInicial;
        }
        if(fomeInicial >= 0 && fomeInicial <= 10)
            fome = fomeInicial;
        if(sonoInicial >= 0 && sonoInicial <= 10)
            sono = sonoInicial;
    }

    public void cacar(){
        if(energia >= 2){
            System.out.println(nome + " esta cacando.");
            energia -= 2; // energia = energia - 2 
        }else{// ernegia < 2
            System.out.println(nome + " não tem energia suficiente.");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }
    public void comer(){
        if(fome >= 1){
            System.out.println(nome + " esta comendo.");
            fome--;
            energia = Math.min(energia+1,10);
        }else{ //fome < 1
            System.out.println(nome + " não esta com fome.");
        }
    }

    public void dormir(){
        if(sono >= 1){
            System.out.println(nome + " esta dormindo.");
            sono--; // sono = sono - 1
            energia = Math.min(energia+1,10);
        }else{
            System.out.println(nome + " esta sem sono.");
        }    
    }

    //getters
    // Retornar o valor atual de um atributo
    public String getNome(){
        return nome;
    }
    public int getEnergia(){
        return energia;
    }
    public int getSono() {
        return sono;
    }
    public int getFome() {
        return fome;
    }
    //setters
    //Recebe um valor como parâmetro e atrubui o valor recebido 
    // a um atributo
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public void setEnergia(int novaEnergia){
        energia = novaEnergia;
    }
    public void setSono(int sono) {
        this.sono = sono;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }

}
