package br.unesp.rc.springtutorial.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Pessoa {
    private long idPessoa;
    private String nome;
    private List<Endereco> endereco;
    private Acesso acesso;
    private Contato contato;

    public Pessoa(){
        this.endereco = new ArrayList<>();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }

    
}
