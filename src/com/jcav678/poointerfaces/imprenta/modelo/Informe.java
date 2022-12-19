package com.jcav678.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements IImprimible{

    private Persona autor;
    private Persona revisor;

    public Informe(Persona autor,Persona revisor,String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public Persona getRevisor() {
        return revisor;
    }

    public void setRevisor(Persona revisor) {
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: "+autor
                +" Revisado por: "+revisor.getNombre()+" "+revisor.getApellido()
                +"\n"+this.contenido+"\n";
    }
}
