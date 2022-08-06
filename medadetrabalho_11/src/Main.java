public class Main {
    public static void main(String[] args) {

        Cavalo pocoto = new Cavalo("Pocotó",20);

        Preguica sid = new Preguica("Sid",100);

        Cachorro toto = new Cachorro("Totó",2);

        Animal animal = new Animal("Animal",120);

        System.out.println(pocoto.getIdade());

        pocoto.setNome("Baio");

        System.out.println(pocoto.getNome());

        System.out.println(pocoto.emitirSom());

        System.out.println(sid.emitirSom());

        System.out.println(toto.movimentar());

        System.out.println(animal.movimentar());

    }
}