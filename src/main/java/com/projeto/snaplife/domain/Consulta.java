package com.projeto.snaplife.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

@SuppressWarnings("serial")
@Entity
public class Consulta extends GenericDomain {
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataConsulta;
	
	@Length(min = 0, max = 2000, message = "Campo historico social/familiar precisa ter no máximo 2000 caracteres")
	@Column(length = 2000, nullable = true)
	private String historicoSocialFamiliar;
	
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal peso;
	

	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal altura;
	
	
	@Column(nullable = false)
	private Integer idade;
	
	
	@Column(nullable = false)
	private Character sexo;
	
	@Length(min = 0, max = 60, message = "Campo historico estado corporal precisa ter no máximo 60 caracteres")
	@Column(length = 60, nullable = true)
	private String estadoCorporal;
	
	
	@Column(nullable = false, precision = 11, scale = 2)
	private BigDecimal fatorAtividade;
	
	@Column(nullable = false, precision = 11, scale = 2)
	private BigDecimal taxaMB;
	 

	@Length(min = 0, max = 2000, message = "Campo diagnostico precisa ter no máximo 2000 caracteres")
	@Column(length = 2000, nullable = false)
	private String diagnostico;
	

	@Column(nullable = false, precision = 11, scale = 2)
	private BigDecimal gastoEnergTot;

	@ManyToOne
	@JoinColumn(nullable = true) 
	private Cliente cliente;
	
	@Length(min = 0, max = 10000, message = "Campo prescricao precisa ter no máximo 10000 caracteres")
	@Column(length = 10000, nullable = true)
	private String prescricao;
	
	@Length(min = 0, max = 500, message = "Campo objetivo precisa ter no máximo 500 caracteres")
	@Column(length = 500, nullable = true)
	private String objetivo;
	
	@Column(nullable = true, precision = 7, scale = 2)
	private BigDecimal gorduraOfertada;
	
	@Column(nullable = true, precision = 7, scale = 2)
	private BigDecimal carboidratosOfertados;
	
	@Column(nullable = true, precision = 7, scale = 2)
	private BigDecimal proteinasOfertadas;
	 
	@Column(nullable = true, precision = 7, scale = 2)
	private BigDecimal vetValorEnergOfertado;

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHistoricoSocialFamiliar() {
		return historicoSocialFamiliar;
	}

	public void setHistoricoSocialFamiliar(String historicoSocialFamiliar) {
		this.historicoSocialFamiliar = historicoSocialFamiliar;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCorporal() {
		return estadoCorporal;
	}

	public void setEstadoCorporal(String estadoCorporal) {
		this.estadoCorporal = estadoCorporal;
	}

	public BigDecimal getFatorAtividade() {
		return fatorAtividade;
	}

	public void setFatorAtividade(BigDecimal fatorAtividade) {
		this.fatorAtividade = fatorAtividade;
	}

	public BigDecimal getTaxaMB() {
		return taxaMB;
	}

	public void setTaxaMB(BigDecimal taxaMB) {
		this.taxaMB = taxaMB;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public BigDecimal getGastoEnergTot() {
		return gastoEnergTot;
	}

	public void setGastoEnergTot(BigDecimal gastoEnergTot) {
		this.gastoEnergTot = gastoEnergTot;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public BigDecimal getGorduraOfertada() {
		return gorduraOfertada;
	}

	public void setGorduraOfertada(BigDecimal gorduraOfertada) {
		this.gorduraOfertada = gorduraOfertada;
	}

	public BigDecimal getCarboidratosOfertados() {
		return carboidratosOfertados;
	}

	public void setCarboidratosOfertados(BigDecimal carboidratosOfertados) {
		this.carboidratosOfertados = carboidratosOfertados;
	}

	public BigDecimal getProteinasOfertadas() {
		return proteinasOfertadas;
	}

	public void setProteinasOfertadas(BigDecimal proteinasOfertadas) {
		this.proteinasOfertadas = proteinasOfertadas;
	}

	public BigDecimal getVetValorEnergOfertado() {
		return vetValorEnergOfertado;
	}

	public void setVetValorEnergOfertado(BigDecimal vetValorEnergOfertado) {
		this.vetValorEnergOfertado = vetValorEnergOfertado;
	}

	public Consulta(Date dataConsulta,
			@Length(min = 0, max = 2000, message = "Campo historico social/familiar precisa ter no máximo 2000 caracteres") String historicoSocialFamiliar,
			BigDecimal peso, BigDecimal altura, Integer idade, Character sexo,
			@Length(min = 0, max = 60, message = "Campo historico estado corporal precisa ter no máximo 60 caracteres") String estadoCorporal,
			BigDecimal fatorAtividade, BigDecimal taxaMB,
			@Length(min = 0, max = 2000, message = "Campo diagnostico precisa ter no máximo 2000 caracteres") String diagnostico,
			BigDecimal gastoEnergTot, Cliente cliente,
			@Length(min = 0, max = 10000, message = "Campo prescricao precisa ter no máximo 10000 caracteres") String prescricao,
			@Length(min = 0, max = 500, message = "Campo objetivo precisa ter no máximo 500 caracteres") String objetivo,
			BigDecimal gorduraOfertada, BigDecimal carboidratosOfertados, BigDecimal proteinasOfertadas,
			BigDecimal vetValorEnergOfertado) {
		super();
		this.dataConsulta = dataConsulta;
		this.historicoSocialFamiliar = historicoSocialFamiliar;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.sexo = sexo;
		this.estadoCorporal = estadoCorporal;
		this.fatorAtividade = fatorAtividade;
		this.taxaMB = taxaMB;
		this.diagnostico = diagnostico;
		this.gastoEnergTot = gastoEnergTot;
		this.cliente = cliente;
		this.prescricao = prescricao;
		this.objetivo = objetivo;
		this.gorduraOfertada = gorduraOfertada;
		this.carboidratosOfertados = carboidratosOfertados;
		this.proteinasOfertadas = proteinasOfertadas;
		this.vetValorEnergOfertado = vetValorEnergOfertado;
	}

	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
