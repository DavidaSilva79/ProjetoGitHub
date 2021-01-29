package br.com.socin.projetosocin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.socin.projetosocin.repository.UsuarioRepository;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;




@SpringBootApplication
public class ProjetosocinApplication {

	
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder
				.baseUrl("https://api.github.com")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
				
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetosocinApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));

	}

}
