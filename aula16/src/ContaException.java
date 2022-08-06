public class ContaException extends Exception {

    public ContaException(){
        super();
    }

    public ContaException(String mensagem){
        super(mensagem);
    }

    public String toString(){
        return "A seguinte exceção ocorreu" + this.getClass().getName() +System.lineSeparator() +
                "Mensagem: " + this.getMessage() + System.lineSeparator();
    }

}
