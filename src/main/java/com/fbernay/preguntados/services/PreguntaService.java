package com.fbernay.preguntados.services;

import com.fbernay.preguntados.models.PreguntaModel;
import com.fbernay.preguntados.repositories.PreguntaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PreguntaService {

    private PreguntaRepository preguntaRepository;


    public PreguntaService(PreguntaRepository preguntaRepository) {

        this.preguntaRepository = preguntaRepository;

    }

    public ArrayList<PreguntaModel> obtenerpreguntas(){
        return (ArrayList<PreguntaModel>) this.preguntaRepository.findAll();
    }

    public PreguntaModel crearPregunta (PreguntaModel preguntaModel){
        return preguntaRepository.save(preguntaModel);
    }

    public Optional<PreguntaModel> obtenerPreguntaPorId(Long id){
        return preguntaRepository.findById(id);
    }

    public void borrarPregunta(Long id){
        preguntaRepository.deleteById(id);
    }



}
