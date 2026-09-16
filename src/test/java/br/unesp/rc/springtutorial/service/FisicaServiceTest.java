package br.unesp.rc.springtutorial.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.unesp.rc.springtutorial.entity.Fisica;
import br.unesp.rc.springtutorial.utils.InstanceGenerator;

@SpringBootTest
public class FisicaServiceTest {

    private Fisica entity;

    @Autowired
    private FisicaService fs = new FisicaService();

    //&@Disabled
    @Test
    @DisplayName("FisicaService.save(Fisica)")
    void testSave() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");
        System.out.println(entity);

        Fisica f = fs.save(entity);
        System.out.println("------------------------------------");
        System.out.println(f);
        System.out.println("------------------------------------");

        assertEquals(entity, f);
    }

    //&@Disabled
    @Test
    @DisplayName("FisicaService.findByCpf(cpf)")
    void testFindByCpf() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");

        String cpf = "222.333.444-55";
        Fisica f = fs.findByCpf(cpf);
        System.out.println("----------------------------------------");
        System.out.println("Resultado do findByCPF:");
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        assertEquals(entity, f);
    }

    //&@Disabled
    @Test
    public void testDelete() {
        // ...
    }

    //&@Disabled
    @Test
    public void testUpdate() {
        // ...
    }

    //&@Disabled
    @Test
    @DisplayName("FisicaService.findAll()")
    public void testFindAll() {
        System.out.println("findAll");

        Fisica expResult = null;
        System.out.println("----------------------------------------");
        System.out.println("Resultado do findAll:");
        System.out.println("----------------------------------------");
        List<Fisica> result = fs.findAll();
        for (Fisica f : result) {
            System.out.println("----------------------------------------");
            System.out.println("FISICA: " + f);
            System.out.println("----------------------------------------");
        }
        assertNotEquals(expResult, result);
    }
}
