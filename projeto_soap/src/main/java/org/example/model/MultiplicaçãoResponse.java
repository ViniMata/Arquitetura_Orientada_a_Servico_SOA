package org.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MultiplicaçãoResponse {
    private int resultado;
    public MultiplicaçãoResponse() {}
    public MultiplicaçãoResponse(int resultado) {
        this.resultado = resultado;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
