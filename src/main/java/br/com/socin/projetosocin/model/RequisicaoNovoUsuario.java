package br.com.socin.projetosocin.model;

import javax.validation.constraints.NotBlank;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class RequisicaoNovoUsuario {
	
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String senha;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	

}
