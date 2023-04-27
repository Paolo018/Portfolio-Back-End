package portfolio.pablo.security.service;

import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.pablo.security.entity.Usuario;
import portfolio.pablo.security.repository.iUsuarioRepository;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
