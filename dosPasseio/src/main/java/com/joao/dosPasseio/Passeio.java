package com.joao.dosPasseio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
///Entidade
@Entity // DEfine que esta classe é uma entidade do JPA, mapeando para uma tabela no banco.
@Table(name = "passeio") // Define o nome da tabela no banco de dados. 
public class Passeio {

	@Id // Define que este campo será a chave primária da tabela.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor da chave primária será gerado automaticamente pelo banco.
	
	 private Long id; // Atributo que representa o identificador único do passeio

    private String nome;  // Atributo que armazena o nome do passeio.
    private String descricao; // Atributo que armazena a descrição do passeio.
    private BigDecimal preco;// Atributo que armazena o preço do passeio.
    private String duracao; // Atributo que armazena a duração do passeio.
    private String localizacao;// Atributo que armazena a localização do passeio.
    private LocalDateTime dataHorario; // Atributo que armazena a data e horário do passeio.
    private int capacidade;// Atributo que armazena a capacidade de participantes do passeio.
    private Status status;// Atributo que armazena o status do passeio (se está ativo, cancelado ou esgotado)

    public enum Status { //Define os status do passeio.
        ATIVO,
        CANCELADO,
        ESGOTADO
    }

    // Métodos getter e setter para todos os atributos.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public LocalDateTime getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(LocalDateTime dataHorario) {
		this.dataHorario = dataHorario;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    
    
}

