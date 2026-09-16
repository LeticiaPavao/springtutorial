package br.unesp.rc.springtutorial.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PessoaFisica")
@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
public class Fisica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @Column(name = "cpf", unique = true)
    @NotBlank
    @Size(min = 11, max = 14)
    private String cpf;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    public Fisica(){
    }
}
