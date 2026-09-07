package br.unesp.rc.springtutorial.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
@EqualsAndHashCode
public class Contato {
    private long idContato;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato(){
    }
}
