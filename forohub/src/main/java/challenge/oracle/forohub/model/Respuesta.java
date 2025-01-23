package challenge.oracle.forohub.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import challenge.oracle.forohub.model.Usuario;
import challenge.oracle.forohub.model.Topico;

@Table(name="respuesta")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario autor;
    private LocalDate fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "topico_id", nullable = false)
    private Topico solucion;
}