package com.fbernay.preguntados.dtos;

import com.fbernay.preguntados.models.PreguntaModel;
import lombok.Data;

import java.util.List;

@Data
public class PreguntaDto {
    private String enunciado;
    private Long categoria;
    private List<RespuestaDto> opciones;

    public PreguntaModel toEntity(){
        PreguntaModel preguntaModel= new PreguntaModel();

        preguntaModel.setEnunciado(enunciado);
        preguntaModel.setCategoria(categoria);
        return preguntaModel;
    }
}
