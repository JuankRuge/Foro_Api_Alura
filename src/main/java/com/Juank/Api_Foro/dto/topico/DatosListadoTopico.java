package com.Juank.Api_Foro.dto.topico;

import com.Juank.Api_Foro.modelo.Topico;

public record DatosListadoTopico(Long id, String titulo, String mensaje, String autor, String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor().getNombre(),
                topico.getCurso().getNombre());
    }
}
