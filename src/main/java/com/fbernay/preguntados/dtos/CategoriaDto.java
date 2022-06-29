package com.fbernay.preguntados.dtos;

import com.fbernay.preguntados.models.CategoriaModel;
import lombok.Data;

@Data
public class CategoriaDto {
    private String descripcion;
    private String nombre;

    public CategoriaModel toEntity(){
        CategoriaModel categoriaModel = new CategoriaModel();
        categoriaModel.setDescripcion(descripcion);
        categoriaModel.setNombre(nombre);
        return categoriaModel;
    }
}
