public class Jogador implements Comparavel {

    private int numCamisa;
    private String name;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numCamisa, String name, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.name = name;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int compareTo(Jogador o){

        return 33;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
