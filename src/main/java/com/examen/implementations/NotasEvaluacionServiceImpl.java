package com.examen.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.examen.models.NotasEvaluacion;
import com.examen.services.NotasEvaluacionService;

@Component
public class NotasEvaluacionServiceImpl implements NotasEvaluacionService {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void insertarNota(NotasEvaluacion nota) {
		entityManager.persist(nota);
	}

	@Override
	public List<NotasEvaluacion> buscarTodasLasNotas() {
		return entityManager.createQuery("SELECT notasEvaluaciones FROM NotasEvaluacion notasEvaluaciones").getResultList();
	}
	
	
	
}
