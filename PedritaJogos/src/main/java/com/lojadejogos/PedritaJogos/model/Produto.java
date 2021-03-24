package com.lojadejogos.PedritaJogos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="tb_Produto")
public class Produto {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min=5,max=50)
    private String nome;

    @NotNull
    @Size(min=5,max=50)
    private String descricao;
    
    @Digits(integer = 5, fraction = 2)
    private double preco;
    
    private boolean disponibilidade;
    
    private String categoriaJogo;
    
    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Produto categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getCategoriaJogo() {
		return categoriaJogo;
	}

	public void setCategoriaJogo(String categoriaJogo) {
		this.categoriaJogo = categoriaJogo;
	}

	public Produto getCategoria() {
		return categoria;
	}

	public void setCategoria(Produto categoria) {
		this.categoria = categoria;
	}

}
