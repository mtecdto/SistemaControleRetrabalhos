package com.api.retrabalhos.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="retrabalho")
public class RetrabalhoEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="pv")
	@NotNull
	@Size(min=4,max=15)
	private long pv;
	
	@Column(name="modelo")
	@NotBlank
	@Size(min=2,max=30)
	private String modelo;
	
	@Column(name="sistemaoperacional")
	private String sistemaoperacional;
	
	@Column(name="memoria")
	@Size(min=1,max=4)
	private long memoria;
	
	@Column(name="disco")
	@Size(min=1,max=5)
	private long disco;
	
	@Column(name="datainicio")
	private String dataInicio;
	
	@Column(name="horainicio")
	private String horaInicio;
	
	@Column(name="datafinal")
	private String dataFinal;
	
	@Column(name="horafinal")
	private String horaFinal;
	
	@ManyToOne
	private UsuarioEntity usuarioEntity;

	public long getPv() {
		return pv;
	}

	public void setPv(long pv) {
		this.pv = pv;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaoperacional() {
		return sistemaoperacional;
	}

	public void setSistemaoperacional(String sistemaoperacional) {
		this.sistemaoperacional = sistemaoperacional;
	}

	public long getMemoria() {
		return memoria;
	}

	public void setMemoria(long memoria) {
		this.memoria = memoria;
	}

	public long getDisco() {
		return disco;
	}

	public void setDisco(long disco) {
		this.disco = disco;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public UsuarioEntity getUsuarioEntity() {
		return usuarioEntity;
	}

	public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataFinal, dataInicio, disco, horaFinal, horaInicio, id, memoria, modelo, pv,
				sistemaoperacional, usuarioEntity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetrabalhoEntity other = (RetrabalhoEntity) obj;
		return Objects.equals(dataFinal, other.dataFinal) && Objects.equals(dataInicio, other.dataInicio)
				&& disco == other.disco && Objects.equals(horaFinal, other.horaFinal)
				&& Objects.equals(horaInicio, other.horaInicio) && id == other.id && memoria == other.memoria
				&& Objects.equals(modelo, other.modelo) && pv == other.pv
				&& Objects.equals(sistemaoperacional, other.sistemaoperacional)
				&& Objects.equals(usuarioEntity, other.usuarioEntity);
	}
	
}
