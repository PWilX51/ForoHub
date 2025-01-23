package challenge.oracle.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import challenge.oracle.forohub.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByNombre(String nombre);
}