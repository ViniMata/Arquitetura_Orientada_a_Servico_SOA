package org.example.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.example.model.DivisaoResponse;
import org.example.model.MultiplicaçãoResponse;
import org.example.model.SomaResponse;
import org.example.model.SubtrairResponse;

@WebService
public class CalculadoraService {
    @WebMethod
    public SomaResponse somar(
            // @WebParam define explicitamente o nome do campo no XML
            @WebParam(name = "numero1") int numero1,
            @WebParam(name = "numero2") int numero2
    ) {
        int resultado = numero1 + numero2;
        return new SomaResponse(resultado);
    }
    @WebMethod
    public SubtrairResponse substrair(
            @WebParam(name = "numero1") int numero1,
            @WebParam(name = "numero2") int numero2
    ) {
        int resultado = numero1 - numero2;
        return new SubtrairResponse(resultado);
    }
    @WebMethod
    public MultiplicaçãoResponse multiplicar(
            @WebParam(name = "numero1") int numero1,
            @WebParam(name = "numero2") int numero2
    ) {
        int resultado = numero1 * numero2;
        return new MultiplicaçãoResponse(resultado);
    }
    @WebMethod
    public DivisaoResponse dividir(
            @WebParam(name = "numero1") int numero1,
            @WebParam(name = "numero2") int numero2
    ) {
        int resultado = numero1 / numero2;
        return new DivisaoResponse(resultado);
    }
}
