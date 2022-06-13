package com.fbernay.preguntados.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PreguntadosController {


    @GetMapping("/preguntados/next")
    public ResponseEntity traerPreguntaRandom()  {

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/preguntados/verificaciones")
    public ResponseEntity verificarRespuesta()  {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
