package com.joao.dosPasseio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define que esta classe será um controlador.
@RequestMapping("/passeios") // Define o caminho base para todas as rotas nesta classe.
public class PasseioController {
	
	@Autowired // Injeta uma instância do PasseioRepository automaticamente pelo Spring.
	private PasseioRepository passeioRepository;
	
	// Listar todos os passeios
	@GetMapping // Mapeia requisições GET para o caminho "/passeios".
    public List<Passeio> listarPasseios(){
		return passeioRepository.findAll(); // Retorna todos os passeios cadastrados no banco de dados.
    }

	// Criar novo passeio
	@PostMapping //  Mapeia requisições POST para o caminho "/passeios"
	public Passeio criarPasseio(@RequestBody Passeio passeio) {
		return passeioRepository.save(passeio); // Salva o novo passeio no banco e retorna o passeio salvo
	}
	
	// Atualizar o passeio
	
	@PutMapping("/{id}")  // Mapeia requisições PUT para o caminho "/passeios/{id}" (onde {id} é o identificador do passeio a ser atualizado).
	 public Passeio atualizarPasseio(@PathVariable Long id, @RequestBody Passeio passeio) {
		passeio.setId(id);// Derine o id do passeio para que o Spring saiba qual passeio atualizar.
		return passeioRepository.save(passeio); // Salva o passeio atualizado no banco e retorna o mesmo.
	}
	
	// Deletar passeio
	@DeleteMapping("/{id}") // Mapeia requisições DELETE para o caminho "/passeios/{id}".
	public void deletarPasseio(@PathVariable Long id) {
		passeioRepository.deleteById(id); // Deleta o passeio do banco de dados pelo id fornecido.
	}
	
}
