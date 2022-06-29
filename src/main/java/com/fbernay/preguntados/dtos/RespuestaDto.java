package com.fbernay.preguntados.dtos;

import lombok.Data;

@Data
public class RespuestaDto {

    private String texto;
    private boolean esCorrecta;
    private PreguntaDto pregunta_id;

}
