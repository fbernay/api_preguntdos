package com.fbernay.preguntados.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Preguntas")
public class PreguntaModel {

    @Id
    @Column(name = "preguntaId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preguntaId;

    @ManyToOne
    @JoinColumn(name = "categoriaId")
    private Categoria categoriaId;

    private String enunciado;

    @ManyToOne
    @JoinColumn(name = "respuestaId")
    private Respuesta opciones;

}
