package com.esig.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "esig")
public class Tarefas implements Serializable {

	private static final long serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;
	
	private String titulo;
	private String descricao;
	private String responsavel;
	private String prioridade;
	private LocalDate deadline;
	private boolean concluido;
	
	public Long getNumero() {return numero;}
	public void setNumero(Long numero) {this.numero = numero;}
	
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	
	public String getResponsavel() {return responsavel;}
	public void setResponsavel(String responsavel) {this.responsavel = responsavel;}
	
	public String getPrioridade() {return prioridade;}
	public void setPrioridade(String prioridade) {this.prioridade = prioridade;}
	
	public LocalDate getDeadline() {return deadline;}
	public void setDeadline(LocalDate deadline) {this.deadline = deadline;}
	
	public boolean isConcluido() {return concluido;}
	public void setConcluido(boolean concluido) {this.concluido = concluido;}
	
	public static long getSerialversionuid() {return serialVersionUID;}
	
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefas other = (Tarefas) obj;
		return Objects.equals(numero, other.numero);
	}
	
	@Override
	public String toString() {
		return "Tarefas [numero=" + numero + "]";
	}
	
	
}
