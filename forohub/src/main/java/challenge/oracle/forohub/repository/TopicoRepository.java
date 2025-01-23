package challenge.oracle.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import challenge.oracle.forohub.model.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByStatusTrue(Pageable paginacion);
}