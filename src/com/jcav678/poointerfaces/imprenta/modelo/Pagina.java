package com.jcav678.poointerfaces.imprenta.modelo;

public class Pagina extends  Hoja implements IImprimible{
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
