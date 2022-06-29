package com.fbernay.preguntados.controllers;

import com.fbernay.preguntados.dtos.CategoriaDto;
import com.fbernay.preguntados.models.CategoriaModel;
import com.fbernay.preguntados.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoriaController {


    private CategoriaService categoriaService;

    @Autowired
    public CategoriaController(
            CategoriaService categoriaService)
    {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public ArrayList<CategoriaModel> getAllCategorias() {

        return this.categoriaService.obtenerCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaModel createCategoria(@RequestBody CategoriaDto categoriaDto) {
        return this.categoriaService.crearCategoria(categoriaDto);
    }

    @GetMapping("/categorias/{id}")
    public Optional<CategoriaModel> getCategoria(@PathVariable("id") Long id) {
      return this.categoriaService.obtenerCategoriaId(id);
    }

    @DeleteMapping("/categorias/{id}")
    public ResponseEntity deletCategoria(@PathVariable("id") Long id) {
    this.categoriaService.borrarCategoria(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }




}
