package org.example;

import java.util.List;
public class Inscripcion {
    private Alumno alumno;

    private List<Materia> materias;
    public boolean estaAprobada(){
        return this.materias.stream().allMatch(materia->materia.cumpleCorrelatividades(this.alumno));
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
