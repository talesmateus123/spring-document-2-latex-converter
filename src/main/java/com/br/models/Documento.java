package com.br.models;

import java.time.LocalDate;
import java.time.Year;

import com.br.models.enums.TipoTrabalho;
import com.br.models.enums.TituloAcademico;
import com.br.models.pos_textual.ElementosPosTextuais;
import com.br.models.pre_textual.Curso;
import com.br.models.pre_textual.ElementosPreTextuais;
import com.br.models.pre_textual.Instituicao;
import com.br.models.pre_textual.Pessoa;
import com.br.models.textual.ElementosTextuais;

public class Documento {
	private Long id;
	private String titulo;
	private String subTitulo;
	private String title;
	private Pessoa autor;
	private String nomeCidade;
	private Year ano;
	private LocalDate dataAprovacao;
	private Integer tipoTrabalho;
	private Integer tituloAcademico;
	private String areaConcentracao;
	private String linhaPesquisa;
	private Instituicao instituicao;
	private Curso curso;
	private Pessoa orientador;
	private Pessoa coorientador;
	
	private ElementosPreTextuais elementosPreTextuais;
	private ElementosTextuais elementosTextuais;
	private ElementosPosTextuais elementosPosTextuais;
	
	public Documento() {
		this.elementosPreTextuais = new ElementosPreTextuais();
		this.elementosTextuais = new ElementosTextuais();
		this.elementosPosTextuais = new ElementosPosTextuais();
	}
	
	public Documento(Long id, String titulo, String subTitulo, String title, Pessoa autor, String nomeCidade,
			Year ano, LocalDate dataAprovacao, TipoTrabalho tipoTrabalho, TituloAcademico tituloAcademico, String areaConcentracao, 
			String linhaPesquisa, Instituicao instituicao, Curso curso, Pessoa orientador, Pessoa coorientador,
			ElementosPreTextuais elementosPreTextuais, ElementosTextuais elementosTextuais, ElementosPosTextuais elementosPosTextuais) {
		this.id = id;
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.title = title;
		this.autor = autor;
		this.nomeCidade = nomeCidade;
		this.ano = ano;
		this.dataAprovacao = dataAprovacao;
		this.tipoTrabalho = tipoTrabalho != null ? tipoTrabalho.getCod() : null;
		this.tituloAcademico = tituloAcademico != null ? tituloAcademico.getCod() : null;
		this.areaConcentracao = areaConcentracao;
		this.linhaPesquisa = linhaPesquisa;
		this.instituicao = instituicao;
		this.curso = curso;
		this.orientador = orientador;
		this.coorientador = coorientador;
		this.elementosPreTextuais = elementosPreTextuais != null ? elementosPreTextuais : new ElementosPreTextuais();
		this.elementosTextuais = elementosTextuais != null ? elementosTextuais : new ElementosTextuais();
		this.elementosPosTextuais = elementosPosTextuais != null ? elementosPosTextuais : new ElementosPosTextuais();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Pessoa getAutor() {
		return autor;
	}

	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Year getAno() {
		return ano;
	}

	public void setAno(Year ano) {
		this.ano = ano;
	}

	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}

	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}

	public TipoTrabalho getTipoTrabalho() {
		return TipoTrabalho.toEnum(tipoTrabalho);
	}

	public void setTipoTrabalho(TipoTrabalho tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho.getCod();
	}

	public TituloAcademico getTituloAcademico() {
		return TituloAcademico.toEnum(tituloAcademico);
	}

	public void setTituloAcademico(TituloAcademico tituloAcademico) {
		this.tituloAcademico = tituloAcademico.getCod();
	}

	public String getAreaConcentracao() {
		return areaConcentracao;
	}

	public void setAreaConcentracao(String areaConcentracao) {
		this.areaConcentracao = areaConcentracao;
	}

	public String getLinhaPesquisa() {
		return linhaPesquisa;
	}

	public void setLinhaPesquisa(String linhaPesquisa) {
		this.linhaPesquisa = linhaPesquisa;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Pessoa getOrientador() {
		return orientador;
	}

	public void setOrientador(Pessoa orientador) {
		this.orientador = orientador;
	}

	public Pessoa getCoorientador() {
		return coorientador;
	}

	public void setCoorientador(Pessoa coorientador) {
		this.coorientador = coorientador;
	}

	public ElementosPreTextuais getElementosPreTextuais() {
		return elementosPreTextuais;
	}

	public void setElementosPreTextuais(ElementosPreTextuais elementosPreTextuais) {
		this.elementosPreTextuais = elementosPreTextuais;
	}

	public ElementosTextuais getElementosTextuais() {
		return elementosTextuais;
	}

	public void setElementosTextuais(ElementosTextuais elementosTextuais) {
		this.elementosTextuais = elementosTextuais;
	}

	public ElementosPosTextuais getElementosPosTextuais() {
		return elementosPosTextuais;
	}

	public void setElementosPosTextuais(ElementosPosTextuais elementosPosTextuais) {
		this.elementosPosTextuais = elementosPosTextuais;
	}

	@Override
	public String toString() {
		return "Documento [id=" + id + ", titulo=" + titulo + ", subTitulo=" + subTitulo + ", title=" + title
				+ ", autor=" + autor + ", nomeCidade=" + nomeCidade + ", ano=" + ano + ", dataAprovacao="
				+ dataAprovacao + ", tipoTrabalho=" + tipoTrabalho + ", tituloAcademico=" + tituloAcademico
				+ ", areaConcentracao=" + areaConcentracao + ", linhaPesquisa=" + linhaPesquisa + ", instituicao="
				+ instituicao + ", curso=" + curso + ", orientador=" + orientador + ", coorientador1=" + coorientador
				+ ", elementosPreTextuais=" + elementosPreTextuais + ", elementosTextuais=" + elementosTextuais 
				+ ", elementosPosTextuais=" + elementosPosTextuais + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
