// Dado que o ornitorrinco possui características tanto de mamíferos quanto de ovíparos, uma abordagem
// adequada seria considerá-lo como uma subclasse de ambas as classes Mamifero e Oviparo. 
// Isso é conhecido como herança múltipla, que não é diretamente suportada em Java.
// No entanto, podemos contornar essa limitação usando composição ao invés de herança direta. 
// Em outras palavras, podemos criar uma classe Ornitorrinco que contém instâncias tanto da classe Mamifero 
// quanto da classe Oviparo, e assim ter acesso às características de ambas. Isso permitiria que o ornitorrinco 
// herdasse da classe Mamifero para obter as características relacionadas aos mamíferos e da classe Oviparo.
// Portanto, a classe Ornitorrinco poderia ser definida dessa forma:

public class Ornitorrinco {
    Mamifero mamifero; 
    Oviparo oviparo;

    Ornitorrinco(String nome, int quantidadePatas) {
        mamifero = new Mamifero(nome, quantidadePatas);
        oviparo = new Oviparo(nome, 0); // No caso do ornitorrinco, a quantidade de ovos pode ser 0 ou um valor específico, dependendo da situação
    }

    // Métodos específicos do ornitorrinco podem ser adicionados aqui
}
