package domain;

import junit.framework.Assert;
import org.example.Alumno;
import org.example.Inscripcion;
import org.example.Materia;
import org.junit.Test;

import java.util.List;

public class TestInscripciones {
    Alumno felipe = new Alumno();
    Materia dds = new Materia();
    Materia operativos = new Materia();
    @Test
    public void InsripcionAprobada(){
        operativos.setCorrelativas((List<Materia>) dds);
        felipe.setMateriasAprobadas((List<Materia>) dds);
        Inscripcion inscripcionDeFelipe = new Inscripcion();
        inscripcionDeFelipe.setAlumno(felipe);
        inscripcionDeFelipe.setMaterias((List<Materia>) operativos);

        Assert.assertTrue(inscripcionDeFelipe.estaAprobada());
    }

    public void InsripcionNoAprobada(){
        operativos.setCorrelativas((List<Materia>) dds);
        Inscripcion inscripcionDeFelipe = new Inscripcion();
        inscripcionDeFelipe.setAlumno(felipe);
        inscripcionDeFelipe.setMaterias((List<Materia>) operativos);

        Assert.assertFalse(inscripcionDeFelipe.estaAprobada());
    }
}
