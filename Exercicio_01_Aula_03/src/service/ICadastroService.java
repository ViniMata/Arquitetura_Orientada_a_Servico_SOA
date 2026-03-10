package service;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface ICadastroService {

    @WebMethod
    void cadastrarPessoa(String nome, int idade);

    @WebMethod
    String buscarPessoa(int id);
}
