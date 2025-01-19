package com.Juank.Api_Foro.dto.respuesta;

//import com.alura.foro.api.dto.topico.DatosRespuestaTopico;
//import com.alura.foro.api.dto.usuario.DatosRespuestaUsuario;
//import com.alura.foro.api.modelo.Respuesta;

import com.Juank.Api_Foro.dto.topico.DatosRespuestaTopico;
import com.Juank.Api_Foro.dto.usuario.DatosRespuestaUsuario;
import com.Juank.Api_Foro.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
