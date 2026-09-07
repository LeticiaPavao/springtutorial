package br.unesp.rc.springtutorial.entity;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
public class Fisica extends Pessoa {
    private String cpf;
    private Date dataNascimento;

    public Fisica(){
    }
}
