package com.examen.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.examen.models.Evaluacion;
import com.examen.services.EvaluacionService;

@Component
public class EvaluacionServiceImpl implements EvaluacionService {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarEvaluacion(Evaluacion evaluacion) {
		entityManager.persist(evaluacion);
	}

	@Override
	public List<Evaluacion> buscarTodasLasEvaluaciones() {
		return entityManager.createQuery("SELECT evaluaciones FROM Evaluacion evaluaciones").getResultList();
	}

}
