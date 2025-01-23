package challenge.oracle.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import challenge.oracle.forohub.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}