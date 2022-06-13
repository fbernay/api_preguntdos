package com.fbernay.preguntados.controllers;
import com.fbernay.preguntados.models.PreguntaModel;
import com.fbernay.preguntados.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PreguntaController {

    private PreguntaService preguntaService;

    @Autowired
    public PreguntaController(
            PreguntaService preguntaService)
    {
        this.preguntaService = preguntaService;
    }

    @GetMapping("/preguntas")
    public ArrayList<PreguntaModel> getAllPreguntas()  {
       return preguntaService.obtenerpreguntas();
    }

    @PostMapping("/preguntas")
    public PreguntaModel createPregunta(@RequestBody PreguntaModel pregunta)  {
        return this.preguntaService.crearPregunta(pregunta);
    }

    @GetMapping("/preguntas/{id}")
    public Optional<PreguntaModel> getPregunta(@PathVariable Long id)  {
        return preguntaService.obtenerPreguntaPorId(id);
    }

    @DeleteMapping("/preguntas/{id}")
    public void borrarPregunta(Long id){
        preguntaService.borrarPregunta(id);
    }

}
