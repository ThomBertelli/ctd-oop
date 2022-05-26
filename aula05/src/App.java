public class App {
    public static void main(String[] args) throws Exception {
        

        //Objeto 1
        UsuarioJogo jogador1 = new UsuarioJogo("Thomas", "Thom");

        jogador1.aumentaPontuacao(75);

        jogador1.subirNivel(5);

        jogador1.bonus(77);

        //Objeto 2

        UsuarioJogo jogador2 = new UsuarioJogo("Talyta", "Taly");

        jogador2.aumentaPontuacao(12);

        jogador2.subirNivel(1);

        jogador2.bonus(102);

    }   
}
