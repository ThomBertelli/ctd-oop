public class Plano {

    private String nomePlano;

    private int velocidadeDownload;

    private int velocidadeUpload;

    private double preco;

    public Plano(String nomePlano, int velocidadeDownload, int velocidadeUpload, double preco) {
        this.nomePlano = nomePlano;
        this.velocidadeDownload = velocidadeDownload;
        this.velocidadeUpload = velocidadeUpload;
        this.preco = preco;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public int getVelocidadeDownload() {
        return velocidadeDownload;
    }

    public void setVelocidadeDownload(int velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }

    public int getVelocidadeUpload() {
        return velocidadeUpload;
    }

    public void setVelocidadeUpload(int velocidadeUpload) {
        this.velocidadeUpload = velocidadeUpload;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
