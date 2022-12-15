package com.examen.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eva_tch_notas_evaluacion", schema = "sc_evaluacion")
public class NotasEvaluacion implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	/**************************************** ATRIBUTOS ****************************************/
	@Column(name = "md_uuid", unique = false, nullable = true, length = 50)
	private String md_uuid;
	
	@Column(name = "md_fch", unique = false, nullable = true)
	private Date md_fch;
	
	@Id
	@Column(name = "id_nota_evaluacion", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_nota_evaluacion;
	
	@Column(name = "cod_alumno", unique = false, nullable = false, length = 100)
	private String cod_alumno;
	
	@Column(name = "nota_evaluacion", unique = false, nullable = false)
	private int nota_evaluacion;
	
	@Column(name = "cod_evaluacion", unique = true, nullable = false, length = 50)
	private String cod_evaluacion;
	
	// Campos Relacionales
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // muchas notas tienen una evaluación
	//@JoinColumn(name = "cod_evaluacion")
	Evaluacion evaluacion;
	
	
	/**************************************** MÉTODOS ****************************************/
	// Constructor lleno
	public NotasEvaluacion(String md_uuid, Date md_fch, int id_nota_evaluacion, String cod_alumno, int nota_evaluacion,
			String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_nota_evaluacion = id_nota_evaluacion;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}

	// Constructor vacío
	public NotasEvaluacion() {
		super();
	}

	// Constructor sin el id (ya que el id será autoincremental)
	public NotasEvaluacion(String md_uuid, Date md_fch, String cod_alumno, int nota_evaluacion, String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}

	// Constructor sin el md_uuid, md_fch, id
	public NotasEvaluacion(String cod_alumno, int nota_evaluacion, String cod_evaluacion) {
		super();
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}

	/**************************************** GETTERS Y SETTERS ****************************************/
	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Date getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Date md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}

	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public int getNota_evaluacion() {
		return nota_evaluacion;
	}

	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	/**************************************** MÉTODOS *****************************************/
	

	
	/**************************************** ToString ****************************************/
	@Override
	public String toString() {
		return "\nNotasEvaluacion [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_nota_evaluacion="
				+ id_nota_evaluacion + ", cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaluacion
				+ ", cod_evaluacion=" + cod_evaluacion + "]";
	}
}
