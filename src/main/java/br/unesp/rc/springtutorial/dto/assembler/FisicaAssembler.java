package br.unesp.rc.springtutorial.dto.assembler;

import br.unesp.rc.springtutorial.dto.EnderecoDTO;
import br.unesp.rc.springtutorial.dto.FisicaDTO;
import br.unesp.rc.springtutorial.entity.Acesso;
import br.unesp.rc.springtutorial.entity.Contato;
import br.unesp.rc.springtutorial.entity.Endereco;
import br.unesp.rc.springtutorial.entity.Fisica;

public class FisicaAssembler {

    private FisicaAssembler() {
    }
    

    public static Fisica dtoToEntityModel(FisicaDTO dto) {
        Fisica fisica = new Fisica();

        fisica.setNome(dto.getNome());
        fisica.setCpf(dto.getCpf());
        fisica.setDataNascimento(dto.getDataNascimento());
        
        Acesso a = new Acesso();
        a.setUsuario(dto.getUsuario());
        a.setSenha(dto.getSenha());
        fisica.setAcesso(a);

        Contato c = new Contato();
        c.setTelefoneResidencial(dto.getTelefoneResidencial());
        c.setTelefoneComercial(dto.getTelefoneComercial());
        c.setCelular(dto.getTelefoneCelular());
        c.setEmail(dto.getEmail());
        fisica.setContato(c);

        for(EnderecoDTO edto : dto.getEndereco()){
            Endereco e = new Endereco();

            e.setRua(edto.getRua());
            e.setNumero(edto.getNumero());
            e.setBairro(edto.getBairro());
            e.setCep(edto.getCep());
            e.setCidade(edto.getCidade());
            e.setEstado(edto.getEstado());
            fisica.setEndereco(e);
        }
        
        return fisica;
    }
}
