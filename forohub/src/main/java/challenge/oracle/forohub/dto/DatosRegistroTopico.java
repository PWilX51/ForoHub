package challenge.oracle.forohub.dto;

import challenge.oracle.forohub.model.Topico;

public record DatosRegistroTopico(
        String titulo,
        String mensaje,
        String fechaDeCreacion,
        Boolean status,
        String autor,
        String curso,
        Integer respuestas) {
    public DatosRegistroTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespuestas());
    }
}