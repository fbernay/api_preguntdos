package com.fbernay.preguntados.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Respuestas")
public class RespuestaModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "respuesta_id")

   @JsonIgnore
   private Integer respuestaId;

   private String texto;

   @Column(name = "es_correcta")
   private boolean esCorrecta;

   @ManyToOne
   @JoinColumn(name = "pregunta_id", referencedColumnName = "pregunta_id")

   @JsonIgnore
   private PreguntaModel pregunta;
}
