package com.fbernay.preguntados.models;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @Column(name = "categoriaId", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long categoriaId;
    private String descripcion;
    private String nombre;

}
