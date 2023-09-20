package springbootweb.labdio.repository;

import springbootweb.labdio.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    public void save(Usuario usuario) {
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void update(Usuario usuario) {
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void remove(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }

    public List<Usuario> listAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario finById(Integer id) {
        System.out.printf("GET/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new Usuario("gleyson", "password");
    }
}