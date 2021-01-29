package br.com.socin.projetosocin.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.socin.projetosocin.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}