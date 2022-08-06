public class Main {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("José","Silva","45555566414","jose@jose","444444");

        Vendedor vendedor1 = new Vendedor("Carlos","Morais","45547841741","carlos@carlos","4457778777");

        Secretaria secretaria1 = new Secretaria("Marta","Carvalho","5644645647","marta@marta","4545857545");

        Empresa empresa = new Empresa("Multiplus Móveis","555451145444",gerente1,secretaria1,vendedor1);

        System.out.println(empresa);


    }
}