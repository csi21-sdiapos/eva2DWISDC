package com.examen.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "eva_cat_evaluacion", schema = "sc_evaluacion")
public class Evaluacion {

	/**************************************** ATRIBUTOS ****************************************/
	@Id
	@Column(name = "cod_evaluacion", unique = true, nullable = false, length = 50)
	private String cod_evaluacion;
	
	@Column(name = "desc_evaluacion", unique = false, nullable = false, length = 50)
	private String desc_evaluacion;
	
	// Campos Relacionales
	@OneToMany(mappedBy = "evaluacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // una evaluación tiene muchas notas
	Set<NotasEvaluacion> listaNotasEvaluacion = new HashSet<>();

	
	/**************************************** MÉTODOS ****************************************/
	// Constructor lleno
	public Evaluacion(String cod_evaluacion, String desc_evaluacion) {
		super();
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}

	// Constructor vacío
	public Evaluacion() {
		super();
	}

	
	/************************************* GETTERS Y SETTERS *******************************/
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}

	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}
	
	
	/**************************************** MÉTODOS *****************************************/
	public void añadirNotas(NotasEvaluacion nota) { // el punto de vista de la relación será --> ¿Cuántas notas tiene una evaluaciçon?
        this.listaNotasEvaluacion.add(nota);
	}
	
	
	/**************************************** ToString ****************************************/
	@Override
	public String toString() {
		return "\nEvaluacion [cod_evaluacion=" + cod_evaluacion + ", desc_evaluacion=" + desc_evaluacion + "]";
	}
	
}
