import java.time.LocalDate;

public class Cachorro {
    private String raca;
    private int anoNascimento;
    private float peso;
    private boolean temChip;
    private boolean temFerimento;
    private String nome;

    public Cachorro (String raca, int anoNascimento, float peso, boolean temChip, boolean temFerimento, String nome){
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.temChip = temChip;
        this.temFerimento = temFerimento;
        this.nome = nome;
    }

    public int verificaIdade (){

        return LocalDate.now().getYear() - this.anoNascimento;
    }

    public String getNome() {

        return nome;
    }

    public boolean verificaChip (){

        return this.temChip;
    }

    public boolean verificaPodeAdotar (){

        if (this.peso > 5 && !this.temFerimento){
            return true ;
        }
        return false;
    }

}
