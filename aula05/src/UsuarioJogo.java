public class UsuarioJogo {

    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;
    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname=nickname;
    }

    public void aumentaPontuacao (int pontuacao){
        this.pontuacao += pontuacao;
        System.out.println( this. nickname + " sua pontuacao é " + this.pontuacao + ".");
    }

    public void subirNivel (int nivel){
        this.nivel += nivel;
        System.out.println( this.nickname + " seu nível é " + this.nivel + ".");
    }

    public void bonus (int valor){
        this.pontuacao+=valor;
        System.out.println(this.nickname + " você recebeu um bonus de " + valor + ". Sua pontuação agora é " + this.pontuacao + ".");
    }

}