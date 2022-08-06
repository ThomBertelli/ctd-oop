public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        return "ZZZZZZZZ !";
    };

    @Override
    public String movimentar(){
        return "Sobe em árvores!";
    };
}
