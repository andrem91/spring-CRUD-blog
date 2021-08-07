package blog.universocervejeiro.universoCervejeiro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.universocervejeiro.universoCervejeiro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
