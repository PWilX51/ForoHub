package challenge.oracle.forohub.dto;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, Integer respuestas) {
}