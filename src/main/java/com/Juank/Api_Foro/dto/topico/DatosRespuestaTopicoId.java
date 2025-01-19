package com.Juank.Api_Foro.dto.topico;

import com.Juank.Api_Foro.dto.curso.DatosRespuestaCurso;
import com.Juank.Api_Foro.dto.usuario.DatosRespuestaUsuario;
import com.Juank.Api_Foro.modelo.Topico;


public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
