package com.fbernay.preguntados.models;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Respuestas")
public class Respuesta {
   @Id
   @Column(name = "respuestaId", nullable = false)
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long respuestaId;
   private boolean esCorrecta;
   private String texto;

}
