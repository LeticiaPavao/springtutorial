package br.unesp.rc.springtutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.unesp.rc.springtutorial.entity.Fisica;
import br.unesp.rc.springtutorial.repository.FisicaRepository;

@Component
public class FisicaService {

    @Autowired
    private FisicaRepository repository;

    public FisicaService(){
    }

    public Fisica save(Fisica entity){
        Fisica persistedEntity = null;

        if(repository != null){
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Fisica findByCpf(String cpf){
        Fisica insertedEntity = null;

        if(repository != null){
            insertedEntity = repository.findByCpf(cpf);
        }

        return insertedEntity;
    }

    public void delete(Fisica entity){
        if(repository != null){
            repository.delete(entity);
        }
    }

    public Fisica update(Fisica entity){
        Fisica persistedEntity = null;

        if(repository != null){
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Fisica> findAll(){
        List<Fisica> list = null;

        if(repository != null){
            list = new ArrayList<>();
            list = repository.findAll();
        }

        return list;
    }
    
}
