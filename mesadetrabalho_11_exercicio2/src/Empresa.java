public class Empresa {

    private String nome;

    private String cnpg;

    private Gerente gerente;

    private Secretaria secretaria;

    private Vendedor vendedor;

    public Empresa(String nome, String cnpg, Gerente gerente, Secretaria secretaria, Vendedor vendedor) {
        this.nome = nome;
        this.cnpg = cnpg;
        this.gerente = gerente;
        this.secretaria = secretaria;
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpg='" + cnpg + '\'' +
                ", gerente=" + gerente +
                ", secretaria=" + secretaria +
                ", vendedor=" + vendedor +
                '}';
    }
}
