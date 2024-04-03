package org.example;

import java.util.List;
import java.util.ArrayList;
public class Alumno {
    private List<Materia> materiasAprobadas;

    public boolean aprobo (Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }


    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
