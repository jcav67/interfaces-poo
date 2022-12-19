package com.jcav678.poointerfaces.imprenta.modelo;

public interface IImprimible {
    //por defecto el modificador es public, se puede omitir

    //los metodos default son opcionales en las clases hijas y deben tener un cuerpo de implementacion
    //aun asi las clases hijas pueden tener acceso a estos
    default String imprimir(){
        return "Imprimir un valor por defecto";
    }

    //tambien puede tener metodos estaticos
    static void imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
