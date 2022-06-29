package com.fbernay.preguntados.services;

import com.fbernay.preguntados.dtos.PreguntaDto;
import com.fbernay.preguntados.dtos.RespuestaDto;
import com.fbernay.preguntados.models.PreguntaModel;
import com.fbernay.preguntados.models.RespuestaModel;
import com.fbernay.preguntados.repositories.PreguntaRepository;
import com.fbernay.preguntados.repositories.RespuestaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PreguntaService {

    private PreguntaRepository preguntaRepository;
    private RespuestaRepository respuestaRepository;

    public PreguntaService(
            PreguntaRepository preguntaRepository, RespuestaRepository respuestaRepository

            ) {

        this.preguntaRepository = preguntaRepository;
        this.respuestaRepository= respuestaRepository;

    }

    public ArrayList<PreguntaModel> obtenerPreguntas(){
        return (ArrayList<PreguntaModel>) this.preguntaRepository.findAll();
    }

    public PreguntaModel crearPregunta (PreguntaDto preguntaDto){

        for (RespuestaDto respuesta: preguntaDto.getOpciones()) {
            RespuestaModel respuestaModel = new RespuestaModel();

            respuestaModel.setTexto(respuesta.getTexto());
            respuestaModel.setEsCorrecta(respuesta.isEsCorrecta());
            this.respuestaRepository.save(respuestaModel);
        }

        return preguntaRepository.save(preguntaDto.toEntity());
    }

    public Optional<PreguntaModel> obtenerPreguntaPorId(Long id){
        return preguntaRepository.findById(id);
    }

    public void borrarPregunta(Long id){
        preguntaRepository.deleteById(id);
    }



}
