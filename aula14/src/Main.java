import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     Jogador j1 = new Jogador(9,"Ronaldo",true,true);
     Jogador j2 = new Jogador(1,"Marcos",false,true);
     Jogador j3 = new Jogador(5,"Cafu",false,true);
     Jogador j4 = new Jogador(11,"Adriano",false,false);

     ArrayList <Jogador> jogadores = new ArrayList<Jogador>();
     jogadores.add(j1);
     jogadores.add(j2);
     jogadores.add(j3);
     jogadores.add(j4);

     Equipe e1 = new Equipe("Brasil",jogadores);

     e1.mostrarJogadoresTitulares();

     System.out.println(e1.getQuantidadeJogadoresLesionados());


    }
}