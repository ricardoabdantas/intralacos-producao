package com.lacosdaalegria.intralacos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lacosdaalegria.intralacos.model.ongs.Polo;

@Entity
@Table
@DynamicUpdate
public class Regiao{
	
	private Long id;
	private String nome;
	private Integer status = 1;
	private Polo polo;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	@NotEmpty
	public String getNome() {
		return nome;
	}
	
	@NotNull
	public Integer getStatus() {
		return status;
	}
	@JsonIgnore
	@ManyToOne
	public Polo getPolo() {
		return polo;
	}

	public void setPolo(Polo polo) {
		this.polo = polo;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
