package com.Juank.Api_Foro.dto.curso;

//import com.alura.foro.api.modelo.Curso;

import com.Juank.Api_Foro.modelo.Curso;
public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
