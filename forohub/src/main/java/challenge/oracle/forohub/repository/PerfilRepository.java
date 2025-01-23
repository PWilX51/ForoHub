package challenge.oracle.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import challenge.oracle.forohub.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}