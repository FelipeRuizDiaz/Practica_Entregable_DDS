package org.example;

import java.util.List;
public class Materia {
    private List<Materia> correlativas;

    public boolean cumpleCorrelatividades(Alumno alumno) {
        return this.correlativas.stream().allMatch(alumno::aprobo);
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
