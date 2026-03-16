package org.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DivisaoResponse {
    private int resultado;
    private DivisaoResponse() {}
    public DivisaoResponse(int resultado) {
        this.resultado = resultado;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
