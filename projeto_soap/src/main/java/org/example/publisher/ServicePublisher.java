package org.example.publisher;

import javax.xml.ws.Endpoint;
import org.example.service.CalculadoraService;
public class ServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/calculadora";
        //Cria um servidor HTTP embutido e publicao serviço
        Endpoint.publish(url, new CalculadoraService());
        System.out.println("SOAP WebService rodando em:");
        System.out.println(url + "?wsdl");
    }
}