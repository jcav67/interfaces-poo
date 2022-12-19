package com.jcav678.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum  extends Hoja implements  IImprimible{
    private Persona persona;
    private Carrera carrera;
    private List<String> experiencias;

    public Curriculum(Persona persona, Carrera carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String nuevaExperiencia){
        experiencias.add(nuevaExperiencia);
        return this;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre:");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesión ")
                .append(this.carrera.getNombre()).append("\n")
                .append("Experiencias: \n");
        for(String exp:experiencias){
             sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
