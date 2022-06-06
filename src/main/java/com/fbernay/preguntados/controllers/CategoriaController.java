package com.fbernay.preguntados.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategoriaController {

    @GetMapping("/categorias")
    public ResponseEntity getAllCategorias()  {

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/categorias")
    public ResponseEntity createCategoria()  {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/categorias/{id}")
    public ResponseEntity getCategoria()  {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/categorias/{id}")
    public ResponseEntity deletCategoria()  {

        return new ResponseEntity<>(HttpStatus.OK);
    }




}
