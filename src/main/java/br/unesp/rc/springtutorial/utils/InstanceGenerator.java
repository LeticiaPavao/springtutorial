package br.unesp.rc.springtutorial.utils;

import br.unesp.rc.springtutorial.entity.Acesso;
import br.unesp.rc.springtutorial.entity.Contato;
import br.unesp.rc.springtutorial.entity.Endereco;
import br.unesp.rc.springtutorial.entity.Fisica;
import java.util.Date;

public class InstanceGenerator {

    private InstanceGenerator() {

    }

    public static Fisica getPessoaFisica(String cpf, String user) {
        Fisica f = new Fisica();

        f.setCpf(cpf);
        f.setDataNascimento(new Date());
        f.setNome("Juca Chaves");

        Acesso a = new Acesso();
        a.setUsuario(user);
        a.setSenha("deitel");
        f.setAcesso(a);

        Contato c = new Contato();
        c.setTelefoneResidencial("3333-4444");
        c.setTelefoneComercial("3333-5555");
        c.setCelular("98888-7777");

        c.setEmail("juca@chaves.com.br");
        f.setContato(c);

        Endereco e1 = new Endereco();
        e1.setRua("Avenida 24A");
        e1.setNumero(1515);
        e1.setBairro("Bela Vista");
        e1.setCep("13506-900");
        e1.setCidade("Rio Claro");
        e1.setEstado("SP");

        Endereco e2 = new Endereco();
        e2.setRua("Avenida 24A");
        e2.setNumero(2020);
        e2.setBairro("Bela Vista");
        e2.setCep("13506-900");
        e2.setCidade("Rio Claro");
        e2.setEstado("SP");

        Endereco e3 = new Endereco();
        e3.setRua("Avenida 24A");
        e3.setNumero(3030);
        e3.setBairro("Bela Vista");
        e3.setCep("13506-900");
        e3.setCidade("Rio Claro");
        e3.setEstado("SP");

        f.setEndereco(e1);
        f.setEndereco(e2);
        f.setEndereco(e3);

        return f;
    }
}