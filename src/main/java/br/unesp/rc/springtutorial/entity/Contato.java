package br.unesp.rc.springtutorial.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "contato")
@Getter 
@Setter
@ToString
@EqualsAndHashCode
public class Contato implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idContato;
    
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato(){
    }
}
