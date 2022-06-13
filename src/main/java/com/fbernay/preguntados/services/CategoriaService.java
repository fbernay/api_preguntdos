package com.fbernay.preguntados.services;

import com.fbernay.preguntados.models.Categoria;
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
    public ArrayList<Categoria> obtenerCategorias(){
        return (ArrayList<Categoria>) categoriaRepository.findAll();
    }

    public Categoria crearCategoria(Categoria categoria) {
      return  categoriaRepository.save(categoria);
    }

    public Optional<Categoria> obtenerCategoriaId(Long id) {
        return categoriaRepository.findById(id);
    }

    public boolean borrarCategoria (Long id){

        categoriaRepository.deleteById(id);
        return true;
    }

}
