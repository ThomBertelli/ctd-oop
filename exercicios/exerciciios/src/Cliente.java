public class Cliente {
    
    private String numeroCliente;

    private String nome;

    private String rg;

    private String cpf;

    public Cliente(String numeroCliente, String nome, String rg, String cpf) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
