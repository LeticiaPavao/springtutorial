package br.unesp.rc.springtutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unesp.rc.springtutorial.entity.Fisica;

public interface FisicaRepository extends JpaRepository<Fisica, Long> {

    Fisica findByCpf(String cpf);
}
