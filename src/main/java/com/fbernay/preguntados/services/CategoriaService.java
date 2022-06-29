package com.fbernay.preguntados.services;

import com.fbernay.preguntados.dtos.CategoriaDto;
import com.fbernay.preguntados.models.CategoriaModel;
import com.fbernay.preguntados.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;


    public CategoriaService(CategoriaRepository categoriaRepository) {

        this.categoriaRepository = categoriaRepository;

    }
    public ArrayList<CategoriaModel> obtenerCategorias(){
        return (ArrayList<CategoriaModel>) categoriaRepository.findAll();
    }

    public CategoriaModel crearCategoria(CategoriaDto categoriaDto) {

      return  categoriaRepository.save(categoriaDto.toEntity());
    }

    public Optional<CategoriaModel> obtenerCategoriaId(Long id) {
        return categoriaRepository.findById(id);
    }

    public boolean borrarCategoria (Long id){

        categoriaRepository.deleteById(id);
        return true;
    }

}
