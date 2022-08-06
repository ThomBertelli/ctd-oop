import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Equipe {

    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nome, ArrayList<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador j){

        jogadores.add(j);
    }

    public void mostrarJogadoresTitulares(){

        int i = 0;

        Map jogadoresTitulares = new TreeMap();

        while (i < jogadores.size()){

            if(jogadores.get(i).isTitular()){
                jogadoresTitulares.put(jogadores.get(i).getNumCamisa(),jogadores.get(i).getName());
            }
            i++;
        }

        System.out.println(jogadoresTitulares);

    }

    public int getQuantidadeJogadoresLesionados(){

        int jogadoresLesionados = 0;
        int i = 0;

        while (i < jogadores.size()){

            if(jogadores.get(i).isTitular() && jogadores.get(i).isLesionado()){
                jogadoresLesionados++;
            }
            i++;
        }

        return jogadoresLesionados;
    }



}
