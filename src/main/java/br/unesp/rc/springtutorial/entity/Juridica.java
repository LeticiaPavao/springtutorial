package br.unesp.rc.springtutorial.entity;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode(callSuper = false)
public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(){
    }
}
