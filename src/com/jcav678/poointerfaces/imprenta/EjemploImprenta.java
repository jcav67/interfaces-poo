package com.jcav678.poointerfaces.imprenta;

import com.jcav678.poointerfaces.imprenta.modelo.*;
import static com.jcav678.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Carrera carreraTrabajador = new Carrera("Ing de sistemas");
        Curriculum cv = new Curriculum( new Persona("Camilo","Arango"),carreraTrabajador,"Curriculum vitae");
        Persona autorCV = cv.getPersona();
        autorCV.setRol("Botanico");
        cv.setPersona(autorCV);

        cv.addExperiencia("Java")
                .addExperiencia("Oracle Dba")
                .addExperiencia("Spring Framework")
                .addExperiencia("Fullstack")
                .addExperiencia("Angular");

        Persona autorLibro = new Persona("Andrés","Guzmán","Programador");
        Libro libro = new Libro(autorLibro,"Curso de Java",PROGRAMACION);

        libro.addPagina(new Pagina("POO"))
                .addPagina(new Pagina("Microservicios"))
                .addPagina(new Pagina("Herencia"))
                .addPagina(new Pagina("Interfaces"))
                .addPagina(new Pagina("Multi threads"));

        Persona autor = new Persona("Santiago","Villa","Investigador");
        Persona revisor = new Persona("Carlos","Castro","Profesor");
        Informe informe = new Informe(autor,revisor,"Investigacion PWA");

        IImprimible.imprimir(cv);
        IImprimible.imprimir(informe);
        IImprimible.imprimir(libro);

        IImprimible objImp = new IImprimible() {
            @Override
            public String imprimir() {
                return"Hola que tal imprimiendo un objeto generico";
            }
        };
        IImprimible.imprimir(objImp);

    }
    /*
    public static void imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }*/
}
