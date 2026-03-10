package service;
import domain.Pessoa;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.exemplo.ICadastroService")
public class CadastroService implements ICadastroService{
    List listaPessoas = new ArrayList<>();
    @Override
    public void cadastrarPessoa(String nome, int idade){
        Pessoa pessoa = new Pessoa(nome, idade);
        System.out.println(pessoa.getId());
        listaPessoas.add(pessoa);
    }

    @Override
    public void buscaId(int id) {
        return (listaPessoas.get())
    }
}
