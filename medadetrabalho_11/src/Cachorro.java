public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        return "Au au !";
    };

    @Override
    public String movimentar(){
        return "Corre!";
    };

}
