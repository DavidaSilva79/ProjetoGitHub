package br.com.socin.projetosocin.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import reactor.core.publisher.Mono;

	
public class UsuariosGitHub {
	
	@Autowired
	private static WebClient webClient;
	
	
	public static String teste() {
	            Mono<String> r = webClient
				.method(HttpMethod.GET)
				.uri("/users/torvalds/followers")
				.retrieve().bodyToMono(String.class);
	 return r.block();
	
	}
	

}
