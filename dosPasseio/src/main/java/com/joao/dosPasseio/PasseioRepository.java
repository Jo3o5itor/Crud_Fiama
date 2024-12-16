package com.joao.dosPasseio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interface é um repositório que será responsável pela comunicação com o banco de dados.
public interface PasseioRepository extends JpaRepository<Passeio,Long>{
	// O JpaRepository fornece métodos prontos para acessar o banco de dados, como salvar, buscar, deletar, etc.
}
