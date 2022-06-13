package com.fbernay.preguntados.repositories;
import com.fbernay.preguntados.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


}
