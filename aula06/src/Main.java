public class Main {
    public static void main(String[] args) {

        Cachorro dog1 = new Cachorro("Viralata",2021,6.5f,true,false,"Totó");

        if(dog1.verificaChip()){
            System.out.println(dog1.getNome() + " tem chip.");
        }else{
            System.out.println(dog1.getNome() + "Não tem chip");
        }

        System.out.println(dog1.getNome() + " tem " + dog1.verificaIdade() + " ano(s).");

        if(dog1.verificaPodeAdotar()){
            System.out.println(dog1.getNome() + " pode ser adotado(a).");
        }else{
            System.out.println(dog1.getNome() + "não pode ser adotado(a) ainda.");
        }

        //-----//

        Cachorro dog2 = new Cachorro("poodle",2019,2.5f,false,true,"Laila");

        if(dog2.verificaChip()){
            System.out.println(dog2.getNome() + " tem chip.");
        }else{
            System.out.println(dog2.getNome() + " não tem chip.");
        }

        System.out.println(dog2.getNome() + " tem " + dog2.verificaIdade() + " ano(s).");

        if(dog2.verificaPodeAdotar()){
            System.out.println(dog2.getNome() + " pode ser adotado(a).");
        }else{
            System.out.println(dog2.getNome() + " não pode ser adotado(a) ainda.");
        }


    }
}