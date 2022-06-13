package com.fbernay.preguntados.repositories;

import com.fbernay.preguntados.models.PreguntaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<PreguntaModel, Long> {


}
