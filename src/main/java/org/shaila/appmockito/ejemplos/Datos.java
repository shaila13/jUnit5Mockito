package org.shaila.appmockito.ejemplos;

import org.shaila.appmockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {

    public final static List<Examen> EXAMENES = Arrays.asList(new Examen(5L,"Matemáticas"),new Examen(6L,"Francés"),new Examen(7L,"Historia") );
    public final static List<String> PREGUNTAS = Arrays.asList("aritmética","integrales",
            "derivadas", "trigonometría", "geometría");
    public final static Examen EXAMEN = new Examen(null, "Física");

    public final static List<Examen> EXAMENES_ID_NULL = Arrays.asList(new Examen(null,"Matemáticas"),new Examen(null,"Francés"),new Examen(null,"Historia") );
    public final static List<Examen> EXAMENES_ID_NEGATIVOS = Arrays.asList(new Examen(-5L, "Matemáticas"),
            new Examen(-6L, "Lenguaje"),
            new Examen(null, "Historia"));
}
