package com.fbernay.preguntados.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Preguntas")
public class PreguntaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pregunta_id")
    private Integer id;

    private String enunciado;

    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Long categoria;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RespuestaModel> opciones = new ArrayList<>();

}
