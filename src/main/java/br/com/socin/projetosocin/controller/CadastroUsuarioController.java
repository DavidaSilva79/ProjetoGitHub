package br.com.socin.projetosocin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.socin.projetosocin.model.RequisicaoNovoUsuario;
import br.com.socin.projetosocin.model.Usuario;
import br.com.socin.projetosocin.repository.UsuarioRepository;


@Controller
public class CadastroUsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("cadastro")
	public String cadastro() {

		return "cadastro";
	}

	@GetMapping("novo")
	public String novo(RequisicaoNovoUsuario req) {

		System.out.println(req.getNome());

		Usuario usuario = new Usuario();
		usuario.setLogin(req.getNome());
		usuario.setNomeCompleto(req.getNome());
		usuario.setSenha(new BCryptPasswordEncoder().encode(req.getSenha()));
		

		usuarioRepository.save(usuario);

		System.out.println(usuario);
		
		

		return "hello";
	}

}
