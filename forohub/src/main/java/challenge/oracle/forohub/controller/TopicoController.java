package challenge.oracle.forohub.controller;

import java.net.URI;
import java.util.*;
import org.springframework.web.util.UriComponentsBuilder;
import challenge.oracle.forohub.dto.DatosRegistroTopico;
import challenge.oracle.forohub.dto.DatosActualizarTopico;
import challenge.oracle.forohub.repository.TopicoRepository;
import challenge.oracle.forohub.model.Topico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    private TopicoRepository topicoRepository;

    @Autowired
    public TopicoController(TopicoRepository topicoRepository){
        this.topicoRepository = topicoRepository;
    }

    @PostMapping
    public ResponseEntity registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico, UriComponentsBuilder uriComponentsBuilder) {
        Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
        DatosRegistroTopico datos = new DatosRegistroTopico(topico);
        URI url = uriComponentsBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(datos);
    }

    @PutMapping
    public ResponseEntity actualizarTopico(@RequestBody DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarTopico(datosActualizarTopico);
        return ResponseEntity.ok(new DatosRegistroTopico(topico));
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerTopicoPorId(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var datosTopico = new DatosRegistroTopico(topico);
        return ResponseEntity.ok(datosTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosRegistroTopico>> obtenerTopicosPage(@PageableDefault(size=2) Pageable paginacion){
        return ResponseEntity.ok(topicoRepository.findByStatusTrue(paginacion).map(DatosRegistroTopico::new));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTopicoLogico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();
        return ResponseEntity.noContent().build();
    }
}