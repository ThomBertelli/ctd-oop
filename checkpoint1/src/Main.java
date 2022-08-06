import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Plano plano1 = new Plano("Super 50",50,50,75.00);
        Plano plano2 = new Plano("Super 100",100,100,99.90);
        Plano plano3 = new Plano("Super 300",300,300,178.90);

        Endereco pjEndereco1 = new Endereco("Rua das Orcas",45,"Casa","Centro","Marechal Teodoro","89875-457");
        Endereco pjEndereco2 = new Endereco("Deodoro da Fonseca",24,"Apto 1","Canto Alegre","Bonito","45784-154");
        Endereco pjEndereco3 = new Endereco("Mario Quintana",457,"Casa","Freitas","Campos Novos","88457-000");

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.nomeCliente = "Terraplanagem Santos";
        pj1.setEndereco(pjEndereco1);

        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.nomeCliente = "Posto Teixeira";
        pj2.setEndereco(pjEndereco2);

        PessoaJuridica pj3 = new PessoaJuridica();
        pj3.nomeCliente = "Jojô Calçados";
        pj3.setEndereco(pjEndereco3);

        PessoaFisica pf1 = new PessoaFisica();
        pf1.nomeCliente = "Marcos Paulo";
        pf1.email = "marcos@gmail.com";
        pf1.setCpf("554454545");
        System.out.println(pf1.getCpf());

        PessoaFisica pf2 = new PessoaFisica();
        pf2.setEndereco(pjEndereco2);
        System.out.println(pf2.endereco.getLogradouro());

        PessoaFisica pf3 = new PessoaFisica();
        pf3.telefone = "047 98888-8888";
        System.out.println(pf3.telefone);


        Fatura faturaPj1 = new Fatura();
        System.out.println(faturaPj1.geraFatura(pj1.nomeCliente, plano1.getNomePlano(), plano1.getPreco(), LocalDate.of(2022,11,13)));

        Fatura faturaPj2 = new Fatura();
        System.out.println(faturaPj2.geraFatura(pj2.nomeCliente, plano3.getNomePlano(), plano3.getPreco(), LocalDate.of(2022,1,3)));

        Fatura faturaPj3 = new Fatura();
        System.out.println(faturaPj3.geraFatura(pj3.nomeCliente, plano2.getNomePlano(), plano2.getPreco(), LocalDate.of(2022,6,25)));

        Fatura faturaPf1 = new Fatura();
        System.out.println(faturaPf1.geraFatura(pf1.nomeCliente, plano2.getNomePlano(), plano2.getPreco(), LocalDate.of(2022,6,11)));

    }
}